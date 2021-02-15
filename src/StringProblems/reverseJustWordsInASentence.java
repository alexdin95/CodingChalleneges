package StringProblems;

import java.util.*;

public class reverseJustWordsInASentence {



    public static String reverseWords(String sentence) {
        List<String> words = Arrays.asList(sentence.split("\\s"));
        Collections.reverse(words);
        StringBuilder sb = new StringBuilder(sentence.length());
        for (int i = 0; i <words.size(); i++) {
            sb.append(words.get(i));
            sb.append(' ');
        }
        return sb.toString().trim();
    }

    public static String reverseString(String line) {
        if (line.trim().isEmpty()) {
            return line;
        }
        StringBuilder reverse = new StringBuilder();
        String[] sa = line.trim().split("\\s");
        for (int i = sa.length - 1; i >= 0; i--) {
            reverse.append(sa[i]);
            reverse.append(' ');
        }
        return reverse.toString().trim();
    }
    public static void main(String args[]) {
        System.out.println(reverseWords("Alex are mere "));
        System.out.println(reverseString("Alex are mere"));
        System.out.println(reverseSentence(" Alex are mere "));
    }

    public static  String reverseSentence(String s){
        if (s.trim().isEmpty())return s;
        List <String> words = Arrays.asList(s.split(" "));
        Collections.reverse(words);

        StringBuilder sb = new StringBuilder();

        for(String word:words){
            sb.append(word);
            sb.append(" ");
        }
        return sb.toString();
    }
}



