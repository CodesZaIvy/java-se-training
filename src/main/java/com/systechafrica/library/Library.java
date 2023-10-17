package com.systechafrica.library;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

import com.systechafrica.pos.CustomFormatter;

public class Library {

    private static final Logger LOGGER = Logger.getLogger(Library.class.getName());
    private static final Student obStudent = null;
    private static final Scanner input = null;

    final String DEFAULTPASSWORD = "Admin123";
    final int MAX_LOGIN_TRIALS = 3;

    private Scanner scanner;

    public String login;
    private int loginAttempts = 0;
    private boolean loggedIn = false;

    public Library(int loginAttempts, boolean loggedIn) {

        
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
                LOGGER.info("You have exceeded the maximum login attempts. Quiting.");
                System.exit(1);
            }
        }
    

                 try (Scanner input = new Scanner(System.in)) {
            System.out.println(
                    "***********Welcome to Systech Library!***********");
            System.out.println(
                    "       Kindly Select From The Options Below:             ");
            System.out.println("ENTER BETWEEN 0 TO 4.");
                 }
                
                     
            

            int choice;
            int searchChoice;

            do {

                choice = input.nextInt();

                switch (choice) {
                    case 1:
                        Book b = new Book();
                        new Books().addBook(b);

                        break;

                    case 2:
                        new Books().upgradeBookQuantity();
                        break;

                    case 3:
                        System.out.println(
                                "Press 1 to Search with ISBN");
                        System.out.println(
                                "Press 2 to Search with Book Title:");
                        searchChoice = input.nextInt();

                        switch (searchChoice) {
                            case 1:
                                new Books().searchByISBN();
                                break;

                            case 2:
                              Books b = new Books();
                                break;

                            case 3:
                                Student s = new Student();
                                obStudent.addStudent(s);
                                break;

                            case 4:
                                obStudent.checkOutBook(new Books());
                                break;

                            default:
                                System.out.println("ENTER BETWEEN 0 TO 4.");
                                break;
                        }
                }
            } while (choice != 0);
        }
    
    




    public static void main(String[] args) {

        try {
            FileHandler fileHandler = new FileHandler("Lib.txt");
            LOGGER.addHandler(fileHandler);
            CustomFormatter formatter = new CustomFormatter();
            fileHandler.setFormatter(formatter);

        } catch (SecurityException e) {
            LOGGER.severe("Unable to obtain security permissions for the log file: " + e.getMessage());
        } catch (IOException e) {
            LOGGER.severe("Unable to obtain read/write permissions for the log file: " + e.getMessage());
        } catch (Exception e) {
            LOGGER.severe("Oops an error occurred: " + e.getMessage());
        }

    }

}