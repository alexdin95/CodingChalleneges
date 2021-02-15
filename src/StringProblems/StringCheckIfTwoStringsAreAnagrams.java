package StringProblems;

import jdk.swing.interop.SwingInterOpUtils;

public class StringCheckIfTwoStringsAreAnagrams {

    public static boolean isAnagram(String a, String b) {
        // ne pasa de numarul de aparitii
        if (a.length() != b.length()) return false;

        int[] char_counts = new int[26]; // 26 letters in the alphabet
        // trecem prin String si incrementam Array-ul pt fiecare caracter si decrementam pentru fiecare caracter.
        // la sfarsit daca in Array avem toate elementele = 0 atunci este anagarama.
        // Ambele String-uri au aceeais lungime deci nu conteaza ce lungime folosim in for
        for (int i = 0; i < a.length(); i++) {
            char_counts[a.charAt(i) - 'a']++;

            // a.charAt(i) - 'a'  ar fi echivalent indexul lui a.charAt(i) in alfabet deoarece il scadem cu 'a'
            // 'a'- 'a' = 0 care reprezinta index-ul literei la mine in array
            // 'c-' 'a' = 2 indexul meu din array.
            // si pe acesti indexi adun ++ si scad -- in functie de in ce string imi apar litere
            // la final ar trebui sa am un array plin de 0 daca sun anagrame.
            char_counts[b.charAt(i) - 'a']--;

        }
        for (int count : char_counts) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {


        String a = "cal";
        String b = "lac";
        String c = "cac";

        System.out.println(isAnagram(a, b));

        System.out.println("---------------");

        System.out.println(isAnagram(a, c));
    }
}
