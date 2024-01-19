import java.util.*;

public class Main {
    public static void main(String[] args) {
        //given string to check whetehr it is pallindrome or not and return true or false   
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(isPallindrome(str));
    }   
    public static boolean isPallindrome(String str){
        int i = 0;
        int j = str.length()-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
