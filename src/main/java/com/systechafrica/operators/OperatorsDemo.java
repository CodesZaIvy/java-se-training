package com.systechafrica.operators;


import java.util.logging.Logger;


public class OperatorsDemo {
    private static final Logger LOGGER =Logger.getLogger(OperatorsDemo.class.getName());

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
    
    public void comparisonOperators(){
        int studentOneAge = 20;
        int studentTwoAge = 25;

        //equality operator
        boolean isStudentOneAgeEqualToStudentTwoAge = studentOneAge == studentTwoAge;
     LOGGER.info(" isStudentOneAgeEqualToStudentTwoAge :" + isStudentOneAgeEqualToStudentTwoAge );

            //inequality operator
        boolean isStudentOneAgeNotEqualToStudentTwoAge = studentOneAge != studentTwoAge;
     LOGGER.info(" isStudentOneAgeNotEqualToStudentTwoAge :" + isStudentOneAgeNotEqualToStudentTwoAge );

            // less than
    boolean isStudentOneAgeLessThanStudentTwoAge = studentOneAge < studentTwoAge;
     LOGGER.info(" isStudentOneAgeLessThanStudentTwoAge :" + isStudentOneAgeLessThanStudentTwoAge );

     // greater than
       boolean isStudentOneAgeGreaterThanStudentTwoAge = studentOneAge > studentTwoAge;
     LOGGER.info(" isStudentOneAgeGreaterThanStudentTwoAge :" + isStudentOneAgeGreaterThanStudentTwoAge );

     //less than or equal to 
       boolean isStudentOneAgeLessThanOrEqualToStudentTwoAge = studentOneAge <= studentTwoAge;
     LOGGER.info(" isStudentOneAgeLessThanEqualToOrStudentTwoAge :" + isStudentOneAgeLessThanOrEqualToStudentTwoAge);
     // greater than or equal to
       boolean isStudentOneAgeGreaterThanOrEqualToStudentTwoAge = studentOneAge >= studentTwoAge;
     LOGGER.info(" isStudentOneAgeGreaterThanOrEqualToStudentTwoAge :" + isStudentOneAgeGreaterThanOrEqualToStudentTwoAge );



    }
    public static void main(String[] args) {
        OperatorsDemo app = new OperatorsDemo();
    
        app.assignmentOperators();
        app.comparisonOperators();


    }
    
}

