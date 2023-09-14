public class Cat {

    String name;
    int age;
    int livesRemaining;
    String meowSound;

    public static final int MAX_LIVES = 9;
    private static int catCount = 0;

    public void meow(){
        System.out.println("Meow");
    }

    public Cat (){
        catCount++;
        livesRemaining = MAX_LIVES;
    }

    public static int getCatCount(){
        return catCount++;
    }
}
