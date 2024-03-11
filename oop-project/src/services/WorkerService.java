package services;

import loginData.LoginData;
import phonesData.ChangeNeeded;
import phonesData.RepairNeeded;
import phonesData.ServiceNeeded;

import java.util.Collections;
import java.util.Scanner;

public class WorkerService {
    Scanner scanner = new Scanner(System.in);
    LoginData loginData = new LoginData();

    RepairNeeded repairNeeded = new RepairNeeded();
    ChangeNeeded changeNeeded = new ChangeNeeded();
    ServiceNeeded serviceNeeded = new ServiceNeeded();
    public void showMenu() {
        System.out.println("Greetings dear Worker!\n" +
                "Please dial the menu number to work with the program:\n" +
                "     1. View the list of repair needed\n" +
                "     2. View the list of service needed\n" +
                "     3. View the list of change needed\n" +
                "     4. Show the largest order for:\n" +
                "    • Repair(4.1)\n" +
                "    • Service(4.2)\n" +
                "    • Replacement(4.3)\n" +
                "      5. Show the smallest order for:\n" +
                "    • Repair(5.1)\n" +
                "    • Service(5.2)\n" +
                "    • Replacement(5.3)\n" +
                "      7. Exit");
    }

    public void serveWorker() {
        System.out.print("Please enter your password: ");
        String enteredPassword = scanner.next();
        while(!enteredPassword.equals(loginData.workerPassword)) {
            System.out.print("\033[H\033[2J");
            System.out.println("Entered password is incorrect! Please try again");
            System.out.print("Please enter your password: ");
            enteredPassword = scanner.next();
        }
        System.out.print("\033[H\033[2J");
        showMenu();
        System.out.print("Enter the menu number: ");
        String choosenOption = scanner.next();
        System.out.print("\033[H\033[2J");
        if(choosenOption.equals("1")) {
            /*only to show how code works*/
            repairNeeded.option = "Repair Display";
            repairNeeded.price = 50;
            repairNeeded.repairNeededs.add(repairNeeded);
            /*only to show how code works*/
            repairNeeded.showRepairNeededData();
        }
        else if(choosenOption.equals("2")) {
            /*only to show how code works*/
            serviceNeeded.option = "Dust cleaning";
            serviceNeeded.price = 5;
            serviceNeeded.serviceNeededs.add(serviceNeeded);
            /*only to show how code works*/
            serviceNeeded.showServiceNeededData();
        }
        else if(choosenOption.equals("3")) {
            /*only to show how code works*/
            changeNeeded.option = "Change battery";
            changeNeeded.price = 15;
            changeNeeded.changeNeededs.add(changeNeeded);
            /*only to show how code works*/
            changeNeeded.showChangeNeededData();
        }
        else if(choosenOption.equals("4.1")) {
            /*only to show how code works*/
            repairNeeded.option = "Repair Display";
            repairNeeded.price = 50;
            repairNeeded.repairNeededs.add(repairNeeded);
            repairNeeded.option = "Repair keyboard";
            repairNeeded.price = 25;
            repairNeeded.repairNeededs.add(repairNeeded);
            /*only to show how code works*/
            Collections.sort(repairNeeded.repairNeededs);
            RepairNeeded largestOrder = repairNeeded.repairNeededs.get(repairNeeded.repairNeededs.size()-1);
            System.out.println(largestOrder.option + "-" + largestOrder.price + "$ id: " + largestOrder.id + " " + "date: " + largestOrder.orderDate);
        }
        else if(choosenOption.equals("4.2")) {
            /*only to show how code works*/
            serviceNeeded.option = "Dust Cleaning";
            serviceNeeded.price = 5;
            serviceNeeded.serviceNeededs.add(serviceNeeded);
            serviceNeeded.option = "Cleaning from scratches";
            serviceNeeded.price = 10;
            serviceNeeded.serviceNeededs.add(serviceNeeded);
            /*only to show how code works*/
            Collections.sort(serviceNeeded.serviceNeededs);
            ServiceNeeded largestOrder = serviceNeeded.serviceNeededs.get(serviceNeeded.serviceNeededs.size()-1);
            System.out.println(largestOrder.option + "-" + largestOrder.price + "$ id: " + largestOrder.id + " " + "date: " + largestOrder.orderDate);
        }
        else if(choosenOption.equals("4.3")) {
            /*only to show how code works*/
            changeNeeded.option = "Change Battery";
            changeNeeded.price = 15;
            changeNeeded.changeNeededs.add(changeNeeded);
            changeNeeded.option = "Change Display";
            changeNeeded.price = 40;
            changeNeeded.changeNeededs.add(changeNeeded);
            /*only to show how code works*/
            Collections.sort(changeNeeded.changeNeededs);
            ChangeNeeded largestOrder = changeNeeded.changeNeededs.get(changeNeeded.changeNeededs.size()-1);
            System.out.println(largestOrder.option + "-" + largestOrder.price + "$ id: " + largestOrder.id + " " + "date: " + largestOrder.orderDate);
        }
        else if(choosenOption.equals("5.1")) {
            /*only to show how code works*/
            repairNeeded.option = "Repair Display";
            repairNeeded.price = 50;
            repairNeeded.repairNeededs.add(repairNeeded);
            repairNeeded.option = "Repair keyboard";
            repairNeeded.price = 25;
            repairNeeded.repairNeededs.add(repairNeeded);
            /*only to show how code works*/
            Collections.sort(repairNeeded.repairNeededs);
            RepairNeeded smallestOrder = repairNeeded.repairNeededs.get(0);
            System.out.println(smallestOrder.option + "-" + smallestOrder.price + "$ id: " + smallestOrder.id + " " + "date: " + smallestOrder.orderDate);
        }
        else if(choosenOption.equals("5.2")) {
            /*only to show how code works*/
            serviceNeeded.option = "Dust Cleaning";
            serviceNeeded.price = 5;
            serviceNeeded.serviceNeededs.add(serviceNeeded);
            serviceNeeded.option = "Cleaning from scratches";
            serviceNeeded.price = 10;
            serviceNeeded.serviceNeededs.add(serviceNeeded);
            /*only to show how code works*/
            Collections.sort(serviceNeeded.serviceNeededs);
            ServiceNeeded smallestOrder = serviceNeeded.serviceNeededs.get(0);
            System.out.println(smallestOrder.option + "-" + smallestOrder.price + "$ id: " + smallestOrder.id + " " + "date: " + smallestOrder.orderDate);
        }
        else if(choosenOption.equals("5.3")) {
            /*only to show how code works*/
            changeNeeded.option = "Change Battery";
            changeNeeded.price = 15;
            changeNeeded.changeNeededs.add(changeNeeded);
            changeNeeded.option = "Change Display";
            changeNeeded.price = 40;
            changeNeeded.changeNeededs.add(changeNeeded);
            /*only to show how code works*/
            Collections.sort(changeNeeded.changeNeededs);
            ChangeNeeded smallestOrder = changeNeeded.changeNeededs.get(0);
            System.out.println(smallestOrder.option + "-" + smallestOrder.price + "$ id: " + smallestOrder.id + " " + "date: " + smallestOrder.orderDate);
        }
        else {
            System.out.println("You have left the Menu!");
        }
    }
}
