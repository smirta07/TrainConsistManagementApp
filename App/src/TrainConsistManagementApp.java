import java.util.ArrayList;
import java.util.List;
public class TrainConsistManagementApp {
    public static void main(String[] args) {

        // Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Initialize passenger bogie list
        List<String> passengerBogies = new ArrayList<>();

        // Adding bogies (CREATE operation)
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // Display bogies after insertion (READ operation)
        System.out.println("\nPassenger Bogies after addition:");
        System.out.println(passengerBogies);

        // Remove a bogie (DELETE operation)
        passengerBogies.remove("AC Chair");

        System.out.println("\nPassenger Bogies after removal of AC Chair:");
        System.out.println(passengerBogies);

        // Check existence (READ operation)
        boolean isSleeperPresent = passengerBogies.contains("Sleeper");

        System.out.println("\nIs Sleeper bogie present? " + isSleeperPresent);

        // Final state
        System.out.println("\nFinal Passenger Bogie List:");
        System.out.println(passengerBogies);

    }
}
