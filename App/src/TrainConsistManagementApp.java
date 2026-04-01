import java.util.HashSet;
import java.util.Set;
public class TrainConsistManagementApp {
    public static void main(String[] args) {

        // Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Initialize HashSet for unique bogie IDs
        Set<String> bogieIds = new HashSet<>();

        // Adding bogie IDs (including duplicates intentionally)
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");
        bogieIds.add("BG101"); // Duplicate
        bogieIds.add("BG102"); // Duplicate

        // Display final set (duplicates automatically removed)
        System.out.println("\nUnique Bogie IDs in Train:");
        System.out.println(bogieIds);

    }
}
