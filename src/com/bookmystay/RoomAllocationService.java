package com.bookmystay;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RoomAllocationService {

    private Set<String> bookedRoomIds = new HashSet<>();

    private Map<String, Set<String>> allocatedRooms =
            new HashMap<>();

    public void allocateRoom(Reservation reservation,
                             String roomId) {

        if (bookedRoomIds.contains(roomId)) {

            System.out.println("Room " + roomId +
                    " is already allocated.");
            return;
        }

        bookedRoomIds.add(roomId);

        allocatedRooms
                .computeIfAbsent(
                        reservation.getRoomType(),
                        k -> new HashSet<>())
                .add(roomId);

        System.out.println(
                roomId +
                        " allocated to " +
                        reservation.getCustomerName());
    }

    public void displayAllocatedRooms() {

        System.out.println("\nALLOCATED ROOMS");

        for (String roomType : allocatedRooms.keySet()) {

            System.out.println(
                    roomType + " -> "
                            + allocatedRooms.get(roomType));
        }
    }
}