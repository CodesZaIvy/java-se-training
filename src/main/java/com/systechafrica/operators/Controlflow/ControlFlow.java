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

        String day = "Monday";
        
        switch(day){
            case "MONDAY":
            LOGGER.info("Monday");
            break;
            //break is used so as to break the cycle 
            // i. e if i execute Monday,without the break command it will print out Monday and all the following days
            //that follow .
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
            //default can be used when the user doesn't specify the specific day 
            // i. e weekend instead of either saturday or sunday
            
        }

     }
    public void ifelseifStatement(){
        int Pio = 65;
        int Gama = 70;
        int Pinto = 80;

        if (Pio > Gama && Pio > Pinto) {
            LOGGER.info("Older employee"+ Pio ); 
        }else if(Gama > Pinto ){
            LOGGER.info(" Older employee : "+ Gama ); 
        }else
        LOGGER.info(" Older employee: "+ Pinto); 

}
     public static void main(String[] args) {
        ControlFlow app = new ControlFlow();
        //app.ifelseStatement();
        //app.switchStatement ();
        app.ifelseifStatement();

    }
     
}
