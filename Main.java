import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Main {
    public static void main(String[] args) {

        // Welcome Statement
        System.out.printf("\nHello and welcome to Angelo's Class/Midterm Review!\n\n");

        // Create an Array
        ArrayList<Animal> animalList = new ArrayList<>();

        // Define the File I/O path
        String filePath = "C:/Users/angel/IdeaProjects/CIT_63_Java/Classes_Review_Sept_19th_2023/src/animalNames.txt";

        try {
            // Create FileReader and BufferedReader objects
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            // Read lines from the file
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);

               /* // Mohle's Code
                String[] myArray = line.split(",");
                System.out.println("\n myArray[0] is " + myArray[0]);
                System.out.println("\n myArray[1] is " + myArray[1]);*/

                // Create an Animal object from the Animal Class
                Animal anyOldAnimal = new Animal();

                // Fill the object's data fields
               /* anyOldAnimal.desc = myArray[0];
                anyOldAnimal.birthSeason = myArray[1];
                anyOldAnimal.color = myArray[2];
                anyOldAnimal.weight = myArray[3];
                anyOldAnimal.origin01 = myArray[4];
                anyOldAnimal.origin02 = myArray[5];
*/
                // Add the newly created animal object to the array list


            }

            // Close the BufferedReader and FileReader
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }




        //myNewAnimal.desc = " this is my desc";

       // System.out.println("\n the desc of the new animal is: " + myNewAnimal.desc);

        // Open the arriving animal text file (File I/O)







    /*
        // Use a for loop to create five Animal objects and add them to the ArrayList
        for (int i = 1, i <= 5; i++) {
            // Using the constructor with arguments
            Animal animal = new Animal("Animal" + i);
            AnimalList.add(animal);
        }

        // Output the animalList with an item in loop
        for (Animal animal : animalList) {
            System.out.println(animal.name + " " + animal.age);
        }
    */

    }
}