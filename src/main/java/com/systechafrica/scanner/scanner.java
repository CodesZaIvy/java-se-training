package com.systechafrica.scanner;
import java.util.Scanner;

public class scanner{
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.println("Enter an Integer:");
        int number = input.nextInt();
        System.out.println("You entered "+ number);

        input.close();
    }

}





