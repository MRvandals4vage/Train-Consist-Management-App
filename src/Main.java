import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Passenger Bogie List
        List<String> passengerBogies = new ArrayList<>();

        // ADD Operation
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("\nPassenger bogies after addition:");
        System.out.println(passengerBogies);

        // REMOVE Operation
        passengerBogies.remove("AC Chair");

        System.out.println("\nAfter removing 'AC Chair':");
        System.out.println(passengerBogies);

        // CHECK EXISTENCE
        boolean exists = passengerBogies.contains("Sleeper");
        System.out.println("\nDoes 'Sleeper' exist? " + exists);

        // Final State
        System.out.println("\nFinal passenger bogie list:");
        System.out.println(passengerBogies);

        // Program continues...
        System.out.println("\nSystem ready for next operation.");
    }
}