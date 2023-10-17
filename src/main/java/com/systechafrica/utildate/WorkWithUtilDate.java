package com.systechafrica.utildate;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class WorkWithUtilDate{
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);

        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.MONTH, 2);

        System.out.println(calendar.getTime());


    try(Scanner scanner = new Scanner(System.in)){
        System.out.println("Enter Date:");
        String dateString = scanner.nextLine();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        DateFormat df2 = new SimpleDateFormat("yyyy-MM-dd");

        Date tomorrowDate =df.parse(dateString);
        System.out.println(df2.format(tomorrowDate));
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }

        
    }


   
 }