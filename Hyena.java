import org.w3c.dom.ls.LSOutput;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


// Hyena class declaration
public class Hyena extends Animal {
    private String name = "";

    private int weight = 0;

    // Create an ArrayList to store the split values read from
    private static List<String> myListOfHyenas = new ArrayList<>();

    // numOfHyenas counter declaration
    private static int numOfHyenas = 0;

    // Hyena constructor
    public Hyena() {
        System.out.println("\nNew Hyena object created.");
        numOfHyenas++;
    }

    // numOfHyenas getter method
    public int getNumOfHyenas() {
        return numOfHyenas;
    }

    // inputHyenaNames method
    public static void inputHyenaNames() {

        // File path declaration
        String filePath = "C:\\Users\\angel\\IdeaProjects\\CIT_63_Java\\Static_Animal_Names_Method\\src\\animalNames.txt";

        // Try reading file
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {

            // Read lines loop
            String line;
            while ((line = reader.readLine()) != null) {
                // Print hyena names
                if (line.contains("hyena")) {
                    System.out.println(line);
                }
            }

            // Exception handling
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

    }

   /* // Create an ID for our new animal
    String theNewID = Main.genUniqueID(theSpecies "hyena", numOfSpecies 8);
    System.out.println("")

    */

}