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

        //usecase3
        BookingQueueService queue =
                new BookingQueueService();

        queue.addBookingRequest(
                new Reservation("R101",
                        "Deepika",
                        "Single"));

        queue.addBookingRequest(
                new Reservation("R102",
                        "Priya",
                        "Double"));

        queue.processBookings();

        //usecase4
        RoomAllocationService allocationService =
                new RoomAllocationService();

        Reservation r1 =
                new Reservation("R101",
                        "Deepika",
                        "Single");

        Reservation r2 =
                new Reservation("R102",
                        "Priya",
                        "Double");

        allocationService.allocateRoom(r1, "S101");
        allocationService.allocateRoom(r2, "D201");

        allocationService.displayAllocatedRooms();

        //usecase5
        AddOnServiceManager serviceManager =
                new AddOnServiceManager();

        serviceManager.addService(
                "R101",
                new Service("Breakfast", 500));

        serviceManager.addService(
                "R101",
                new Service("Airport Pickup", 1000));

        serviceManager.displayServices("R101");

        System.out.println(
                "Additional Cost : ₹"
                        + serviceManager
                        .calculateTotalCost("R101"));

        //usecase6
        BookingHistoryService historyService =
                new BookingHistoryService();

        historyService.addReservation(r1);
        historyService.addReservation(r2);

        historyService.displayBookingHistory();

        System.out.println(
                "\nTotal Bookings : "
                        + historyService
                        .getTotalBookings());
    }
}