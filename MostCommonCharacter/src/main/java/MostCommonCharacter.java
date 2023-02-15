
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
            char c = str.charAt(i);
            if(character_count.containsKey(c)){
                character_count.put(c, character_count.get(c) + 1);

            }else{
                character_count.put(c, 1);
            }
        }

        int max_count = 0;
        char most_common = '\0';
        for(Map.Entry<Character, Integer> entry : character_count.entrySet()){
            if(entry.getValue() > max_count){
                max_count = entry.getValue();
                most_common = entry.getKey();

            }
        }

        return most_common;
    }
}
