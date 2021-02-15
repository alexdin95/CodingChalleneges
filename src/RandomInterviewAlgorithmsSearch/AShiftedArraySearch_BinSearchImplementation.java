package RandomInterviewAlgorithmsSearch;

public class AShiftedArraySearch_BinSearchImplementation {
// something something
    public int ShiftedArrSearch(int shiftedArr){
    return 1;
    }
    public int findPivotShiftedArr (int[] arr ){
        int left  =0;
        int right = arr.length -1;
        while (left <= right){
            int mid = left + (right-left)/2;

            if (mid==0 || arr[mid]< arr[mid-1]){ // intr-un array sortat care a fost shiftat punctul de pivot
                //apare doar cand [mid] < [mid-1] sau cand este zero pt ca array-ul ar incepe de la 0
                return  mid;
            } else if (arr[mid] > arr[0]){
                left = mid+1;
            } else {right = mid-1;}
        }
        return 0;
    }

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

        int[] arr ={4,5,1,2,3};

    }
}
