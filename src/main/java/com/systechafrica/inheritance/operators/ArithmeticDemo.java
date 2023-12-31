package com.systechafrica.operators;

import java.util.logging.Logger;

public class ArithmeticDemo {
    private static final Logger LOGGER=Logger.getLogger(ArithmeticDemo.class.getName());
    public void arithmeticOperators(){

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
public static void main(String[] args) {
    ArithmeticDemo app = new ArithmeticDemo();
    app.arithmeticOperators();
}
}
