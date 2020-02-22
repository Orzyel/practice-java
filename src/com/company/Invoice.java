package com.company;

public class Invoice {
    String partNumber;
    String description;
    int quantity;
    double price;
    public Invoice (String partNumber, String description, int quantity, double price){

        this.partNumber=partNumber;
        this.description=description;
        this.quantity=quantity;
        this.price=price;

    }

    public double getPrice() {
        return price;
    }

    public int getQuantity(){
        return quantity;
    }

    public String getDescription(){
        return description;
    }

    public String getPartNumber(){
        return partNumber;
    }

    public void setPartNumber(String partNumber){
        this.partNumber=partNumber;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}
