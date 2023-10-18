package com.systechafrica.utildate;

import java.time.LocalDate;

public class WorkingWithNewDateTime {
    public static void main(String[] args) {
        //no constuctor for Local Date ,hence there is no "new" Keyword
        LocalDate todayDate = LocalDate.now();
        System.out.println(todayDate);

        //adding five days 
        todayDate 
        = todayDate.plusDays(5);
        System.out.println(todayDate);

        //shows how strings are immutable
        String someString = "Some String";
        someString.replaceAll("some","");
        System.out.println(someString);


    }
    
}
