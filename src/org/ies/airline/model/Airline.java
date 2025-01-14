package org.ies.airline.model;

import java.util.Arrays;
import java.util.Objects;

public class Airline {
    private String name;
    private Flight[] flights;

    public Airline(String name, Flight[] flights) {
        this.name = name;
        this.flights = flights;
    }

    public void showFligth() {
        for (Flight flight : flights) {
            flight.showInfo();
        }
    }

    public void showFlightsFromOrigin(String origin) {
        for (Flight flight : flights) {
            if (flight.getOrigin().equals(origin)) {
                flight.showInfo();
            }
        }
    }

    public Flight findFlight(int flightNumber) {
        for (Flight flight : flights) {
            if (flight.getFlightNumber() == flightNumber) {
                return flight;
            }
        }
        return null;
    }

    public void showPassengerFlights(String nif) {
        for (Flight flight : flights) {
            if (flight.hasPassanger(nif)) {
                flight.showInfo();
            }
        }

    }

    public Integer getPassengerSeat(int flightNumber, String nif) {
        for (Flight flight : flights) {
            if (flight.getFlightNumber() == flightNumber) {
                for (Passanger passanger : flight.getPassangers()) {
                    if (passanger.getNif().equals(nif)) {
                        return passanger.getSeatNumber();
                    }
                }
            }
        }
        return null;
    }


    public void updateSeatNumber(int flightNumber, String nif, int seatNumber) {
        for (Flight flight : flights) {
            if (flight.getFlightNumber() == flightNumber) {
                for (Passanger passanger : flight.getPassangers()) {
                    if (passanger.getNif().equals(nif)) {
                        passanger.setSeatNumber(seatNumber);
                    }
                }
            } else {
                System.out.println("Error");
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Flight[] getFlights() {
        return flights;
    }

    public void setFlights(Flight[] flights) {
        this.flights = flights;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Airline airline = (Airline) o;
        return Objects.equals(name, airline.name) && Objects.deepEquals(flights, airline.flights);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, Arrays.hashCode(flights));
    }

    @Override
    public String toString() {
        return "Airline{" +
                "name='" + name + '\'' +
                ", flights=" + Arrays.toString(flights) +
                '}';
    }
}
