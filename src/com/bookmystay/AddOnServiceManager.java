package com.bookmystay;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AddOnServiceManager {

    private Map<String, List<Service>>
            reservationServices =
            new HashMap<>();

    public void addService(String reservationId,
                           Service service) {

        reservationServices
                .computeIfAbsent(
                        reservationId,
                        k -> new ArrayList<>())
                .add(service);

        System.out.println(
                service.getServiceName()
                        + " added for "
                        + reservationId);
    }

    public void displayServices(
            String reservationId) {

        System.out.println(
                "\nServices for "
                        + reservationId);

        List<Service> services =
                reservationServices.get(
                        reservationId);

        if (services != null) {

            for (Service service : services) {

                System.out.println(service);
            }
        }
    }

    public double calculateTotalCost(
            String reservationId) {

        double total = 0;

        List<Service> services =
                reservationServices.get(
                        reservationId);

        if (services != null) {

            for (Service service : services) {

                total += service.getServiceCost();
            }
        }

        return total;
    }
}