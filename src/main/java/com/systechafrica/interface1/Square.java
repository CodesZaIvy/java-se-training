package com.systechafrica.interface1;

public class Square implements CalculateArea,CalculatePerimeter {

    @Override
    public double calculateArea(double x, double y) {
       System.out.println(MY_NAME);
        return x*y;
        
    }

    @Override
    public double calculatePerimeter(double x, double y) {
        System.out.println(MY_NAME_Full);
       
        return 2*(x+y);
        
        
        
    }

    @Override
    public double sum(int a, int b) {
        
        return a+b;
    }

    
}
