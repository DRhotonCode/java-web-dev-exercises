package Studios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingCharacters {
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        HashMap<Character, Integer> charCount = new HashMap<>();

        System.out.println("Enter sentence or word:");
        String sentence = input.nextLine();
        char[] charactersInString = sentence.toCharArray();

        for(char i : charactersInString){
            if(!charCount.containsKey(i)){
                charCount.put(i, 1);
            }else{
                charCount.put(i, charCount.get(i) + 1);
            }
        }
        for(Map.Entry<Character, Integer> entry : charCount.entrySet()){
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
