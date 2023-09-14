import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.printf("\nHello and welcome to Angelo's Thursday Sept. 14th Practice (Array List of Cats/Statics)!\n\n");


        ArrayList<Cat> cats = new ArrayList<>();

        Cat cat1 = new Cat();
        cat1.name = "Fluffy";
        cat1.age = 3;
        cat1.meowSound = "Meow meow";

        Cat cat2 = new Cat();
        cat2.name = "Mittens";
        cat2.age = 1;

        Cat cat3 = new Cat();
        cat3.name = "Garfield";
        cat3.age = 5;

        Cat cat4 = new Cat();
        cat4.name = "Whiskers";
        cat4.age = 2;

        Cat cat5 = new Cat();
        cat5.name = "Felix";
        cat5.age = 4;

        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        cats.add(cat4);
        cats.add(cat5);

        // Print number of cats
        System.out.println("Number of cats: " + Cat.getCatCount() + "\n");

        // Print out all cats
        for(Cat c : cats) {
            System.out.println(c.name + " is " + c.age + " years old ");
        }

//        System.out.println(Cat.MAX_LIVES);
//        System.out.println(Cat.getCatCount());
    }
}