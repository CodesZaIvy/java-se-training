package com.systechafrica.pos;

import java.util.logging.Logger;

public class Item {
    private static final Logger LOGGER = Logger.getLogger(Item.class.getName());
    // properties
    private String itemCode;
    private int quantity;
    private double unitPrice;

    public Item() {

    }

    // constructor
    public Item(String itemCode, int quantity, double unitPrice) {
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

    // setter and getter methods
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

    @Override
    public String toString() {
        return "Item [itemCode=" + itemCode + ", quantity=" + quantity + ", unitPrice=" + unitPrice + "]";
    }

}
