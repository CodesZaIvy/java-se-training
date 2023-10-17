package com.systechafrica.library;

import java.util.Scanner;

public class Book {
   
    public String bookISBN;
    public String title;
    public int bookQuantity;
    public int bookQuantityCopy;

    Scanner input = new Scanner(System.in);
    

    public Book() {
        //Display message for taking input via
        

        System.out.println("Enter ISBN (International Standard Book Number) : ");
        this.bookISBN = input.nextLine();
        input.nextLine();

        System.out.println("Enter book Title :");
        this.title = input.nextLine();

        System.out.println(" Enter Quantity of Books:");
        this.bookQuantity = input.nextInt();

        System.out.println("Enter number of book copies:");
        this.bookQuantityCopy = input.nextInt();

    }

    public Book checkOutBook() {
        return null;
    }

    public void setToBorrowed() {
    }

    public boolean isBorrowed() {
        return false;
    }

    public void setToReturned() {
    }

}
