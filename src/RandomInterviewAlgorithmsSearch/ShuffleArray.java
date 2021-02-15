package RandomInterviewAlgorithmsSearch;

import java.util.ArrayList;

public class ShuffleArray {
    //Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
    //
    //Return the array in the form [x1,y1,x2,y2,...,xn,yn].
    //Input: nums = [2,5,1,3,4,7], n = 3
    //Output: [2,3,5,4,1,7]
    //Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].

    public int[] betterShuffle(int[] nums, int n)
    {
        int [] res = new int[nums.length];
        int index = 0;
        for (int i = 0, j = n; j < nums.length; i++, j++)
        {
            res[index] = nums[i];
            index++;
            res[index] = nums[j];
            index++;
        }

        return res;
    }
    // Tim complex O(n)
    // Space Complexity O(n)

    public static int[] shuffle(int[] nums, int n) {
        ArrayList<Integer> newArr = new ArrayList<>();
        for (int i = 0; i < n; i += 1) {
            newArr.add(nums[i]);
            newArr.add(nums[i + n]);
        }
        for (int i = 0; i <= nums.length - 1; i++) {
            nums[i] = newArr.get(i).intValue();
        }
        return nums;
    }

    public static void main(String[] args) {
        int arr[] = {3, 4, 5, 6, 7, 8};
        int n = 3;
        System.out.println(shuffle(arr, n));

    }

}
