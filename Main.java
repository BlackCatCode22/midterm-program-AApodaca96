public class Main {

    // Creating the genUniqueID method
    public static String genUniqueID(String theSpecies, int numOfSpecies) {
        String prefix = "";
        int suffix = numOfSpecies + 1;

        if (theSpecies.contains("hyena")) {
            prefix = "Hy";
        }

        return prefix + suffix;
    }

    public static void main(String[] args) {

        System.out.printf("\nHello and welcome to my zoo!");

        // Look at our animalNames file
        // Call inputHyenaNames()

        Hyena.inputHyenaNames();



        // Create new Hyena object and return number of Animals
        Hyena myNewHyena = new Hyena();
        System.out.println("Number of Animals is " + myNewHyena.getNumOfAnimals());

        // Create new Hyena object and return number of Animals
        Hyena anotherHyena = new Hyena();
        System.out.println("Number of Animals is " + myNewHyena.getNumOfAnimals());

        // Print number of Hyenas
        System.out.println("Number of Hyenas is " + anotherHyena.getNumOfHyenas());



    }
}