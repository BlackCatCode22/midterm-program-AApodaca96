import java.util.*;

public class Bear extends Animal {
    private static ArrayList<String> bearNames = new ArrayList<>();
    private static int bearCount = 0;

    // Constructor for the Bear class
    public Bear(String animalColor, String birthSeason) {
        super(animalColor, birthSeason);
        bearCount++;
        this.animalID = "BEA" + bearCount;
        this.animalName = bearNames.get(bearCount - 1);
    }

    // Static initialization block to read bear names from file
    static {
        bearNames.addAll(readNamesFromFile("C:\\Users\\angel\\IdeaProjects\\CIT_63_Java\\Midterm_Zoo\\arrivingAnimals.txt"));
    }
}
