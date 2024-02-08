//Implement pow(x, n), which calculates x raised to the power n (i.e., xn).,you have to solve by taking input from user
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x");
        double x = sc.nextDouble();
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        System.out.println(myPow(x, n));
    }
    public static double myPow(double x, int n) {
        if(n == 0) return 1;
        if(n == 1) return x;
        if(n == -1) return 1/x;
        double half = myPow(x, n/2);
        double rem = myPow(x, n%2);
        return half * half * rem;
    }
}
