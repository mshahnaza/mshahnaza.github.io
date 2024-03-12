package services;

import loginData.LoginData;
import phonesData.DetailOrdered;
import phonesData.finishedWorks.DeliveredMaterial;

import java.util.Scanner;

public class SupplierService {
    Scanner scanner = new Scanner(System.in);
    LoginData loginData = new LoginData();
    DetailOrdered detailOrdered = new DetailOrdered();

    public void showMenu() {
        System.out.println("\n" +
                "Greetings dear Supplier!\n" +
                "Please dial the menu number to work with the program:\n" +
                "\n" +
                "1. Show the entire list of ordered spare parts:\n" +
                "2. Deliver material:\n" +
                "3. Show delivered materials\n" +
                "4. Exit");
    }

    public void serveClient() {
        System.out.print("Please enter your password: ");
        String enteredPassword = scanner.next();
        while (!enteredPassword.equals(loginData.supplierPassword)) {
            System.out.print("\033[H\033[2J");
            System.out.println("Entered password is incorrect! Please try again");
            System.out.print("Please enter your password: ");
            enteredPassword = scanner.next();
        }
        System.out.print("\033[H\033[2J");
        showMenu();
        System.out.print("Enter the number: ");
        int choosenOption = scanner.nextInt();
        if(choosenOption == 1) {
            /*only to show how code works*/
            detailOrdered.detailName = "Battery";
            detailOrdered.detailsNumber = 3;
            detailOrdered.detailsOrdered.add(detailOrdered);
            /*only to show how code works*/
            detailOrdered.showOrderList();
        }
        else if(choosenOption == 2) {
            /*only to show how code works*/
            detailOrdered.detailName = "Battery";
            detailOrdered.detailsNumber = 10;
            detailOrdered.detailsOrdered.add(detailOrdered);
            /*only to show how code works*/
            System.out.println("Please enter the name of the material to be delivered: ");
            String materialName = scanner.next();
            System.out.println("Please write the delivery quantity: ");
            int materialNumber = scanner.nextInt();
            detailOrdered.addOrder(materialName,materialNumber);
        }
        else if(choosenOption == 3) {
            detailOrdered.showOrderList();
        }
        else {
            System.out.println("You have left the Menu!");
        }
    }
}
