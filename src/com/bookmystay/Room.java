package com.bookmystay;

public class Room {

    private String roomType;
    private int count;
    private double price;

    public Room(String roomType, int count, double price) {
        this.roomType = roomType;
        this.count = count;
        this.price = price;
    }

    public String getRoomType() {
        return roomType;
    }

    public int getCount() {
        return count;
    }

    public double getPrice() {
        return price;
    }
}