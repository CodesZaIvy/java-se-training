package com.systechafrica.library;

import java.util.Scanner;
import java.util.logging.Logger;

import com.systechafrica.scanner.scanner;

public class Student {
    private static final Logger LOGGER = Logger.getLogger(Student.class.getName());

    final String DEFAULTPASSWORD = "Admin123";
    final int MAX_LOGIN_TRIALS = 3;

    String LogIn;
    String studentRegistrationNumber;

    Book borrowedBooks[] = new Book[5];

    public int bookCount = 0;

    Scanner input = new Scanner(System.in);

    public Student(String logIn, String studentRegistrationNumber, Book[] borrowedBooks, int bookCount, Scanner input,
            Object[] student) {
        LogIn = logIn;
        this.studentRegistrationNumber = studentRegistrationNumber;
        this.borrowedBooks = borrowedBooks;
        this.bookCount = bookCount;
        this.input = input;

    }

    public Student() {
    }

    public void login() {
        int loginAttempts = 0;

        while (loginAttempts < MAX_LOGIN_TRIALS) {
            System.out.print("Enter password to log in: ");
            String enteredPassword = scanner.nextLine();

            if (enteredPassword.equals(DEFAULTPASSWORD)) {
                LOGGER.info("Successful Login");
                break;
            } else {
                loginAttempts++;
                System.out.println("Incorrect password. Attempts left: " + (MAX_LOGIN_TRIALS - loginAttempts));

            }

            if (loginAttempts == MAX_LOGIN_TRIALS) {
                System.out.println("You have exceeded the maximum login attempts. Exiting.");

            }

        }
        while (true) {
            displayMenu();
            {
                System.out.println(
                        "---------------------------------------------");
                System.out.println("Press 1 to Borrow Book(s)");
                System.out.println("Press 2 to View  Borrowed Book(s)");
                System.out.println("Press 3 to Return Book(s)");
                System.out.println("Press 4 to Quit");

                System.out.println(
                        "---------------------------------------------");

                System.out.println(
                        "---------------------------------------------");
                System.out.println("Press 1 to Borrow Book(s)");
                System.out.println("Press 2 to View  Borrowed Book(s)");
                System.out.println("Press 3 to Return Book(s)");
                System.out.println("Press 4 to Quit");

                System.out.println(
                        "---------------------------------------------");
            }

        }

    }

    public void checkOutBook(Books books) {
    }

    private void displayMenu() {
    }

    public void addStudent(Student s) {
    }

}
