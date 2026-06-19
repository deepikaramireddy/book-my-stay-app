package com.bookmystay;

import java.util.ArrayList;
import java.util.List;

public class BookingHistoryService {

    private List<Reservation>
            bookingHistory =
            new ArrayList<>();

    public void addReservation(
            Reservation reservation) {

        bookingHistory.add(reservation);

        System.out.println(
                reservation.getReservationId()
                        + " added to history");
    }

    public void displayBookingHistory() {

        System.out.println(
                "\nBOOKING HISTORY");

        for (Reservation reservation
                : bookingHistory) {

            System.out.println(
                    reservation.getReservationId()
                            + " | "
                            + reservation.getCustomerName()
                            + " | "
                            + reservation.getRoomType());
        }
    }

    public int getTotalBookings() {

        return bookingHistory.size();
    }
}