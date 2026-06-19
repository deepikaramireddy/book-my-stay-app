package com.bookmystay;

import java.util.LinkedList;
import java.util.Queue;

public class BookingQueueService {

    Queue<Reservation> bookingQueue =
            new LinkedList<>();

    public void addBookingRequest(
            Reservation reservation){

        bookingQueue.offer(reservation);

        System.out.println(
                reservation.getCustomerName()
                        + " added to queue");
    }

    public void processBookings(){

        while(!bookingQueue.isEmpty()){

            Reservation reservation =
                    bookingQueue.poll();

            System.out.println(
                    "Processing : "
                            + reservation.getCustomerName());
        }
    }
}