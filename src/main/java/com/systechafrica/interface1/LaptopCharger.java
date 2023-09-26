package com.systechafrica.interface1;

public class LaptopCharger implements ThreePlugPin{

    @Override
    public boolean plugIn() {
        System.out.println("Laptop Charger Connected");
        return true;
    }

    @Override
    public boolean plugOut() {
         System.out.println("Laptop Charger Disconnected");
        return true;
    }
    
}
