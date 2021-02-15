import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.HashMap;

public class Practice {
    public static String reverseString(String s) {
        char[] arr = s.toCharArray();
        int pointer1 = 0;
        String reversedS = "";
        int pointer2 = s.length() - 1;
        while (pointer1 < pointer2) {
            char temp = arr[pointer1];
            arr[pointer1] = arr[pointer2];
            arr[pointer2] = temp;
            pointer1++;
            pointer2--;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            reversedS += arr[i];
        }
        return reversedS;
    }

    public static int[] sortArr(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length - 1; j++) {

                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        }

        return arr;

    }


    public static void main(String[] args) {

        System.out.println(reverseString("Alex are mere"));
        int arr[] = sortArr(new int[]{1, 2, 0, 0, 0, 2, 1});

        for (int i = 0; i < 7; i++) {
            System.out.print(arr[i] + " ");
        }


    }
}
