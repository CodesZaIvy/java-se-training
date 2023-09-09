package com.systechafrica.stringandstringbuilder;

import java.util.logging.Logger;

public class Concat {
    private static final Logger LOGGER = Logger.getLogger(Concat.class.getName());

    public void concat() {
        // ?Concatenation is the process of combining two or more strings to form a new
        // string
        // ?by subsequently appending the next string to the end of the previous
        // strings.

        String first = "John";
        String second = "Oenga";

        // String third = first + second;is equal to
        //String third = first.concat(second);


        //?You can also directly concatenate the strings within the println method itself as System.out.println(first + second); 
        //?or System.out.println(first.concat(second));.

        //LOGGER.info(third);
        LOGGER.info(first.concat(second));

    }

    public static void main(String[] args) {
        Concat app = new Concat();

        app.concat();

    }
}