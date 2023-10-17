package com.systechafrica.library;

import java.util.Scanner;
import java.util.logging.Logger;

import com.systechafrica.scanner.scanner;



public class LogIn {
private static final Logger LOGGER = Logger.getLogger(LogIn.class.getName());


final String DEFAULTPASSWORD = "Admin123";
final int MAX_LOGIN_TRIALS = 3;

boolean LogIn;
String studentRegistrationNumber;

Book borrowedBooks[] = new Book[5];

public int bookCount = 0;

Scanner input = new Scanner(System.in);

public void login() {
        int loginAttempts = 0;
        while (loginAttempts < MAX_LOGIN_TRIALS) {
            System.out.print("Enter password to log in: ");
            scanner scanner = new scanner();
            String enteredPassword = scanner.nextLine();

            if (enteredPassword.equals(DEFAULTPASSWORD)) {
                LOGGER.info("Successful login!!");
                LogIn = true;
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
    }



public LogIn(boolean logIn) {
        LogIn = logIn;
}
}

