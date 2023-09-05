package com.systechafrica;

import java.util.logging.Logger;

public class VariablesDemo {
    private static final Logger LOGGER =Logger.getLogger(VariablesDemo.class.getName());
     //
   
    
    private void variableDeclarations() {
        //integer variable
        //? type variableName
        int score = 0;
        LOGGER.info("Score interger variable value is" +score);
    }
     private void constantsVariable() {
        //?constant variable
        //final type variableName =value;
        final double PI = 3.14159;
        LOGGER.info("Constant variable "+ PI);
    }       
       private void integerTypes(){
        LOGGER.info("Integer Minimum" + Integer.MIN_VALUE);
        LOGGER.info("Integer Minimum" + Integer.MAX_VALUE);

        LOGGER.info("Long Minimum" + Long.MIN_VALUE);
        LOGGER.info("Long Maximum" + Long.MAX_VALUE);
        //byte,short,int,long
        //? wrapper classses
         
        byte aPrimitive = 23;
        Byte aWrapper = 23;

        LOGGER.info("byte primitive" + aPrimitive);
        LOGGER.info("Byte wrapper" + aWrapper );

        int a = aWrapper.intValue();
        LOGGER.info("Integer value Byte wrapper" + a);

        


} 
        private void floatingTypes(){
    //float type 
    float floatRate = 2.1457454F;
    double doubleRate = 2.1457454;
    LOGGER.info("float value" + floatRate );
    LOGGER.info("double value" + doubleRate );    


 }
          private void characterTypes(){
    //character type 
    char grade = 'A';
    LOGGER.info("character value" + grade);    
 }
       private void booleanTypes(){
    //boolean type 
    boolean isPromoted = false;
    boolean isProcessed = true;
    LOGGER.info("false value" + isPromoted);  
     LOGGER.info("true value" + isProcessed);  


 }
 public static void main(String[] args) {
        VariablesDemo demo = new VariablesDemo();

        demo.variableDeclarations();
        demo.constantsVariable();
        demo.integerTypes();
        demo.floatingTypes();
        demo.characterTypes();
        demo.booleanTypes();

 }

}






    