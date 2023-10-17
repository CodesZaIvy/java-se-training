package com.systechafrica.mycollection;

import java.util.ArrayList;

public class ArrayListClass {
 //! ArrayList grows its size automatically when new elements are added to i

   public static void main(String[] args) {
    
   
    //Create Arraylist
    ArrayList<String> books  = new ArrayList<>();

    //Add elements to ArrayList
    //add() method without the index parameter
    books.add("Aleph");
    books.add("The Alchemist");
    books.add("Eleven Minutes");
    books.add("The Zahir");
    books.add("By The River Piedra ,I Sat Down and Wept");

    

    
    System.out.println("Paulo Choelo Books:" + books);


    //getting element from array list
    String string = books.get(0);
    String string1 = books.get(1);
    String string2 = books.get(2);
    String string3 = books.get(3);
    String string4 = books.get(4);



    System.out.print("Book at Index 0:" + string1); 
    System.out.print("Book at Index 1:" + string2);
    System.out.print("Book at Index 2:" + string3);
    System.out.print("Book at Index 3:" + string4);
    System.out.print("Book at Index 4:" + string);

    //change the elements of the array list
// changed By the river Piedra book to Maktub at index 4
    books.set(4, "Maktub");
    System.out.println("Modified Paulo Coehlo Books:" + books);


    //remove element from index 3
    String str = books.remove(3);
    System.out.println("Updated Paulo Coelho Books" + books);
    System.out.println("Removed Book:" + str);
    
    
    //iterate using for-each loop
    System.out.println("Accessing Individual Books:  ");

    for(String book : books ){
        System.out.println(book);
        System.out.print(": ");

    }
 }
}

