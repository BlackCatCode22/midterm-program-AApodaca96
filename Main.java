
public class Main {
    public static void main(String[] args) {

        // Welcome Statement
        System.out.printf("\nHello and welcome to Angelo's Zoo Program!\n\n");

        // Create Animal object
        Animal myNewAnimal = new Animal();

        myNewAnimal.name = "Leo";
        System.out.println("\n the name of the new animal is: " + myNewAnimal.name);

        // Hyenas
        Hyena myHyena = new Hyena();
        Hyena myHyena02 = new Hyena();
        Hyena myHyena03 = new Hyena();

        // How many Hyenas do we have?
        System.out.println("We have " + Hyena.numOfHyenas + " Hyenas!");

        myHyena.name = "Zig";

        System.out.println("\n My new Hyena is named: " + myHyena.name);

        myHyena.makenoise();

        System.out.println("He makes this noise: " + myHyena.makenoise02());

        // How many animals do we have
        System.out.println("\n After using new twice, we have " + Animal.numOfAnimals + " animals in the zoo!\n");
    }
}