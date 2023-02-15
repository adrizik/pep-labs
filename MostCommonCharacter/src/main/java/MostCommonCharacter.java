import java.util.HashMap;
import java.util.Map;

public class MostCommonCharacter {
    /**
     * Find the most common character in str.
     * You could use a HashMap that maps a Character key to an Int value to represent how many times a Character has
     * been spotted.
     * @param str A String.
     * @return the most common character within str.
     */
    public char recurringChar(String str) {
        Map<Character, Integer> character_count = new HashMap<>();

        for(int i = 0; i < str.length(); i++){
            char key = str.charAt(i);
            if(character_count.containsKey(key)){
                character_count.put(key, character_count.get(key) + 1);

            }else{
                character_count.put(key, 1);
            }
        }
        
        return ' ';
    }
}
