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
     }
    public static void main(String[] args) {
        ControlFlow app = new ControlFlow();
        app.ifelseStatement();
        app.switchStatement ();

    }
     
}
