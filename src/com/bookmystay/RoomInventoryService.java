package com.bookmystay;
import java.util.HashMap;
import java.util.Map;

public class RoomInventoryService {

    private Map<String,Integer> roomInventory =
            new HashMap<>();

    private Map<String,Double> roomPrices =
            new HashMap<>();

    public void addRoom(String roomType,
                        int count,
                        double price){

        roomInventory.put(roomType,count);
        roomPrices.put(roomType,price);
    }

    public void displayInventory(){

        System.out.println("ROOM INVENTORY");

        for(String roomType : roomInventory.keySet()){

            System.out.println(
                    roomType +
                            " Count : " +
                            roomInventory.get(roomType) +
                            " Price : " +
                            roomPrices.get(roomType));
        }
    }

    public Map<String,Integer> getRoomInventory(){
        return roomInventory;
    }

    public Map<String,Double> getRoomPrices(){
        return roomPrices;
    }
}