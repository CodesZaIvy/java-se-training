package com.systechafrica.library;

import java.util.Scanner;

public class Students {
    Scanner input = new Scanner(System.in);
    Student student[] = new Student[30];

    public static int count = 0;

    public void addStudent (Student s) 
     {
        for (int i = 0; i < count; i++) {
            if (s.studentRegistrationNumber.equalsIgnoreCase(
                student[i].studentRegistrationNumber))
        
             return;           
              System.out.println("Student of Registration Number "+
               s.studentRegistrationNumber + "is Already Registered");

               if (count <= 50) {
                student[count] = s;
                count++;
            }
    }
     }
    public void showAllStudents() {
        System.out.println("Student Registration\t");
        for (int i = 0; i < count; i++) {

            System.out.println(student[i].studentRegistrationNumber + "\t\t");

        }
    }

    public int isStudent() {
        System.out.println("Enter Registration Number:");
        String studentRegistrationNumber = input.nextLine();
        for (int i = 0; i < count; i++) {
            if (student[i].studentRegistrationNumber.equalsIgnoreCase(
                    studentRegistrationNumber)) {
                return i;
            }
        }
        System.out.println("Registered Student");
        return -1;
    }

    public void checkOutBook(Books Book) {
        int studentRegistrationNumber = this.isStudent();
        if (studentRegistrationNumber != -1) {
            System.out.println("Checking Out");

            Book.showAllBooks();
            Book b = Book.checkOutBook();

            System.out.println("Checking Out");
            if (b != null) {
                if (student[studentRegistrationNumber].bookCount <= 3) {
                    System.out.println("adding book");
                    student[studentRegistrationNumber].borrowedBooks[student[studentRegistrationNumber].bookCount] = b;
                    student[studentRegistrationNumber].bookCount++;

                    return;
                } else {
                    System.out.println("Student can Not Borrow more than 3 Books");
                    return;
                }
            }
            System.out.println("Book is not Available");

        }

    }

}
