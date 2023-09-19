package com.systechafrica.TypeConverison;

import java.util.logging.Logger;


public class conversions {

     private  static final Logger LOGGER = Logger.getLogger(conversions.class.getName());
    
 /**
 * 
 */
public void casting_conversions(){


    byte b = 126;
    int a = b;
    //casting the int into a byte using (byte)a
    byte j =(byte)a;
    float f = 5.6f;
    //casting the float into an int using (int)f
    int t = (int) f;

    LOGGER.info(t);

}
public void type_promoting(){
   byte j =10;
   byte i= 30;

   int result = i*j;

   LOGGER.info("result");

}
     
    public static void main(String[] args) {  

        conversions app = new conversions();
        app.casting_conversions();
        app.type_promoting();
    }
}
