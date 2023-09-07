package com.systechafrica.operators;

import java.util.logging.Logger;

public class loop {
    private static final Logger LOGGER = Logger.getLogger(loop.class.getName());

    public void While() {


        int i = 1;
        while (i<=4)
{
        LOGGER.info("Accept Client:"+ i);

         //print the inner loop(j) inside the outer one(i)
        int j = 1;
        while (j<=3){
        LOGGER.info("Receipt No. :"+ j);
        j++;
        }
        //to increment by one 
        i++;
        

}
//will print it as an incremented number as it is out of the loop 
//aka a nested while loop
   LOGGER.info("Stop Printing:"+ i);
    }
    public void doWhile(){
         int i = 1;
         do
        
{
        LOGGER.info("Accept Client:"+ i);
            i++;
         }while (i<=4);
        }
    public static void main(String[] args) {
        loop app = new loop();
        //app.While();
        app.doWhile();
    }

}
