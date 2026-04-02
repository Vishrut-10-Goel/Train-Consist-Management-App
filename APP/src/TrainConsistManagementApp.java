import java.util.ArrayList;
import java.util.List;

public class TrainConsistManagementApp{

    public static void main(String[] args) {
        // Welcome message
        System.out.println("=== Train Consist Management App ===");

        // Initialize train consist (empty list of passenger bogies)
        List<String> passengerBogies = new ArrayList<>();

        // Add passenger bogies
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // Display bogies after insertion
        System.out.println("Passenger bogies added: " + passengerBogies);

        // Remove one bogie (AC Chair)
        passengerBogies.remove("AC Chair");
        System.out.println("After removing AC Chair: " + passengerBogies);

        // Check if Sleeper exists
        if (passengerBogies.contains("Sleeper")) {
            System.out.println("Sleeper bogie exists in the train consist.");
        } else {
            System.out.println("Sleeper bogie does not exist.");
        }

        // Final list state
        System.out.println("Final passenger bogies: " + passengerBogies);

        // Program continues...
        System.out.println("Train operations continue...");
    }
}


