package com.systechafrica.mycollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;


//Create a LinkedHashSet
//Elements stored in HashTables
//LinkedHashSet<Integer> numbers = new LinkedHashSet<>(6, 0.75);
// Capacity - it can store 8 elements. 
//loadFactor - The load factor of this hash set is 0.6.
// This means, whenever our hash table is filled by 60%, the elements are moved to a new hash table of double the size of the original hash table.
//By default,
//?the capacity of the linked hash set will be 16
//?the load factor will be 0.75
public class LinkedHashSetClass {
 

    public static void main(String[] args) {
        // Creating an arraylist to the cameras in store and using add() method
        ArrayList<String> Cameras = new ArrayList<>();
        Cameras.add("Nikon");
        Cameras.add("Fijifilm");
        Cameras.add("Sony");
        Cameras.add("Canon");
        Cameras.add("GoPro");
        Cameras.add("Olympus");
        System.out.println("You can buy: "+ Cameras);


        // Creating a LinkedhashSet from an Arraylist
        LinkedHashSet<String> Photography = new LinkedHashSet<>(Cameras);
        //System.out.println("Good Photos are taken by  : " + Photography);

        //Insert Elements to a LinkedHashSet using addAll() method
        Cameras.addAll(Photography);
        Cameras.add("Kodak");
        //?Why Did it not add Kodak
        System.out.println("Good Photos Are taken by These Cameras :"+  Photography);


      //Calling the iterator () method
      Iterator<String> iterate = Cameras.iterator();

      System.out.println("LinkedHash using Iterator: ");

      //Accessing elements
      while (iterate.hasNext()) {
        System.out.println(iterate.next());
        System.out.print(" ,");
        


      //removing Elements
      boolean string1 = Cameras.remove(1) != null;
      System.out.println( "Is Fujifilm camera removed?" + string1);

      boolean string2 = Cameras.removeAll(Cameras);
      System.out.println("Are all Cameras removed?" + string2);

      }



        
      }


}
