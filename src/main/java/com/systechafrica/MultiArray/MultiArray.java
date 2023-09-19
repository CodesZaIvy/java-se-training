package com.systechafrica.MultiArray;
import java.util.logging.Logger;

public class MultiArray {

private static final Logger LOGGER = Logger.getLogger(MultiArray.class.getName());
        public void multiDimArray(){
            String[][] names = {
            {"Mr. ", "Mrs. ", "Ms. "},
            {"Smith", "Jones"}
        }  ;
  
        // Mr. Smith
        LOGGER.info(names[0][0] + names[1][0]);
        // Ms. Jones
         LOGGER.info(names[0][2] + names[1][1]);
    }  
         public static void main(String[] args) {
            MultiArray app = new MultiArray();
            app.multiDimArray();
       
    }
 }

    

    


    

