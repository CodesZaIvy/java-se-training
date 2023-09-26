package com.systechafrica.interface1;

public interface CalculatePerimeter {
    double calculatePerimeter(double x,double y);
    
//! java 1.8+ => You can have default implementation logic on the interface 
    default double sum(int a, int b)
{
        return 0;
}
}
