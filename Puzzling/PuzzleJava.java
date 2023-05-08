import java.util.Random;
import java.util.ArrayList;

public class PuzzleJava {

    Random randMachine = new Random();
    
    public ArrayList<Integer> getTenRolls(){
        ArrayList<Integer> randomRolls = new ArrayList<Integer> ();
        for (int i = 0; i < 10; i++){
            randomRolls.add(randMachine.nextInt(20) + 1);
        }
        return randomRolls;
    }   

    public String getRandomLetter(){
        String[] alphabet = {"A", "B", "C", "D" , "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        return alphabet[randMachine.nextInt(26)];
    }  


    public String generatePassword(){
        String[] alphabet = {"A", "B", "C", "D" , "E", "F", "G", "H", "I", "J", "K", "L" , "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        ArrayList<String> password = new ArrayList<String>();
        for (int i = 0; i < 8; i++){
            password.add(alphabet[randMachine.nextInt(26)]);
            }
        return String.join("", password);   
    }

    // public String[] getNewPasswordSet(int num){
    //     String[] passwordSet = new String[num];
    //     for (int i = 0; i < num; i++){
    //         passwordSet[i] = generatePassword();
    //     }
    //     return passwordSet;
    // }

    public ArrayList<String> getNewPasswordSet(int num){
        ArrayList<String> passwordSet = new ArrayList<String>();
        for (int i = 0; i < num; i++){
            passwordSet.add(generatePassword());
        }
        return passwordSet;
    }



    // public ArrayList<Object> shuffleArray(ArrayList<Object> arr){
    //     for (int i = 0; i < arr.length; i++){
    //         int newIndex = randMachine.nextInt(arr.length - 1);
    //         Object temp = arr[i];
    //         arr[i] = arr[newIndex];
    //         arr[newIndex] = arr[i];
    //     }
    // }


}