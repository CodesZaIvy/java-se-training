package com.systechafrica.stringandstringbuilder;

import java.util.logging.Logger;


public class StringClassDemo {

    private static final Logger LOGGER = Logger.getLogger(StringClassDemo.class.getName());
 public void Stringbuilder(){


    String name = "Pinto";
    //creating a new object
    //?strings are immutable -they cant be changed/modified
    //?Unless they are reassigned again

    name = name + " pio";
    

    LOGGER.info("Client name: "+ name); 


    

 

 }  
    public static void main(String[] args) {
        //strings always have to have double quotes
            // only works with add (+) operator
        StringClassDemo app = new StringClassDemo();
        // A string variable
            app.Stringbuilder();
    

    }
}
