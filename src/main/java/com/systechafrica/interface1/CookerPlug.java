package com.systechafrica.interface1;

public class CookerPlug implements ThreePlugPin {

    @Override
    public boolean plugIn() {
        System.out.println("Cooker Plug Connected");
        return true;
    }

    @Override
    public boolean plugOut() {
      System.out.println("Cooker Plug Disonnected");
        return true;
    }
    
}
