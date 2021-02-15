package ArrayProblems_Sort;
//Given a sorted and rotated array A of N distinct elements which is rotated at some point, and given an element K.
// The task is to find the index of the given element K in the array A.
public class SearchInRotatedArray {

    public static  int[] rotateArr(int arr[]){
        for (int i=0 ;i<arr.length/2;i++){
            int temp = arr[i];
            arr[i] =arr[arr.length-i-1];
            arr[arr.length-i-1]=temp;
        }
        return arr;
    }

    public static void printArr(int[] arr){
        for (int i = 0; i<arr.length;i++){
            System.out.print(arr[i] + " ");

        }
    }

    public static void main(String[] args) {
        int arr[] ={1,2,3,5,4,9,7,10,23,0};
        arr =rotateArr(arr);
        printArr(arr);
    }

}
