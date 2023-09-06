package com.systechafrica.operators;

import java.util.logging.Logger;

public class LogicalDemo {
    private static final Logger LOGGER = Logger.getLogger(LogicalDemo.class.getName());

    public void andLogicalOperators() {
        int studentOneAge = 17;
        int studentTwoAge = 18;

        boolean isStudentOneAllowed = studentOneAge >= 18;
        boolean isStudentTwoAllowed = studentTwoAge >= 18;

        // and operator
        if (isStudentOneAllowed && isStudentTwoAllowed) {
            LOGGER.info("All students allowed to vote");

        } else {
            LOGGER.info("Not allowed to vote");

        }

    }

    public void orLogicalOperators() {
        int studentOneAge = 17;
        int studentTwoAge = 25;

        boolean isStudentOneAllowed = studentOneAge >= 18;
        boolean isStudentTwoAllowed = studentTwoAge >= 18;

        // or operator
        if (isStudentOneAllowed || isStudentTwoAllowed) {
            LOGGER.info("Student allowed to vote");

        } else {
            LOGGER.info("Not allowed to vote");

        }

    }

    public void notLogicalOperator() {
        int studentOneAge = 17;

        boolean isStudentOneAllowed = studentOneAge >= 18;
        // not operator
        if (!isStudentOneAllowed) {
            LOGGER.info("Student allowed to vote");

        } else {
            LOGGER.info("Not allowed to vote");

        }
    }

    public static void main(String[] args) {
        LogicalDemo app = new LogicalDemo();

        app.andLogicalOperators();
        app.orLogicalOperators();
        app.notLogicalOperator();

    }
}
