package Number_Programs;
import java.util.Scanner;
public class factorial_using_functions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a numbers");
        int n = sc.nextInt();
        int a = factorial(n);
        System.out.println("factorial of an is : "+a);
    }
    static int factorial(int n) {
        int f=1;
        for(int i=1;i<=n;i++) {
            f*=i;
        }
        return f;
    }
}