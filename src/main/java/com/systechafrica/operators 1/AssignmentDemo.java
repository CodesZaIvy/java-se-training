package com.systechafrica.operators 1;

import java.util.logging.Logger;

public class AssignmentDemo {
    private static final Logger LOGGER = Logger.getLogger(AssignmentDemo.class.getName());

    public void assignmentOperators() {
        // simple assignment operator
        int quantity = 4500;

        // addition assignment operator

        quantity += 100; // > quantity = quantity + 100;
        LOGGER.info(" Addition Quantity :" + quantity);

        // subtraction assignment operator

        quantity -= 100; // > quantity = quantity - 100 ;
        LOGGER.info(" Subtraction Quantity :" + quantity);

        // division assignment operator

        quantity /= 100; // > quantity = quantity / 100 ;
        LOGGER.info(" Division Quantity :" + quantity);

        // multiplication assignment operator

        quantity *= 100; // > quantity = quantity * 100 ;
        LOGGER.info(" Multiplication Quantity :" + quantity);

        // modulo assignment operator

        quantity %= 100; // > quantity = quantity % 100 ;
        LOGGER.info(" Modulo Quantity :" + quantity);

    }

    public static void main(String[] args) {
        AssignmentDemo app = new AssignmentDemo();

        app.assignmentOperators();

    }

}
