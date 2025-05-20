Implement of insertion sort

public class Insertion_sort{
    static void insertionsort(int[] arr, int n) {
        for(int initialindex=0; initialindex<n;initialindex++){
            for(int j=initialindex;j>0;j--){
                if (arr[j]<arr[j-1]){
                      int temp = arr[j];
                      arr[j] = arr[j-1];
                      arr[j-1] = temp;
                }
            }
        }
    }
}
