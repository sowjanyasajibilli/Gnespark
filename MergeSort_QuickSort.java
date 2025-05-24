MergeSort implementation:-
package Sorting;
import java.util.Scanner;
public class Merge_Sort_Algo {
    public static void mergeSort(int[] ar, int low, int high) {
        if (low < high) {                       //Base case - checking if array is empty or single valued.
            int mid = (low + high) / 2;
            mergeSort(ar, low, mid);                  // Left Sub array
            mergeSort(ar, mid + 1, high);         // Right sub array

            mergebothhalfs(ar,low,mid,high);
        }
    }

    public  static void mergebothhalfs(int arr[], int left, int middle, int right) {
        int[] temp = new int[right - left + 1]; // temp array to store merged result
        int i = left;              // Initial index of left subarray
        int j = middle + 1;        // Initial index of right subarray
        int k = 0;                 // Initial index of merged array

        while (i <= middle && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        // Copy remaining elements of left subarray if any
        while (i <= middle) {
            temp[k++] = arr[i++];
        }

        // Copy remaining elements of right subarray if any
        while (j <= right) {
            temp[k++] = arr[j++];
        }

        // Copy merged elements back to original array
        for (i = 0; i < temp.length; i++) {
            arr[left +i] = temp[i];
        }
    }


    public static void printarray(int[] ar,int n){
        for(int i = 0 ; i < n ; i++){                        // Function to print array
            System.out.print(ar[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr  = new int[10];
        for (int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Array Elements before sorting : ");
        printarray(arr,n);
        mergeSort(arr,0,n-1);
        System.out.println("Array Elements after sorting : ");
        printarray(arr,n);
    }

}

QuickSort implementation:-
package Sorting;
import java.util.Scanner;
public class Quick_Sort_Algo {
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int partitionIndex = partition(arr, low, high);

            quickSort(arr, low, partitionIndex - 1);   // Recursively sort left part
            quickSort(arr, partitionIndex + 1, high);  // Recursively sort right part
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];        // Choosing last element as pivot
        int i = low - 1;              // Index of smaller element

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;

                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;     // Return the partition index
    }

    public static void printArray(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[10];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array Elements before sorting : ");
        printArray(arr, n);

        quickSort(arr, 0, n - 1);

        System.out.println("Array Elements after sorting : ");
        printArray(arr, n);
    }
}
