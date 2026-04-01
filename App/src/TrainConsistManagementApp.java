import java.util.ArrayList;
import java.util.List;
public class TrainConsistManagementApp {
    public static void main(String[] args) {

        // Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Initialize empty list of bogies (dynamic collection)
        List<String> trainConsist = new ArrayList<>();

        // Display initial bogie count
        System.out.println("Train initialized.");
        System.out.println("Initial number of bogies: " + trainConsist.size());
    }
}
