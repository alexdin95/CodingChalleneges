package ArrayProblems_Sort;

public class SortArrWith012InIt {
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

        int arr[] = sortArr(new int[]{1, 2, 0, 0, 0, 2, 1});

        for (int i = 0; i < 7; i++) {
            System.out.print(arr[i] + " ");
        }


    }
}
