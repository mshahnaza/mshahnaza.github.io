package services;

import loginData.LoginData;
import phonesData.ChangeNeeded;
import phonesData.RepairNeeded;
import phonesData.ServiceNeeded;

import java.util.Scanner;

public class ClientService {
    Scanner scanner = new Scanner(System.in);
    LoginData loginData = new LoginData();

    public int enteredId;

    public void showMenu() {
        System.out.print("Greetings dear Client!\n" + "Please press the menu number to work with the program");
        System.out.println("1. SEND FOR REPAIR:\n" +
                "   • Please select a category of equipment for repair\n" +
                "   1) Repair the display - $50(1.1)\n" +
                "   2) Repair the keyboard -25$(1.2)\n" +
                "   3) Repair internals (Motherboard, processor, etc.) -$40(1.3)\n" +
                "2. REPLACEMENT OF COMPONENTS\n" +
                "• Choose what you want to replace in your equipment?\n" +
                "   1) Battery - $15(2.1)\n" +
                "   2) Display - $40(2.2)\n" +
                "   3) Processor - $40(2.3)\n" +
                "   4) Motherboard - $40(2.4)\n" +
                "   5) RAM - $20(2.5)\n" +
                "3.SERVICE:\n" +
                "• Please select the type of service: >>>\n" +
                "   1) Dust cleaning - $5(3.1)\n" +
                "   2) Cleaning from scratches - $10(3.2)\n" +
                "4. EXIT");
    }

    public void serveClient() {
        System.out.print("Please enter your password: ");
        String enteredPassword = scanner.next();
        while(!enteredPassword.equals(loginData.clientPassword)) {
            System.out.print("\033[H\033[2J");
            System.out.println("Entered password is incorrect! Please try again");
            System.out.print("Please enter your password: ");
            enteredPassword = scanner.next();
        }
        System.out.print("\033[H\033[2J");
        showMenu();
        System.out.print("Enter the number: ");
        String choosenOption = scanner.next();
        System.out.print("\033[H\033[2J");
        if(choosenOption.equals("1.1")) {
            RepairNeeded repairNeeded = new RepairNeeded();
            repairNeeded.option = "Repair display";
            repairNeeded.price = 50;
            repairNeeded.repairNeededs.add(repairNeeded);
            repairNeeded.showRepairNeededData();
        }
        else if(choosenOption.equals("1.2")) {
            RepairNeeded repairNeeded = new RepairNeeded();
            repairNeeded.option = "Repair keyboard";
            repairNeeded.price = 25;
            repairNeeded.repairNeededs.add(repairNeeded);
            repairNeeded.showRepairNeededData();
        }
        else if(choosenOption.equals("1.3")) {
            RepairNeeded repairNeeded = new RepairNeeded();
            repairNeeded.option = "Repair internals";
            repairNeeded.price = 40;
            repairNeeded.repairNeededs.add(repairNeeded);
            repairNeeded.showRepairNeededData();
        }
        else if(choosenOption.equals("2.1")) {
            ChangeNeeded changeNeeded = new ChangeNeeded();
            changeNeeded.option = "Change battery";
            changeNeeded.price = 15;
            changeNeeded.changeNeededs.add(changeNeeded);
            changeNeeded.showChangeNeededData();
        }
        else if(choosenOption.equals("2.2")) {
            ChangeNeeded changeNeeded = new ChangeNeeded();
            changeNeeded.option = "Change display";
            changeNeeded.price = 40;
            changeNeeded.changeNeededs.add(changeNeeded);
            changeNeeded.showChangeNeededData();
        }
        else if(choosenOption.equals("2.3")) {
            ChangeNeeded changeNeeded = new ChangeNeeded();
            changeNeeded.option = "Change processor";
            changeNeeded.price = 40;
            changeNeeded.changeNeededs.add(changeNeeded);
            changeNeeded.showChangeNeededData();
        }
        else if(choosenOption.equals("2.4")) {
            ChangeNeeded changeNeeded = new ChangeNeeded();
            changeNeeded.option = "Change motherboard";
            changeNeeded.price = 40;
            changeNeeded.changeNeededs.add(changeNeeded);
            changeNeeded.showChangeNeededData();
        }
        else if(choosenOption.equals("2.5")) {
            ChangeNeeded changeNeeded = new ChangeNeeded();
            changeNeeded.option = "Change RAM";
            changeNeeded.price = 20;
            changeNeeded.changeNeededs.add(changeNeeded);
            changeNeeded.showChangeNeededData();
        }
        else if(choosenOption.equals("3.1")) {
            ServiceNeeded serviceNeeded = new ServiceNeeded();
            serviceNeeded.option = "Dust Cleaning";
            serviceNeeded.price = 5;
            serviceNeeded.serviceNeededs.add(serviceNeeded);
            serviceNeeded.showServiceNeededData();
        }
        else if(choosenOption.equals("3.2")) {
            ServiceNeeded serviceNeeded = new ServiceNeeded();
            serviceNeeded.option = "Scratches cleaning";
            serviceNeeded.price = 10;
            serviceNeeded.serviceNeededs.add(serviceNeeded);
            serviceNeeded.showServiceNeededData();
        }
        else {
            System.out.println("You have left the Menu!");
        }
    }
}

