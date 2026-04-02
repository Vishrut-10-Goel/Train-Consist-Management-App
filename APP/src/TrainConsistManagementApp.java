import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Bogie {
    private String name;
    private int capacity;

    // Constructor
    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    // Override toString for easy printing
    @Override
    public String toString() {
        return name + " → " + capacity + " seats";
    }
}

public class TrainConsistManagementApp {

    public static void main(String[] args) {
        // Welcome message
        System.out.println("=== Train Consist Management App ===");

        // Create a list of passenger bogies
        List<Bogie> passengerBogies = new ArrayList<>();
        passengerBogies.add(new Bogie("Sleeper", 72));
        passengerBogies.add(new Bogie("AC Chair", 56));
        passengerBogies.add(new Bogie("First Class", 24));

        // Display unsorted bogies
        System.out.println("Unsorted bogies:");
        for (Bogie bogie : passengerBogies) {
            System.out.println(bogie);
        }

        // Sort bogies by capacity using Comparator
        passengerBogies.sort(Comparator.comparingInt(Bogie::getCapacity));

        // Display sorted bogies
        System.out.println("\nBogies sorted by capacity:");
        for (Bogie bogie : passengerBogies) {
            System.out.println(bogie);
        }

        // Program continues...
        System.out.println("\nTrain operations continue with sorted capacity planning...");
    }
}
