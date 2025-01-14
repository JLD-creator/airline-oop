import org.ies.airline.components.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PassangerReader passangerReader = new PassangerReader(scanner);
        FlightReader flightReader = new FlightReader(scanner, passangerReader);
        AirlineReader airlineReader = new AirlineReader(scanner, flightReader);
        AirlineAppMenu airlineAppMenu = new AirlineAppMenu(scanner, airlineReader);
        airlineAppMenu.run();
    }
}