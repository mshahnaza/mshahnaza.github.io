package login;

import loginData.LoginData;
import users.Client;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LoginData loginData = new LoginData();

        System.out.println("Please enter type of your account: ");
        String accountType = scanner.next();

    }
}