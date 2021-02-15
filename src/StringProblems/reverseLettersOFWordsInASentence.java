package StringProblems;

public class reverseLettersOFWordsInASentence {
    public static String reverseWords(String sentence) {
        String newSentence = "";

        String[] arr = sentence.split(" ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=reverseString(arr[i]);
            newSentence+= arr[i] + " ";

        }
        return newSentence;
    }

    //fac metoda care sa inverseze un cuvant (mergea si cu while si 2 pointere)
    public static String reverseString(String s) {
        String reversed = "";
        char[] arr = s.toCharArray();

        for (int i = 0; i < s.length() / 2; i++) {
            char temp = arr[i];
            arr[i] = arr[s.length() - 1 - i];
            arr[s.length() - 1 - i] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            reversed += arr[i];
        }
        return reversed;
    }


    public static void main(String[] args) {

        System.out.println(reverseString("alexandru"));

        System.out.println(reverseWords("Alex are mere"));
        System.out.println(5 / 2);
    }
}
