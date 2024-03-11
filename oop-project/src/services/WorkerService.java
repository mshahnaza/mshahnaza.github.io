package services;

import loginData.LoginData;

import java.util.Scanner;

public class WorkerService {
    Scanner scanner = new Scanner(System.in);
    LoginData loginData = new LoginData();
    public void showMenu() {
        System.out.println("Greetings dear Worker!\n" +
                "Please dial the menu number to work with the program:\n" +
                "     1. View the list of repair technicians\n" +
                "     2. View the list of service technicians\n" +
                "     3. View the list of replacement techniques\n" +
                "     4. Show the largest order for:\n" +
                "    • Repair\n" +
                "    • Service\n" +
                "    • Replacement\n" +
                "      5. Show the smallest order for:\n" +
                "    • Repair\n" +
                "    • Service\n" +
                "    • Replacement\n" +
                "      6. View statistics:\n" +
                "        ◦ For repairs\n" +
                "        ◦ By replacement\n" +
                "        ◦ Maintenance\n" +
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
    }
}
