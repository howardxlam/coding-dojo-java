import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
public class TestPuzzleJava {

    public static void main(String[] args) {

        PuzzleJava generator = new PuzzleJava();

        ArrayList<Integer> randomRolls = generator.getTenRolls();
        System.out.println(randomRolls);

        String randomLetter = generator.getRandomLetter();
        System.out.println(randomLetter);

        String password = generator.generatePassword();
        System.out.println(password);

        // String[] passwordList = generator.getNewPasswordSet(6);
        // System.out.println(Arrays.toString(passwordList));

        ArrayList<String> passwordList = generator.getNewPasswordSet(6);
        System.out.println(passwordList);
    }

        // ArrayList<Object> shuffleList = new ArrayList<Object>();
        // shuffleList.add(true);
        // shuffleList.add("baseball");
        // shuffleList.add("camera");
        // shuffleList.add(88);
        // shuffleList.add(176);

        // ArrayList<Object> shuffled = generator.shuffleArray(shuffleList);
        // System.out.println(shuffled);
}