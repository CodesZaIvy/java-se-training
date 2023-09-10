package com.systechafrica.Restaurant;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;


public class Restaurant {
      private static final Logger LOGGER = Logger.getLogger(Restaurant.class.getName());

    final String DEFAULTPASSWORD = "Admin123";
    final int MAX_LOGIN_TRIALS = 3;

    
    private int loginAttempts = 0;
    private boolean loggedIn = false;
    private List<item> menuItems = new ArrayList<>();
    private List<item> orderItems = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void runRestaurant() {
        login();
        loadingMenu();

        while (loggedIn) {
            showMenu();
            int choice = takeCustomerSelectionChoice();

            switch (choice) {
                case 1:
                    // Select choice 1 (Chai)
                    item chai = menuItems.get(0); // Chai is the first item
                    orderItems.add(chai);
                    break;
                case 2:
                    // Select choice 2 (Juice)
                    item juice = menuItems.get(1); // Juice is the second item
                    orderItems.add(juice);
                    break;
                case 3:
                    // Select choice 3 (Coffee)
                    item coffee = menuItems.get(2); // Coffee is the third item
                    orderItems.add(coffee);
                    break;
                case 4:
                    // Select choice 4 (Muffins)
                    item muffin = menuItems.get(3); // Muffins is the fourth item
                    orderItems.add(muffin);
                    break;
                case 5:
                    // Select choice 5 (Cake)
                    item cake = menuItems.get(4); // Cake is the fifth item
                    orderItems.add(cake);
                    break;
                case 6:
                    // Select choice 6 (Pilau)
                    item pilauItem = menuItems.get(5); // Pilau is the sixth item
                    orderItems.add(pilauItem);
                    break;
                case 7:
                    // Select choice 7 (Quit)
                    exitProgram();
                    break;
                default:
                    LOGGER.info("Null choice. Kindly choose a valid option.");
            }

            if (choice >= 1 && choice <= 6) {
                takeCustomerOrderSelection();
            }
        }

        LOGGER.info("Thank you for using  the POS system of Systech!");
    }

    public void login() {
        while (loginAttempts < MAX_LOGIN_TRIALS) {
            System.out.print("Enter password to log in: ");
            String enteredPassword = scanner.nextLine();

            if (enteredPassword.equals(DEFAULTPASSWORD)) {
                LOGGER.info("Successful login!!");
                loggedIn = true;
                break;
            } else {
                loginAttempts++;
                LOGGER.info("Incorrect password. Attempts left: " + (MAX_LOGIN_TRIALS - loginAttempts));
            }

            if (loginAttempts == MAX_LOGIN_TRIALS) {
                LOGGER.info("You have exceeded the maximum login attempts. Exiting.");
                System.exit(1);
            }
        }
    }

    private void loadingMenu() {
        // Initialize the menu 
        menuItems.add(new item(1, "Chai", 150.0));
        menuItems.add(new item(2, "Juice", 80.0));
        menuItems.add(new item(3, "Coffee", 110.0));
        menuItems.add(new item(4, "Muffins", 150.0));
        menuItems.add(new item(5, "Cake", 80.0));
        menuItems.add(new item(6, "Pilau", 110.0));
    }

    public void showMenu() {
        // Show the menu on the restaurant
        LOGGER.info("______________________________");
        LOGGER.info("****RESTAURANT*******");

        LOGGER.info("DRINKS");
        LOGGER.info("____________________\n");
        LOGGER.info("1. CHAI----------------------------------150");
        LOGGER.info("2. JUICE--------------------------------80");
        LOGGER.info("3. COFFEE---------------------------------110");

        LOGGER.info("MEALS");
        LOGGER.info("____________________\n");
        LOGGER.info("4. Muffins------------70");
        LOGGER.info("5. Cake-------------70");
        LOGGER.info("6. Pilau-----------------------------90");

        LOGGER.info("7. QUIT");
    }

    private int takeCustomerSelectionChoice() {
        // Get the user's selection
        System.out.print("Choose an option: ");
        int selection = scanner.nextInt();
        scanner.nextLine(); // Consume the character on a new line
        return selection;
    }

    private void takeCustomerOrderSelection() {
        while (true) {
            System.out.print("Do you want to enter another day snacks and meals or drinks option (Y/N): ");
            String choice = scanner.nextLine();

          
            if (choice.equalsIgnoreCase("N")) {
                showPaymentOptions();
                break;
            } else if (choice.equalsIgnoreCase("Y")) {
                showMenu();
                int subChoice = takeCustomerSelectionChoice();
                if (subChoice >= 1 && subChoice <= 6) {
                    addToOrder(subChoice);
                } else {
                    LOGGER.info("Null choice. Kindly choose a valid option.");
                }
            } else {
                LOGGER.info("Null choice. Kindly choose 'Y' or 'N'.");
            }
        }
    }

    private void addToOrder(int menuItemNumber) {
        // choose the selected menu item
        item selecteditem = null;

        // Find the selected menu item
        for (item item : menuItems) {
            if (item.getItemId() == menuItemNumber) {
                selecteditem = item;
                break;
            }
        }

        if (selecteditem != null) {
            orderItems.add(selecteditem);
            LOGGER.info("Added " + selecteditem.getItemName() + " to your order.");
        } else {
            LOGGER.info("Null menu item number.");
            return; 
            // Exit the method if the item on the menu is null
        }
    }

    private void showPaymentOptions() {
        while (true) {
            System.out.print("PROCEED TO PAYMENT (Y/N): ");
            String choice = scanner.nextLine();
            if (choice.equalsIgnoreCase("Y")) {
                processPayment();
                break;
            } else if (choice.equalsIgnoreCase("N")) {
                break;
            } else {
                LOGGER.info("Null choice. Kindly choose 'Y' or 'N'.");
            }
        }
    }

    private void processPayment() {
        // Select payment and display the balance
        LOGGER.info("Pay now for:");

        double total = 0.0;
        for (item item : orderItems) {
            LOGGER.info(item.getItemName() + "----------------------" + item.getItemPrice());
            total += item.getItemPrice();
        }

        LOGGER.info("Total: " + total);
        System.out.print("Enter amount to pay: ");
        double amountPaid = scanner.nextDouble();
        scanner.nextLine(); 
        // Generate  character in a new line

        if (amountPaid < total) {
            LOGGER.info("Insufficient payment. Kindly pay the full amount.");
        } else {
            double balance = amountPaid - total;
            LOGGER.info("Your balance is --------------------" + balance);
            orderItems.clear();
             // Clear the items in the order
        }
    }

    private void exitProgram() {
        // Close the program
        LOGGER.info("Thank you for being our loyal customer!");
        System.exit(0);
    }

    public static void main(String[] args) {
      Restaurant app = new Restaurant();
        app.runRestaurant();
    }
}
    

