package services;

import loginData.LoginData;
import phonesData.*;

import java.util.ArrayList;
import java.util.Scanner;

public class RepairmanService {
    Scanner scanner = new Scanner(System.in);

    LoginData loginData = new LoginData();

    public void showMenu() {
        System.out.println("Greetings dear Repairman!\n" +
                "Please dial the menu number to work with the program, if you are finished, then dial 7:\n" +
                "   1. Make repairs\n" +
                "   2. Change the detail\n" +
                "   3. Serve phone\n" +
                "   4. Order the detail\n" +
                "   5. View the list of ordered details\n" +
                "   6. Remove the ordered detail:\n" +
                "   7. Exit\n");
    }
    public void serveRepairman() {
        System.out.print("Please enter your password: ");
        String enteredPassword = scanner.next();
        while(!enteredPassword.equals(loginData.repairPassword)) {
            System.out.print("\033[H\033[2J");
            System.out.println("Entered password is incorrect! Please try again");
            System.out.print("Please enter your password: ");
            enteredPassword = scanner.next();
        }
        System.out.print("\033[H\033[2J");
        showMenu();
        System.out.print("Enter the menu number: ");
        int choosenOption = scanner.nextInt();
        System.out.print("\033[H\033[2J");
        if(choosenOption == 1) {
            RepairNeeded repairNeeded = new RepairNeeded();
            /*only to show how code works*/
            repairNeeded.option = "Repair display";
            repairNeeded.price = 50;
            repairNeeded.repairNeededs.add(repairNeeded);
            repairNeeded.option = "Repair keyboard";
            repairNeeded.price = 25;
            repairNeeded.repairNeededs.add(repairNeeded);
            /*only to show how code works*/
            repairNeeded.showRepairNeededData();
            System.out.println("Which of the proposed equipment would you like to repair?");
            int choosenEquipment = scanner.nextInt();
            System.out.print("\033[H\033[2J");
            repairNeeded.deleteEquipment(choosenEquipment);
            repairNeeded.showRepairNeededData();
        }
        else if(choosenOption == 2) {
            ChangeNeeded changeNeeded = new ChangeNeeded();
            changeNeeded.showChangeNeededData();
            /*only to show how code works*/
            changeNeeded.option = "Change battery";
            changeNeeded.price = 15;
            changeNeeded.changeNeededs.add(changeNeeded);
            changeNeeded.option = "Change display";
            changeNeeded.price = 40;
            changeNeeded.changeNeededs.add(changeNeeded);
            /*only to show how code works*/
            changeNeeded.showChangeNeededData();
            System.out.println("For which of the proposed techniques would you like to change detail? : ");
            int choosenEquipment = scanner.nextInt();
            System.out.print("\033[H\033[2J");
            changeNeeded.deleteEquipment(choosenEquipment);
            changeNeeded.showChangeNeededData();
        }
        else if(choosenOption == 3) {
            ServiceNeeded serviceNeeded = new ServiceNeeded();
            serviceNeeded.showServiceNeededData();
            /*only to show how code works*/
            serviceNeeded.option = "Dust cleaning";
            serviceNeeded.price = 5;
            serviceNeeded.serviceNeededs.add(serviceNeeded);
            /*only to show how code works*/
            serviceNeeded.showServiceNeededData();
            System.out.println("Which of the proposed equipments would you like to serve?");
            int choosenEquipment = scanner.nextInt();
            System.out.print("\033[H\033[2J");
            serviceNeeded.deleteEquipment(choosenEquipment);
            serviceNeeded.showServiceNeededData();
        }
        else if(choosenOption == 4) {
            DetailOrdered detailOrdered = new DetailOrdered();
            System.out.print("Please write which detail you would like to order: ");
            detailOrdered.detailName = scanner.next();
            System.out.println("Please enter number of details: ");
            detailOrdered.detailsNumber = scanner.nextInt();
            System.out.print("\033[H\033[2J");
            detailOrdered.detailsOrdered.add(detailOrdered);
            detailOrdered.showOrderList();
        }
        else if(choosenOption == 5) {
            DetailOrdered detailOrdered = new DetailOrdered();
            /*only to show how code works*/
            detailOrdered.detailName = "Battery";
            detailOrdered.detailsOrdered.add(detailOrdered);
            /*only to show how code works*/
            detailOrdered.showOrderList();
        }
        else if(choosenOption == 6) {
            DetailOrdered detailOrdered = new DetailOrdered();
            /*only to show how code works*/
            detailOrdered.detailName = "Battery";
            detailOrdered.detailsOrdered.add(detailOrdered);
            /*only to show how code works*/
            detailOrdered.showOrderList();
            System.out.println("Which order would you like to remove?");
            int choosenEquipment = scanner.nextInt();
            System.out.print("\033[H\033[2J");
            detailOrdered.removeOrder(choosenEquipment);
            detailOrdered.showOrderList();
        }
        else {
            System.out.println("You have left the Menu!");
        }
    }

}
