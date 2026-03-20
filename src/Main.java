import java.util.ArrayList;
import java.util.List;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        // Welcome Message
        System.out.println("=== Train Consist Management App ===");


        LinkedList<String> trainConsist = new LinkedList<>();


        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        System.out.println("\nInitial Train Consist:");
        System.out.println(trainConsist);

        // Insert Pantry Car at position 2 (index 2)
        trainConsist.add(2, "Pantry");

        System.out.println("\nAfter adding Pantry at position 2:");
        System.out.println(trainConsist);

        // Remove first and last bogie
        trainConsist.removeFirst();
        trainConsist.removeLast();

        System.out.println("\nAfter removing first and last bogie:");
        System.out.println(trainConsist);
      
      
      
        System.out.println("=============================================");
        System.out.println("     ====Train Consist Management APP===     ");
        System.out.println("=============================================");

      
        // Passenger Bogie List
        List<String> passengerBogies = new ArrayList<>();

        // ADD Operation
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // ADD Operation (including duplicates)
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        // Display Unique Bogie IDs
        System.out.println("\nBogie IDs after insertion (duplicates ignored):");
        System.out.println(bogieIds);
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

        Set<String> trainFormation = new LinkedHashSet<>();

        // ADD bogies
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // Attempt to add duplicate
        trainFormation.add("Sleeper"); // Duplicate (ignored)

        // Display final formation
        System.out.println("\nFinal Train Formation (Insertion Order Preserved):");
        System.out.println(trainFormation);

        // Program continues...
        System.out.println("\nSystem ensures ordered and unique bogies.");

    }
}