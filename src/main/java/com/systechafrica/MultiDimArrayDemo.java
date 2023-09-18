package com.systechafrica;

import java.util.logging.Logger;

public class MultiDimArrayDemo {
        
private static final Logger LOGGER = Logger.getLogger(MultiDimArrayDemo.class.getName());
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
            MultiDimArrayDemo app = new MultiDimArrayDemo();
            app.multiDimArray();
       
    }
    }

    

    

