package com.systechafrica.operators.Controlflow;

import java.util.logging.Logger;

public class ControlFlow {
    private static final Logger LOGGER = Logger.getLogger(ControlFlow.class.getName());

    public void ifelseStatement() {
         int maths = 65;
        char grade;

        if (maths >= 70) {
            grade = ('A');
        }else{
            grade = ('B');
        }
            LOGGER.info("Student grade: "+  grade);

        
    }
     public void switchStatement() {
        String day = "Weekend";
        switch(day){
            case "MONDAY":
            LOGGER.info("Monday");
            break;
             case "TUESDAY":
            LOGGER.info("Tuesday");
            break;
             case "WEDNESDAY":
            LOGGER.info("Wednesday");
            break;
             case "THURSDAY":
            LOGGER.info("Thursday");
            break;
             case "FRIDAY":
            LOGGER.info("Friday");
            break;
             case "SATURDAY":
            LOGGER.info("Saturday");
            break;
             case "SUNDAY":
            LOGGER.info("Sunday");
            break;
            default:
            LOGGER.info("Enter the specific day");
            
        }

     }
    public static void main(String[] args) {
        ControlFlow app = new ControlFlow();
        //app.ifelseStatement();
        app.switchStatement ();

    }
     
}
