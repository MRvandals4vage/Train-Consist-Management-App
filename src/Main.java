import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        // Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Create HashSet for Bogie IDs
        Set<String> bogieIds = new HashSet<>();

        // ADD Operation (including duplicates)
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");
        bogieIds.add("BG101"); // Duplicate
        bogieIds.add("BG102"); // Duplicate

        // Display Unique Bogie IDs
        System.out.println("\nBogie IDs after insertion (duplicates ignored):");
        System.out.println(bogieIds);

        // Program continues...
        System.out.println("\nSystem ensures all bogie IDs are unique.");
    }
}