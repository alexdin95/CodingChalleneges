package RandomInterviewAlgorithmsSearch;

import java.util.*;

public class AAAATonyInterviewTest {
//1. Function that receives a string as argument and prints it backwards


    public static void reverse(String s) {
        int pointer1 = 0;
        int pointer2 = s.length() - 1;
        char[] sArr = s.toCharArray();
        while (pointer1 <= pointer2) {
            char temp = sArr[pointer1];
            sArr[pointer1] = sArr[pointer2];
            sArr[pointer2] = temp;

            pointer1++;
            pointer2--;
        }
        for (int i = 0; i < sArr.length; i++) {
            System.out.print(sArr[i]);
        }
    }


    public static void reverseSebi(String s) {
        char[] sArr = s.toCharArray();
        for (int i = 0; i < sArr.length / 2; i++) {
            char temp = sArr[i];
            sArr[i] = sArr[sArr.length - 1 - i];
            sArr[sArr.length - 1 - i] = temp;
        }


    }

    //2. print a list into a pretty box

    public static void printPrettyBox(List<String> list) {
        // get max word
        int charCount = 0;
        for (String item : list) {
            if (item.length() > charCount) {
                charCount = item.length();
            }
        }

        for (int i = 0; i < charCount + 4; i++) {
            System.out.print('*');
        }
        System.out.println();

        for (String item : list) {
            int charCount2 = item.length();
            System.out.println("* " + item + " ".repeat(charCount - charCount2) + " *"); // Smart
        }
        for (int i = 0; i < charCount + 4; i++) {
            System.out.print('*');
        }
    }


    //3. Define a function that receives a list with numbers and strings and returns only a list with numbers.

    private static boolean isNumber(Object o) {
        if (o instanceof Number) return true;

        return false;
    }

    public static Set<Object> retunOnlyNumbers(List<Object> list) {
        Set<Object> numbers = new HashSet<>();

        for (Object o : list) {
            if (isNumber(o)) {
                numbers.add(o);
            }

        }
        return numbers;
    }

    private static boolean isVideo(String s) {
        if (s.substring(s.length() - 4).equals(".mp4")) {
            return true;
        }
        return false;
    }

    private static boolean isAudio(String s) {
        if (s.substring(s.length() - 4).equals(".wav")) {
            return true;
        }
        return false;
    }

    //4.Define a function that receives a single argument, a list of strings and returns a dictionary
    // that contains as keys " Video", "Audio", "Other" and as values a list with entries specific for that key,
    //Ex: Strings : Entry One.mp4" , Entry Two.wav (Audio), Entry Three.jpg, Entry Four, Entry Five.png, Entry Six.csv
    public static HashMap<String, ArrayList<String>> returnFiles(String[] files) {
        HashMap<String, ArrayList<String>> fileMap = new HashMap<>();
        ArrayList<String> Audio = new ArrayList<>();
        ArrayList<String> Video = new ArrayList<>();
        ArrayList<String> Other = new ArrayList<>();
        fileMap.put("Audio", Audio);
        fileMap.put("Video", Video);
        fileMap.put("Other", Other);

        for (String file : files) {
            if (isAudio(file)) {
                fileMap.get("Audio").add(file);
            } else if (isVideo(file)) {
                fileMap.get("Video").add(file);
            } else {
                fileMap.get("Other").add(file);
            }

        }
        return  fileMap;
    }


    public static void main(String[] args) {
        //1. Function that receives a string as argument and prints it backwards
        reverse("Alex");

        System.out.println();

        //2. print a list into a pretty box
        List list = new ArrayList();
        list.add("Hello");
        list.add("Worldllllllll");
        list.add("in");
        list.add("");
        list.add("frame");
        printPrettyBox(list);
        System.out.println();


        //3. Define a function that receives a list with numbers and strings and returns only a list with numbers.
        List<Object> list3 = Arrays.asList(1, 3, 67, "1", "62", "Foo", "3", 5, 1, 3, false, 1.3);
        System.out.println(retunOnlyNumbers(list3));
        System.out.println();


        //4.Define a function that receives a single argument, a list of strings and returns a dictionary
        // that contains as keys " Video", "Audio", "Other" and as values a list with entries specific for that key,
        //Ex: Strings : Entry One.mp4" , Entry Two.wav (Audio), Entry Three.jpg, Entry Four, Entry Five.png, Entry Six.csv

        String [] files = {"Entry One.mp4", "Entry Two.wav", "Entry Three.jpg", "Entry Four.mng", "Entry Five.png", "Entry Six.csv"};
        System.out.println(returnFiles(files));
    }
}
