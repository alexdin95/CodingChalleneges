package RandomInterviewAlgorithmsSearch;

import java.util.ArrayList;
import java.util.Arrays;

public class FindMaxSecondThird {
    // find the maximum value, the second max value, third max value
    public static void first3Values(ArrayList<Integer> arr) {
        Integer maxVal = null;
        Integer secondMaxVal = null;
        Integer thirdMaxVal = null;
        if (arr.isEmpty()) {
            System.out.println("Array is empty: ");
        }
        for (Integer nums : arr) {
            //daca val a mai fost intalnita folosesc continue sa nu mai trec prin cod iar
            if (nums == maxVal || nums==secondMaxVal || nums == thirdMaxVal){
                continue;
            }
            if (maxVal == null || nums > maxVal) {
                // verific daca primul e gol sau mai mare ca maxVal
                // Daca indeplineste cond mult a treia valoare = a doua, a doua cu prima si prima cu numarul din for
                //System.out.println(maxVal + " \n" + secondMaxVal + " \n" + thirdMaxVal + " \n");
                thirdMaxVal = secondMaxVal;
                secondMaxVal  = maxVal;
                maxVal = nums;
                // daca nu e mai mare ca max dar e mai mare ca second max fac acelasi lucru
            } else if (secondMaxVal == null || nums > secondMaxVal) {
                thirdMaxVal = secondMaxVal;
                secondMaxVal = nums;
                //daca este mai mare ca a treia dar nu ca adoua modific doar ref de la 3 la cea din for
            } else if (thirdMaxVal == null || nums > thirdMaxVal) {
                thirdMaxVal = nums;

            }
        }
        System.out.println(maxVal + " \n" + secondMaxVal + " \n" + thirdMaxVal + " \n");


    }

    public static void main(String[] args) {
        ArrayList<Integer> arr =
                new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 60, 2, 12, 0));
        first3Values(arr);
    }
}
