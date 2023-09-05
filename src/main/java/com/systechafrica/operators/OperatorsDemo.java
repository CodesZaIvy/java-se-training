package com.systechafrica.operators;

import java.util.logging.Logger;


public class OperatorsDemo {
    private static final Logger LOGGER =Logger.getLogger(OperatorsDemo.class.getName());

    private void arithmeticOperators(){

    //Addition Operator

        int studentOneAge = 22;
         int studentTwoAge = 19;

         int totalClassAge = studentOneAge + studentTwoAge;

         LOGGER.info("Total class Age :" +  totalClassAge);

    //subtraction Operator
         int ageDifference = studentOneAge - studentTwoAge;

         LOGGER.info("Age Difference : "  +  ageDifference);

    //product of ages (Multiplication)
        int ageProduct = studentOneAge * studentTwoAge;

        LOGGER.info("Age Product : " +  ageProduct );

    //division operator
    //?division between integers result to int value otherwise double value

    int divisionResult =  studentOneAge / studentTwoAge;
     LOGGER.info("Age division : " +  divisionResult );

    //!To ensure correct result precision 

    double divisionResultInDouble =  (double)studentOneAge / studentTwoAge;
     LOGGER.info("Age division in precision :" + divisionResultInDouble );


     //modulus operator(Remainder of division result)

    int remainder =  studentOneAge % studentTwoAge;
     LOGGER.info("Age remainder : " +  remainder );


     





}
    private void assignmentOperators(){
        //simple assignment operator  
        int quantity = 4500;
    
        // addition assignment operator

        quantity += 100; // > quantity = quantity + 100;
        LOGGER.info(" Addition Quantity :" + quantity);

        // subtraction assignment operator

        quantity -= 100; // > quantity = quantity - 100 ;
        LOGGER.info(" Subtraction Quantity :" + quantity);

        // division assignment operator

        quantity /= 100; // > quantity = quantity / 100 ;
        LOGGER.info(" Division Quantity :" +  quantity);

        // multiplication assignment operator

        quantity *= 100; // > quantity = quantity * 100 ;
        LOGGER.info(" Multiplication Quantity :" + quantity);

        // modulo assignment operator

        quantity %= 100; // > quantity = quantity % 100 ;
        LOGGER.info(" Modulo Quantity :" + quantity);

        
    }

    public static void main(String[] args) {
        OperatorsDemo app = new OperatorsDemo();
        app.arithmeticOperators();
        app.assignmentOperators();
    }
    
}
