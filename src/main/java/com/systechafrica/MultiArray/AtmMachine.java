package com.systechafrica.MultiArray;

import java.util.Scanner;
import java.util.logging.Logger;

public class AtmMachine{
    private  static final Logger LOGGER = Logger.getLogger(AtmMachine.class.getName());
    
    final double InitialBalance = 1000.00;
    final double WithdrawalFee = 0.02;  
        final String DefaultPassword = "Admin123";
        final int AttemptedLogins = 3;
        double currentBalance = InitialBalance;
        Scanner scanner = new Scanner(DefaultPassword);


public boolean login() {
            // Attempt three times , quit if not logged in
            int loginAttempts = 1;
            boolean EntryAccepted = false;
    
            while (loginAttempts <= 3) {
                System.out.print("Enter your password: ");
                String userPassword = scanner.nextLine();
                if (userPassword.equals(DefaultPassword)) {
                    // display menu
                    EntryAccepted = true;
                    break;
                }
                LOGGER.info("Wrong password");
               loginAttempts++; 
               //loginAttempts =loginAttempts+1;
            }
            return EntryAccepted;
            /*
             * // while the value remain "proceed"
             * String retry = "Yes";
             * 
             * for (int i = 1; i <= AttemptedLogin; i++) {
             * System.out.print("Enter your password: ");
             * String userPassword = scanner.nextLine();
             * if (userPassword.equals(DefaultPasswod)) {
             * // show menu
             * EntryAccepted = true;
             * break;
             * }
             * LOGGER.info("Wrong password");
             * }
             */
    
        }

        public void displayMenu() {
            LOGGER.info("******************************");
            LOGGER.info("********ATM SIMULATOR*********");
            LOGGER.info("******************************");
            LOGGER.info("********ATM SERVICES**********");
            LOGGER.info("______________________________");
            LOGGER.info("1. Check Balance");
            LOGGER.info("2. Deposit");
            LOGGER.info("3. Withdraw");
            LOGGER.info("4. Transmit Funds");
            LOGGER.info("5. Quit");
    
        }

        public void checkBalance() {
            LOGGER.info("Your balance is: " + currentBalance);
        }

        public void performDeposit() {
            // ? get the amount to deposit
            double amountToDeposit = scanner.nextDouble();
            // ? add the amount to the balance
            currentBalance += amountToDeposit;
            // currentBalance = currentBalance+amountToDeposit
        }

        public void performWithdrawal() {
            //  check if current balance is sufficient
            // total the amount to withdraw + charges
            // get the amount to withdraw ready
          
            
        }

        public void performTransfer() {
            //  subtract the amount from the balance
            //  get the amount to withdraw
            
        }

        
    public void printReceipt() {
        // you can print information about the transaction
    }



            
 public static void main(String[] args) {
    AtmMachine app = new AtmMachine();
    boolean EntryAccepted = app.login();

       
        if (EntryAccepted) {
            LOGGER.info("logged in successfully");
            // display menu
            boolean keepShowingMenu = true;
            while (keepShowingMenu) { // while(true)
                app.displayMenu();
                try {
                    System.out.print("Choose your option: ");
                    int option = app.scanner.nextInt(); // \n
                    /*
                     * if (option == 1) {
                     * app.checkBalance();
                     * } else if (option == 2) {
                     * app.performDeposit();
                     * } else if (option == 3) {
                     * app.performWithdrawal();
                     * } else if (option == 4) {
                     * app.performTransfer();
                     * } else if (option == 5) {
                     * keepShowingMenu=false;
                     * } else {
                     * LOGGER.info("Invalid option...try again");
                     * }
                     */

                    switch (option) {
                        case 1:
                            app.checkBalance();
                            break;
                        case 2:
                            app.performDeposit();
                            break;
                        case 3:
                            app.performWithdrawal();
                            break;
                        case 4:
                            app.performTransfer();
                            break;
                        case 5:
                            keepShowingMenu = false;
                            break;
                        default:
                            LOGGER.info("Invalid option");
                            break;
                    }

                } catch (Exception e) {
                    app.scanner.nextLine(); 
                    // this is to clear the \n character that is retained when using scanner with nextInt()
                    LOGGER.info("Invalid input: We only require integer values");
                }
            }

        } else {
            LOGGER.info("Maximum attempt failed");
        }

    }
 }
 


 
 




    
