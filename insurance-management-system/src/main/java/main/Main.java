package main;

import account.Account;
import account.AccountManager;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your e-mail:");
        String userEmail = scanner.nextLine();
        System.out.println("----------------------");
        System.out.println("Please enter your password:");
        String userPassword = scanner.nextLine();

        Account currentUser = AccountManager.login(userEmail, userPassword);

        System.out.println("Welcome to the Patika Insurance " +
                currentUser.getUser().getName() +
                ", please select the operation you want to perform");

        boolean flag = true;

        while(flag){
            System.out.println("1. Add a new insurance");
            System.out.println("2. List your existing insurances");
            System.out.println("3. Add a new address to the system");
            System.out.println("4. Remove an address from the system");
            System.out.println("5. List your account info");
            System.out.println("0. Exit the system");

            int userInput = scanner.nextInt();

            switch (userInput){
                case 0:
                    flag = false;
                    break;
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
            }
        }

    }

}
