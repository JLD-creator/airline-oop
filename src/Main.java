import org.ies.airline.components.AirlineApp1;
import org.ies.airline.components.AirlineReader;
import org.ies.airline.components.FlightReader;
import org.ies.airline.components.PassangerReader;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PassangerReader passangerReader = new PassangerReader(scanner);
        FlightReader flightReader = new FlightReader(scanner, passangerReader);
        AirlineReader airlineReader = new AirlineReader(scanner, flightReader);
        AirlineApp1 airlineApp1 = new AirlineApp1(scanner,airlineReader,passangerReader,flightReader);
        airlineApp1.run();
    }
}