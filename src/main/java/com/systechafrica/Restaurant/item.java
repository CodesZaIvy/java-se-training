package com.systechafrica.Restaurant;

public class item {
    private int itemNo;
    private String itemName;
    private double itemCost;
//Constructor
    public item(int itemNo, String itemName, double itemCost) {
        this.itemNo = itemNo;
        this.itemName = itemName;
        this.itemCost = itemCost;
    }

    public int getItemNo() {
        return itemNo;
    }

    public String getItemName() {
        return itemName;
    }

    public double getItemCost() {
        return itemCost;
    }

    @Override
    public String toString() {
        return "MenuItem [itemNo=" + itemNo + ", itemName=" + itemName + ", itemCost=" + itemCost + "]";
    }

    // @Override
    // public String toString() {
    // return name + " - $" + price;
    // }
    
}
