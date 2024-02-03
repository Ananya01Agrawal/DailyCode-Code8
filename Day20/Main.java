
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        if(str1.length() != str2.length()){
            System.out.println("false");
            return;
        }
        int[] arr = new int[256];
        for(int i = 0; i < str1.length(); i++){
            arr[str1.charAt(i)]++;
            arr[str2.charAt(i)]--;
        }
        for(int i = 0; i < 256; i++){
            if(arr[i] != 0){
                System.out.println("false");
                return;
            }
        }
        System.out.println("true");
    }
}
