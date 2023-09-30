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
        //executes the condition once
{
        LOGGER.info("Accept Client:"+ i);
            i++;
         }while (i<=4);
        }
   public void ForLoop(){


    //creating a work schedule 
   for (int i = 1;i<=5;i++)
    //Days of the week 
   //int i =1 (Set initial value)
   //i<=5 (check fot the condition)
   // i++ (increment or decrement)
 {
    
    LOGGER.info("Day:"+ i);
   //Working hours 
    for (int j=1; j<=9 ;j++)
    LOGGER.info("Hour:"  + (j+8) +"-"+(j+9));
    //encapsulation
 }

 }
        public static void main(String[] args) {
        loop app = new loop();
        //app.While();
        //app.doWhile();
        app.ForLoop();
    }


}
