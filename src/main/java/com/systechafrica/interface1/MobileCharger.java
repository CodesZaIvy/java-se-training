package com.systechafrica.interface1;

public class MobileCharger implements ThreePlugPin {

    @Override
    public boolean plugIn() {
       System.out.println("Mobile Charger Connected");
        return true;
    }

    @Override
    public boolean plugOut() {
        System.out.println("Mobile Charger Disonnected");
        return true;
    }
}

   