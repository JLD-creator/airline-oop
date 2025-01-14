package org.ies.airline.components;

import org.ies.airline.model.Airline;

import java.util.Scanner;

public class AirlineAppMenu {
    private final Scanner scanner;
    private final AirlineReader airlineReader;

    public AirlineAppMenu(Scanner scanner, AirlineReader airlineReader) {
        this.scanner = scanner;
        this.airlineReader = airlineReader;
    }
    public void run(){
        Airline airline = airlineReader.read();
        int option;
        do {
            System.out.println("1. Muestra todos los vuelos");
            System.out.println("2. Mostrar vuelos de origen ");
            System.out.println("3. Muestra los vuelos de pasajero");
            System.out.println("4. Muestra asiento de pasajero");
            System.out.println("5. Cambiar asiento pasajero ");
            System.out.println("6. Salir ");
            System.out.println("Elige una opcion");
            option = scanner.nextInt();
            scanner.nextLine();
            if (option == 1){
                airline.showFligth();
            } else if (option == 2) {
                System.out.println("Introduce un lugar de origen");
                String origin = scanner.nextLine();
                airline.showFlightsFromOrigin(origin);
            } else if (option == 3) {
                System.out.println("Introduce un NIF");
                String nif = scanner.nextLine();
                airline.showPassengerFlights(nif);

            } else if (option == 4) {
                System.out.println("Introduce un número de vuelo");
                int fligthNumber = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Introduce un NIF");
                String nif = scanner.nextLine();
                airline.getPassengerSeat(fligthNumber, nif);

            } else if (option == 5) {
                System.out.println("Introduce un número de vuelo");
                int fligthNumber = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Introduce un NIF");
                String nif = scanner.nextLine();
                System.out.println("Introduce un número de asiento");
                int seatNumber = scanner.nextInt();
                scanner.nextLine();
                airline.updateSeatNumber(fligthNumber, nif, seatNumber);

            } else if (option ==6) {
                System.out.println("Saliendo");
            }
        }while (option!= 6);
    }
}
