package com.systechafrica.library;

import java.util.Scanner;

public class Books {
    private static final String bookISBN = null;
    Book theBooks[] = new Book[20];
    Book books = this.theBooks();

    public static int count;

    Scanner input = new Scanner(System.in);

    public int compareBooks(Book b1, Book b2) {
        if (b1.title.equalsIgnoreCase(b2.title)) {
            System.out.println(
                    "Book Title already exists");
            return 0;

        }
        if (b1.bookISBN == b2.bookISBN) {
            System.out.println(
                    "Book of this ISBN already exists.");
            return 0;
        }
        return 1;
    }

    private Book theBooks() {
        return null;
    }

    public Book checkOutBook() {

        System.out.println(
                "Enter ISBN of Book to be Checked Out.");
        int sNo = input.nextInt();

        int bookIndex = isAvailable(sNo);

        if (bookIndex != -1) {
            theBooks[bookIndex].bookQuantityCopy--;
            return theBooks[bookIndex];
        }
        return null;
    }

    private int isAvailable(int ISBN) {
        for (int i = 0; i < count; i++) {
            if (bookISBN == theBooks[i].bookISBN) {
                if (theBooks[i].bookQuantity > 0) {
                    System.out.println(
                            "Book is Available");
                    return i;
                }
                System.out.println("Book is Unavailable");
                return -1;
            }

        }
        System.out.println(" ISBN " + "Available in Library.");
        return -1;
    }

    public void addBook(Book b) {
        for (int i = 0; i < count; i++) {
            if (b.equals(theBooks[i])) {
                theBooks[i].bookQuantityCopy++;
                return;
            }
        }
    }

   

    public void searchByISBN() {
        System.out.println(
                "\t\t\t\tSEARCH BY ISBN\n");
        int bookISBN;
        System.out.println("Enter ISBN of Book");
        bookISBN = input.nextInt();

        int flag = 0;
        System.out.println(
                "ISBN\t\tTitle\t\tAvailabe Quantity\t\tTotal Quantity");
        for (int i = 0; i < count; i++) {
            if (bookISBN == theBooks[i].bookISBN) {
                System.out.println(
                        theBooks[i].bookISBN + "\t\t"
                                + theBooks[i].title + "\t\t"
                                + theBooks[i].bookQuantityCopy + "\t+\t"
                                + theBooks[i].bookQuantity);
                flag++;
                return;
            }
        }
        if (flag == 0)
            System.out.println("No Book for ISBN" + bookISBN + "Found");

    }

    public Books(Book[] theBooks, Book books) {
        this.theBooks = theBooks;
        this.books = books;
    }

    public Books() {
    }

    public void searchByTitle() {

    }
    public void showAllBooks() {
        {

            System.out.println("\t\t\t\tSHOWING ALL BOOKS\n");
            System.out.println(
                    "bookISBN\t\ttitle\t\tbookQuantityCopy\t\tbookQuantity");

            for (int i = 0; i < count; i++) {

                System.out.println(
                        theBooks[i].bookISBN + "\t\t"
                                + theBooks[i].title + "\t\t"
                                + theBooks[i].bookQuantityCopy + "\t\t"
                                + theBooks[i].bookQuantity);
            }
        }
    }

    public void upgradeBookQuantity() {
    }

    public void addBook(Books b) {
    }

}
