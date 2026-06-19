package com.bookmystay;

import java.util.Map;

public class RoomSearchService {

    public void searchAvailableRooms(
            Map<String,Integer> inventory,
            Map<String,Double> prices){

        System.out.println("\nAVAILABLE ROOMS");

        for(String roomType : inventory.keySet()){

            if(inventory.get(roomType) > 0){

                System.out.println(
                        roomType +
                                " Price : " +
                                prices.get(roomType));
            }
        }
    }
}