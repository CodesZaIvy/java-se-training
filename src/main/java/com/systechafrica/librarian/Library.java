package com.systechafrica.librarian;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Library {
    /**
    *
    */
    private static final BookCollection BOOK_COLLECTION = new BookCollection(5);
    private static final Object ISBNNumber = null;

    public static Object getIsbnnumber() {
        return ISBNNumber;
    }

    static Map<BookCollection, String> bookCatalog = new HashMap<BookCollection, String>(); // Entire collection of
                                                                                            // books

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Test BookCollection objects:
        BookCollection book1 = BOOK_COLLECTION;
        BookCollection book2 = new BookCollection(3);
        BookCollection book3 = new BookCollection(2);

        bookCatalog.put(book1, "Our Bodies Their Battle Field");
        bookCatalog.put(book2, "A Sister More Like Me");
        bookCatalog.put(book3, "Aleph");

        bookCatalog.put(book1, "1259060977");
        bookCatalog.put(book2, "1259060978");
        bookCatalog.put(book3, "1259060980");

        // Client borrows 2 copies of Our Bodies Their Battle Field
        borrowBook("Our Bodies Their Battle Field.");
        borrowBook("Our Bodies Their Battle Field");

        printCatalog();
        System.out.println();

        // Client returns the copies
        returnBook("Our Bodies Their Battle Field");
        returnBook("Our Bodies Their Battle Field");

        // Test if catalog has been updated correctly
        printCatalog();
        System.out.println();

    }

    // method prints out each collection of books

    private static void borrowBook(String string) {
    }

    public static void printCatalog() {

        for (Map.Entry<BookCollection, String> entry : bookCatalog.entrySet()) {

            BookCollection bc = (BookCollection) entry.getKey();

            System.out.println("Title: " + entry.getValue());
            bc.viewBorrowedBooks();
            System.out.println();
        }
    }

    // method borrows a book from a collection

    public static void borrowBook(String bookTitle, String ISBNNumber) { // Borrows a book from the entire library
                                                                         // catalog

        for (Map.Entry<BookCollection, String> entry : bookCatalog.entrySet()) {
            if (entry.getValue().equals(bookTitle))
                if (entry.getValue().equals(ISBNNumber)) {
                    BookCollection bc = (BookCollection) entry.getKey();
                    if (bc.borrowBook())
                        System.out.printf("You have successfully borrowed " + bookTitle, ISBNNumber);
                    else
                        System.out.print("All copies of " + bookTitle + ISBNNumber
                                + " have been checked out already, sorry! :(");

                    return;
                } else {
                    continue;
                }
        }

        System.out.println(bookTitle + " doesn't exist - sorry!");
        System.out.println(ISBNNumber + " doesn't exist - sorry!");
    }

    // method returns a book back to the collection of books

    public static void returnBook(String bookTitle) {
        for (Map.Entry<BookCollection, String> entry : bookCatalog.entrySet()) {

            if (entry.getValue().equals(bookTitle))
            if (entry.getValue().equals(ISBNNumber))
             {
                BookCollection bc = (BookCollection) entry.getKey();
                if (bc.returnBook())
                    System.out.printf("You have successfully returned " + bookTitle,ISBNNumber);
                  
                else
                    System.out.printf(bookTitle,ISBNNumber + " cannot be returned at this time");
                    

                return;

            } else {
                continue;
            }
        }

        System.out.printf(bookTitle,ISBNNumber + " doesn't exist - sorry!");

    }

}
