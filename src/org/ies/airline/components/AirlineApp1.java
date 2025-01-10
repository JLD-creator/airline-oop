package org.ies.airline.components;

import org.ies.airline.model.Airline;
import org.ies.airline.model.Flight;
import org.ies.airline.model.Passanger;

import java.util.Scanner;

public class AirlineApp1 {
    private final Scanner scanner;
    private final AirlineReader airlineReader;
    private final PassangerReader passangerReader;
    private final FlightReader flightReader;

    public AirlineApp1(Scanner scanner, AirlineReader airlineReader, PassangerReader passangerReader, FlightReader flightReader) {
        this.scanner = scanner;
        this.airlineReader = airlineReader;
        this.passangerReader = passangerReader;
        this.flightReader = flightReader;
    }

    public void run() {
        Airline airline = airlineReader.read();
        System.out.println("Introduce el número de vuelo");
        int flightNumber = scanner.nextInt();
        scanner.nextLine();
        Flight flight = airline.findFlight(flightNumber);
        if (flight != null) {
            System.out.println("Introduce el NIF de un usuario");
            String nif = scanner.nextLine();
            Passanger passanger2 = flight.findPassanger(nif);
            if (passanger2 != null) {
                passanger2.showInfo();
                System.out.println("Introduce el número dee asiento");
                Integer seatNumber = scanner.nextInt();
                airline.updateSeatNumber(flightNumber, passanger2.getNif(), seatNumber);
            } else {
                System.out.println("Error no se ha encontrado al pasajero");
            }
        } else {
            System.out.println("Error, vuelo no encontrado");
        }
    }
}
