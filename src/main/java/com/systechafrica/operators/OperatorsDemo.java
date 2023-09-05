package com.systechafrica.operators;


import java.util.logging.Logger;


public class OperatorsDemo {
    private static final Logger LOGGER =Logger.getLogger(OperatorsDemo.class.getName());

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
    
        
        app.comparisonOperators();


    }
    
}

