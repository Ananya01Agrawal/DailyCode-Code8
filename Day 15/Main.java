//sort 0, 1, 2 by taking input from user
import java.util.*;
public class Main
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int [n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int low=0;
        int mid=0;
        int high=n-1;
        while(mid<=high)
        {
            switch(arr[mid])
            {
                case 0:
                {
                    int temp=arr[low];
                    arr[low]=arr[mid];
                    arr[mid]=temp;
                    low++;
                    mid++;
                    break;
                }
                case 1:
                {
                    mid++;
                    break;
                }
                case 2:
                {
                    int temp=arr[mid];
                    arr[mid]=arr[high];
                    arr[high]=temp;
                    high--;
                    break;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
