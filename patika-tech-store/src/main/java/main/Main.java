package main;

import store.Store;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to Patika Tech Store!");
        boolean flag = true;

        while(flag){
            System.out.println("Please select the action you want to perform.");
            System.out.println("1. List notebooks");
            System.out.println("2. List smartphones");
            System.out.println("3. List the brands");
            System.out.println("4. Delete a product by ID");
            System.out.println("5. Show a product by specific ID");
            System.out.println("6. Add a notebook");
            System.out.println("7. Add a smartphone");
            System.out.println("0. Exit the store");

            Scanner scanner = new Scanner(System.in);
            int userInput = scanner.nextInt();

            switch (userInput){
                case 0:
                    flag = false;
                    break;
                case 1:
                    listNotebooks();
                    break;
                case 2:
                    listSmartphones();
                    break;
                case 3:
                    listBrands();
                    break;
                case 4:
                    deleteProduct();
                    break;
                case 5:
                    getProductById();
                    break;
                case 6:
                    addSmartphone();
                    break;
                case 7:
                    addNotebook();
                    break;

            }
        }
    }

    private static void addNotebook() {
        //TO-DO
    }

    private static void addSmartphone() {
        //TO-DO
    }

    private static void getProductById() {
        System.out.println("Enter the index for the product you want to search");
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        Store.getProductById(userInput);
    }

    private static void deleteProduct() {
        System.out.println("Enter the index for deletion");
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        Store.deleteProduct(userInput);
    }

    private static void listBrands() {
        Store.listBrands();
    }

    private static void listSmartphones() {
        Store.listSmartPhones();
    }

    private static void listNotebooks() {
        Store.listNotebooks();
    }
}
