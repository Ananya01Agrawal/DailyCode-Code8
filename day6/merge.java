//given an array of size n and sort the array  usingt he merge sort algorithm   
import java.util.*; 
public class merge { 
    public static void main(String[] args) { 
        Scanner scn = new Scanner(System.in); 
        int n = scn.nextInt(); 
        int[] arr = new int[n]; 
        for(int i = 0; i < n; i++){ 
            arr[i] = scn.nextInt(); 
        } 
        mergeSort(arr, 0, arr.length - 1); 
        print(arr); 
    } 
    public static void mergeSort(int[] arr, int lo, int hi){ 
        if(lo == hi){ 
            return; 
        } 
        int mid = (lo + hi) / 2; 
        mergeSort(arr, lo, mid); 
        mergeSort(arr, mid + 1, hi); 
        mergeTwoSortedArrays(arr, lo, mid, hi); 
    } 
    public static void mergeTwoSortedArrays(int[] arr, int lo, int mid, int hi){ 
        int[] merged = new int[hi - lo + 1]; 
        int i = lo; 
        int j = mid + 1; 
        int k = 0; 
        while(i <= mid && j <= hi){ 
            if(arr[i] < arr[j]){ 
                merged[k] = arr[i]; 
                i++; 
                k++; 
            } else { 
                merged[k] = arr[j]; 
                j++; 
                k++; 
            } 
        } 
        while(i <= mid){ 
            merged[k] = arr[i]; 
            i++; 
            k++; 
        } 
        while(j <= hi){ 
            merged[k] = arr[j]; 
            j++; 
            k++; 
        } 
        for(int idx = 0; idx < merged.length; idx++){ 
            arr[idx + lo] = merged[idx]; 
        } 
    } 
    public static void print(int[] arr){ 
        for(int i = 0; i < arr.length; i++){ 
            System.out.println(arr[i]); 
        } 
    } 
}
