import java.util.*;

public class Tiger extends Animal {
    private static ArrayList<String> tigerNames = new ArrayList<>();
    private static int tigerCount = 0;

    // Constructor for the Tiger class
    public Tiger(String animalColor, String birthSeason) {
        super(animalColor, birthSeason);
        tigerCount++;
        this.animalID = "TIG" + tigerCount;
        this.animalName = tigerNames.get(tigerCount - 1);
    }

    // Static initialization block to read tiger names from file
    static {
        tigerNames.addAll(readNamesFromFile("C:\\Users\\angel\\IdeaProjects\\CIT_63_Java\\Midterm_Zoo\\arrivingAnimals.txt"));
    }
}
