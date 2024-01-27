//Given an array and sum k , we need to print the length of the longest subarray whose sum is equal to k 
import java.util.*;
public class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 3;
        int k = 5;
        int arr[] = { 2, 3, 5 };
        int sum =0;
        int max =0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
            if(sum==k)
            max = i+1;
            if(!map.containsKey(sum))
            map.put(sum,i);
            if(map.containsKey(sum-k))
            {
                if(max<i-map.get(sum-k))
                max = i-map.get(sum-k);
            }
        }
        System.out.println(max);
    }
}
