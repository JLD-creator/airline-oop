package org.ies.airline.components;

import org.ies.airline.model.Flight;
import org.ies.airline.model.Passanger;

import java.util.Scanner;

public class FlightReader {
    private Scanner scanner;
    private PassangerReader passangerReader;

    public FlightReader(Scanner scanner, PassangerReader passangerReader) {
        this.scanner = scanner;
        this.passangerReader = passangerReader;
    }

    public Flight read(){
        System.out.println("Introduce el numero de vuelo");
        int fligthNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Introduce el lugar de origen del vuelo");
        String origin = scanner.nextLine();
        System.out.println("Introduce el lugar de destino del vuelo");
        String destination = scanner.nextLine();
        System.out.println("Introduce el numero de la puerta de ambarque");
        int gateNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Introduce los pasajeros");
        int size = scanner.nextInt();
        scanner.nextLine();
        Passanger[] passangers = new Passanger[size];
        for (int i = 0; i < passangers.length; i++){
         passangers[i] = passangerReader.reda();
        }
        return new Flight(fligthNumber, origin,destination,gateNumber,passangers);
    }
}
