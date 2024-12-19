package org.ies.airline.components;

import org.ies.airline.model.Passanger;

import java.util.Scanner;

public class PassangerReader {
    private Scanner scanner;

    public PassangerReader(Scanner scanner) {
        this.scanner = scanner;
    }
    public Passanger read(){
        System.out.println("Introduce el NIF");
        String nif = scanner.nextLine();
        System.out.println("Introduce tu nombre");
        String name = scanner.nextLine();
        System.out.println("Introduce tu apelllido");
        String surname = scanner.nextLine();
        System.out.println("Introduce tu número de asiento");
        Integer seatNumber = scanner.nextInt();
        scanner.nextLine();
return new Passanger(nif, name,surname,seatNumber);
    }
}
