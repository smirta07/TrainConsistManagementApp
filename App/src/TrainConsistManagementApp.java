import java.util.LinkedList;
public class TrainConsistManagementApp {
    public static void main(String[] args) {

        // Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Initialize LinkedList for ordered train consist
        LinkedList<String> trainConsist = new LinkedList<>();

        // Add bogies (maintains order)
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        System.out.println("\nInitial Train Consist:");
        System.out.println(trainConsist);

        // Insert Pantry Car at position 2 (index starts from 0)
        trainConsist.add(2, "Pantry Car");

        System.out.println("\nAfter adding Pantry Car at position 2:");
        System.out.println(trainConsist);

        // Remove first and last bogie
        trainConsist.removeFirst();
        trainConsist.removeLast();

        System.out.println("\nAfter removing first and last bogies:");
        System.out.println(trainConsist);

        // Final ordered consist
        System.out.println("\nFinal Train Consist:");
        System.out.println(trainConsist);
    }
}
