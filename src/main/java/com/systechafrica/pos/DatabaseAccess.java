package com.systechafrica.pos;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

public class DatabaseAccess extends PosShop {
    public DatabaseAccess(String item, String itemCode, String quantity, String unitprice) {

    }

    private static final Logger LOGGER = Logger.getLogger(DatabaseAccess.class.getName());

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            FileHandler fileHandler = new FileHandler("working-with-database.txt");
            
            CustomFormatter formatter = new CustomFormatter();
            LOGGER.addHandler(fileHandler);
            fileHandler.setFormatter(formatter);

            // Loading jdbc driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            String connectionUrl = "jdbc:mysql://localhost:3308/javase";
            String user = "javase";
            String password = "javase";
            Connection connection = DriverManager.getConnection(connectionUrl, user, password);

            // Statement from connection
            Statement statement = connection.createStatement();
            // Create table
            String createItemsTable = "CREATE TABLE IF NOT EXISTS PosShop (item VARCHAR(255), ItemCode VARCHAR(255), Quantity VARCHAR(255),Unitprice VARCHAR(255))";
            //

            int updateStatus = statement.executeUpdate(createItemsTable);
            LOGGER.info("Update status=" + updateStatus);

            // Insert Statement
            String insertQuery = "insert into PosShop (Item, ItemCode, Quantity,Unitprice ) values ('1', 'ISBN2093', '1', 'SingleCopy');";
            int numbersOfRowsInserted = statement.executeUpdate(insertQuery);
            LOGGER.info("Numbers Of Rows Inserted =" + numbersOfRowsInserted);

            // Item, ItemCode, Quantity,Unitprice,
            System.out.println("Enter PosShop Item\n   (Book | Pencil | Paper | Pen) : ");
            String Item = scanner.nextLine();

            System.out.println("Enter PosShop ItemCode: ");
            scanner.nextLine();
            String ItemCode = scanner.nextLine();

            System.out.println("Enter PosShop Quantity: ");
            String Quantity = scanner.nextLine();

            System.out.println("Enter PosShop Unitprice: ");
            String Unitprice = scanner.nextLine();

            PosShop posShop = new PosShop(Item, ItemCode, Quantity, Unitprice);

        } catch (SecurityException e) {
            LOGGER.severe("Unable to obtain security permissions for the log file: " + e.getMessage());
        } catch (IOException e) {
            LOGGER.severe("Unable to obtain read/write permissions for the log file: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            LOGGER.severe("Unable to obtain class for jdbc driver: " + e.getMessage());
        } catch (SQLException e) {
            LOGGER.severe("Database operation failure" + e.getMessage());
        } catch (Exception e) {
            LOGGER.severe("Oops an error occurred: " + e.getMessage());
        }
    }
}
