package services;

import loginData.LoginData;
import phonesData.ChangeNeeded;
import phonesData.CheckStatus;
import phonesData.RepairNeeded;
import phonesData.ServiceNeeded;

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
                "   4. Place an order for spare parts:\n" +
                "    • Please write which spare part you would like to order:\n" +
                "   5. View the list of ordered equipment\n" +
                "   6. Remove the spare part:\n" +
                "    • Which part would you like to remove?\n" +
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
        if(choosenOption == 1) {
            RepairNeeded repairNeeded = new RepairNeeded();
            repairNeeded.showRepairNeededData();
            System.out.println("Which of the proposed equipment would you like to repair? : ");
            int choosenEquipment = scanner.nextInt();
            repairNeeded.deleteEquipment(choosenEquipment);
        }
        if(choosenOption == 2) {
            ChangeNeeded changeNeeded = new ChangeNeeded();
            changeNeeded.showChangeNeededData();
            System.out.println("For which of the proposed techniques would you like to change detail? : ");
            int choosenEquipment = scanner.nextInt();
            changeNeeded.deleteEquipment(choosenEquipment);
        }
        if(choosenOption == 3) {
            ServiceNeeded serviceNeeded = new ServiceNeeded();
            serviceNeeded.showServiceNeededData();
            System.out.println("Which of the proposed equipments would you like to serve?");
            int choosenEquipment = scanner.nextInt();
            serviceNeeded.deleteEquipment(choosenEquipment);
        }
    }
}
