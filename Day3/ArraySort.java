import java.util.*;

public class Main {
    public static void main(String[] args) {
        //to check whether the array is sorted or not   
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int flag = 0;
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                flag = 1;
                break;
            }
        }
        if(flag==1){
            System.out.println("false");
        }
        else{
            System.out.println("true");
        }
    }
}
