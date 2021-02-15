package StringProblems;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SSFindDuplicateCharactersInAString {

    public static void printDuplicates(String s) {
        HashMap<Character, Integer> map = new HashMap<>();


        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), 1);
            } else {
                map.replace(s.charAt(i), map.get(s.charAt(i)) + 1);
            }
        }
        Set<Character> mapKeys = map.keySet();
        for (Character key : mapKeys) {
            if (map.get(key) > 1) {
                System.out.println( key+ "-->" + map.get(key));
            }
        }
    }



    public static void main(String[] args) {
        printDuplicates("alex are mere");

    }
}
