package com.bookmystay;

public class BookMyStayMain {
    public static void main(String[] args) {
        System.out.println(" ");

        //usecase1
        RoomInventoryService inventory =
                new RoomInventoryService();

        inventory.addRoom("Single",10,2500);
        inventory.addRoom("Double",5,4000);
        inventory.addRoom("Suite",2,8000);

        inventory.displayInventory();

        //usecase2
        RoomSearchService search =
                new RoomSearchService();

        search.searchAvailableRooms(
                inventory.getRoomInventory(),
                inventory.getRoomPrices());
    }
}