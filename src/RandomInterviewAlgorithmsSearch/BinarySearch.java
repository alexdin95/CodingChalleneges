package RandomInterviewAlgorithmsSearch;

public class BinarySearch {
    static int binSearchIndex(int[] arr, int key) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (arr[middle] == key) {
                return middle;
            } else if (arr[middle] > key) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }

    return -1;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 5, 6, 7, 8, 9};
        System.out.println(binSearchIndex(arr,7));
    }
}
