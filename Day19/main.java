import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
   
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }
    
    int target = sc.nextInt();
    System.out.println(canSum(target,arr));
  }
  public static boolean canSum(int target, int[] arr){
    boolean[] table = new boolean[target+1];
    table[0] = true;
    for(int i=0;i<=target;i++){
      if(table[i] == true){
        for(int num:arr){
          if(i+num<=target){
            table[i+num] = true;
          }
        }
      }
    }
    return table[target];
  }
}
