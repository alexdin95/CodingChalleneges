package RandomInterviewAlgorithmsSearch;

public class SortArrayByParity {
    public static int[] sortByParity(int[] arr) {
        int[] sortedArr = new int[arr.length];
        int arrIndex = 0;
        // fac un conter pt index-ul array-ului copie realizat pt a stoca noul Array sortat.
        // Complexitate: TIMP O(n), spatiu O(n), nu este cea mai eficienta dpdv al spatiului deoarece facem o copie a arr,
        // versiunea doi este mai optima deoarece sucim valorile in Arr original deci folosim acelasi spatiu in memorie.
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sortedArr[arrIndex] = arr[i];
                arrIndex++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                sortedArr[arrIndex] = arr[i];
                arrIndex++;
            }
        }
        return sortedArr;
    }

    public static int[] sortByParityEfficiently(int[] arr) {
        int arrIndex = 0;
        // fac un conter pt index-ul array-ului copie realizat pt a stoca noul Array sortat.
        // Complexitate: TIMP O(n), spatiu O(1),este cea mai eficienta dpdv al spatiului deoarece NU facem o copie a arr,
        // sucim valorile in Arr original deci folosim acelasi spatiu in memorie.
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                int temp = arr[arrIndex];
                arr[arrIndex]= arr[i];
                arr[i]=temp;
                arrIndex++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {int temp = arr[arrIndex];
                arr[arrIndex]= arr[i];
                arr[i]=temp;
                arrIndex++;
            }
        }
        return arr;
    }



    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 4, 4, 0, 25, 5, 7};
        int[] sortedArr = sortByParity(arr);
        int[] sortedArr2 = sortByParityEfficiently(arr);

        for (int i = 0; i < sortedArr.length; i++) {
            System.out.print(sortedArr[i] + " ");
        }
        System.out.println(" ");
        for (int i = 0; i < sortedArr.length; i++) {
            System.out.print(sortedArr2[i] + " ");
        }

    }
}
