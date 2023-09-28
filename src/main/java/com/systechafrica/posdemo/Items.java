package com.systechafrica.posdemo;

import java.util.logging.Logger;

public class Items {
    private static final Logger LOGGER = Logger.getLogger(Items.class.getName());
    // properties
    private String itemCode;
    private int quantity;
    private double unitPrice;

    

    public Items() {
    }


    public Items(String itemCode, int quantity, double unitPrice) {
        this.itemCode = itemCode;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    // the method getTotalValue()Calculates and returns the total value of items,
    // its gotten by the product of its quantity and unit price.
    public double getTotalValue() {
        double totalValue = quantity * unitPrice;
        return totalValue;
    }

    public static Logger getLogger() {
        return LOGGER;
    }
    public String getItemCode() {
        return itemCode;
    }
    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public double getUnitPrice() {
        return unitPrice;
    }
    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    
    
}
