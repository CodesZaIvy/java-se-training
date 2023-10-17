package com.systechafrica.functionalprogramming;

import java.util.UUID;

public class Lambda {

    public static void main(String[] args) {
        //single line lambda function
        Lambdafun func = () -> UUID.randomUUID().toString();


        //Multi line lambda function
        Lambdafun func2 = () -> {
            String randomUUID = UUID.randomUUID().toString();
            System.out.println(randomUUID);
            return randomUUID.substring(5);

        };
System.out.println(func.generateRandomUUID());
System.out.println(func2.generateRandomUUID());


GenerateReport report = (student) -> {
    
     

    }

    }

}
