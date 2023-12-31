package com.systechafrica.posdemo;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Logger;



public class PosDemo {
    private static final Logger LOGGER = Logger.getLogger(PosDemo.class.getName());

    final String DEFAULT_PASSWORD= "Admin123";
    final int MAX_LOGIN_ATTEMPTS = 3;

    private Scanner scanner;
    private ArrayList<Items> cart;

    // Constructor
    public PosDemo() {
        scanner = new Scanner(System.in);
        cart = new ArrayList<>();// creating an empty cart
    }

      // handles user login
      public void login() {
        int loginAttempts = 0;

        while (loginAttempts < MAX_LOGIN_ATTEMPTS) {
            System.out.print("Enter password to log in: ");
            String enteredPassword = scanner.nextLine();

            if (enteredPassword.equals(DEFAULT_PASSWORD)) {
                LOGGER.info("Successful login!");
                break;
            } else {
                loginAttempts++;
                LOGGER.info("Incorrect password. Attempts left: " + (MAX_LOGIN_ATTEMPTS - loginAttempts));
            }

            if (loginAttempts == MAX_LOGIN_ATTEMPTS) {
                LOGGER.info("You have exceeded the maximum login attempts. Exiting.");
                System.exit(1);
            }
        }
        while (true) {
            displayMenu();
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine(); // newline

            switch (option) {
                case 1:
                    // Add items
                    addItem();
                    break;
                case 2:
                    // Make payment
                    makePayment();
                    break;
                case 3:
                    // Display receipt
                    displayReceipt();
                    break;
                default:
                    LOGGER.info("Invalid option. Please choose a valid option.");
            }
        }

    }

    public static void displayMenu() {
        LOGGER.info("************************************\n");
        LOGGER.info("********** SYSTECH POS SYSTEM ******\n");
        LOGGER.info("''''''''''''''''''''''''''''''''''''\n");
        LOGGER.info("____________________________________\n");
        LOGGER.info("1:ADD ITEM");
        LOGGER.info("2:MAKE PAYMENT");
        LOGGER.info("3: DISPLAY RECEIPT");
        LOGGER.info("''''''''''''''''''''''''''''''''''''\n");

        System.out.print("Choose your option: ");

    }

    // allows the user to add items to the shopping
    // cart by entering item codes, quantities, and unit prices.
    public void addItem() {

        System.out.print("Enter Item Code: ");
        String itemCodeEntered = scanner.nextLine();

        System.out.print("Enter Quantity: ");
        // int quantity = scanner.nextInt();
        int quantity = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter Unit Price: ");
        double unitPrice = scanner.nextDouble();
        scanner.nextLine();

        // this code takes user input for an item's code, quantity, and
        // unit price, creates an Item object with this information,and
        // adds it to the shopping cart
        Items items = new Items(itemCodeEntered, quantity, unitPrice);
        cart.add(items);
        LOGGER.info("Item added to cart.");
    }

     // this method here calculates the total payment based on the items in the cart
    // and
    // handles the payment process, including providing change.
    public void makePayment() {
        if (cart.isEmpty()) {
            LOGGER.info("No items in the cart. Add items before making a payment.");
            return;
        }

        LOGGER.info("Item Code   Quantity   Unit Price   Total Value");
        LOGGER.info("--------------------------------------------");
        double totalAmount = 0.0;

        for (Items item : cart) {
            LOGGER.info(item.getItemCode() + "   " + item.getQuantity() + "   " +
                    item.getUnitPrice() + "   " + item.getTotalValue());
            totalAmount += item.getTotalValue();
        }

        LOGGER.info("--------------------------------------------");
        LOGGER.info("Total: " + totalAmount);

        // Ask for the amount given by the customer
        System.out.print("Enter the amount given by the customer: ");
        double amountGiven = scanner.nextDouble();
        scanner.nextLine(); // newline

        // Calculate and display the change
        double change = amountGiven - totalAmount;
        LOGGER.info("Change: " + change);
        LOGGER.info("THANK YOU FOR SHOPPING WITH US");
    }

     // displays a receipt that shows the items in the cart,
    // their quantities, unit prices, and total values.
    public void displayReceipt() {

        if (cart.isEmpty()) {
            LOGGER.info("No items in the cart. Add items before displaying the receipt.");
        } else {
            LOGGER.info("***************");
            LOGGER.info("RECEIPT");
            LOGGER.info("__________________");
            LOGGER.info("Item Code   Quantity   Unit Price   Total Value");
            LOGGER.info("--------------------------------------------");
            double totalAmount = 0.0;

            for (Items item : cart) {
                LOGGER.info(item.getItemCode() + "   " + item.getQuantity() + "   " +
                        item.getUnitPrice() + "   " + item.getTotalValue());
                totalAmount += item.getTotalValue();
            }

            LOGGER.info("--------------------------------------------");
            LOGGER.info("Total: " + totalAmount);
            LOGGER.info("__________________");

        }
    }

    public static void main(String[] args) {
        PosDemo a = new PosDemo();
        a.login();
    }
}
