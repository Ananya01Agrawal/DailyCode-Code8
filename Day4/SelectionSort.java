import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write a program to implement the selection sort algorithm 
        // what is selction sort Algorithm?
        // selection sort is a sorting algorithm that selects the smallest element from an unsorted list in each iteration and places that element at the beginning of the unsorted list.   
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }   
        for(int i=0;i<n-1;i++) {
            int min = i;
            for(int j=i+1;j<n;j++) {
                if(arr[j]<arr[min]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        for(int i=0;i<n;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
// time complexity: O(n^2)
// space complexity: O(1)
