package org.ies.airline.model;

import java.util.Arrays;
import java.util.Objects;

public class Flight {
    private int flightNumber;
    private String origin;
    private String destinantion;
    private int gateNumber;
    private Passanger[] passangers;

    public Flight(int flightNumber, String origin, String destinantion, int gateNumber, Passanger[] passangers) {
        this.flightNumber = flightNumber;
        this.origin = origin;
        this.destinantion = destinantion;
        this.gateNumber = gateNumber;
        this.passangers = passangers;
    }

    public void showInfo() {
        System.out.println("Número de vuelo: " + flightNumber + ", Origen: " + origin + ", Destino: " + destinantion + ", Puerta de enmbarque: " + gateNumber + ", pasajeros:");
        for (Passanger passanger : passangers) {
            passanger.showInfo();
        }
    }

    public boolean hasPassanger(String nif) {
        for (Passanger passanger : passangers) {
            if (passanger.getNif().equals(nif)) {
                return true;
            }
        }
        return false;
    }

    public Passanger findPassanger(String nif) {
        for (Passanger passanger : passangers) {
            if (passanger.getNif().equals(nif)) {
                return passanger;
            }
        }
        return null;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestinantion() {
        return destinantion;
    }

    public void setDestinantion(String destinantion) {
        this.destinantion = destinantion;
    }

    public int getGateNumber() {
        return gateNumber;
    }

    public void setGateNumber(int gateNumber) {
        this.gateNumber = gateNumber;
    }

    public Passanger[] getPassangers() {
        return passangers;
    }

    public void setPassangers(Passanger[] passangers) {
        this.passangers = passangers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return flightNumber == flight.flightNumber && gateNumber == flight.gateNumber && Objects.equals(origin, flight.origin) && Objects.equals(destinantion, flight.destinantion) && Objects.deepEquals(passangers, flight.passangers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flightNumber, origin, destinantion, gateNumber, Arrays.hashCode(passangers));
    }

    @Override
    public String toString() {
        return "Flight{" +
                "flightNumber=" + flightNumber +
                ", origin='" + origin + '\'' +
                ", destinantion='" + destinantion + '\'' +
                ", gateNumber=" + gateNumber +
                ", passangers=" + Arrays.toString(passangers) +
                '}';
    }
}
