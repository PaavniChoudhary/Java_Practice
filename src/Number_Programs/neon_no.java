package Number_Programs;
import java.util.Scanner;
public class neon_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        int c=n*n;
        int sum=0;
        int f=n;
        while (c>0) {
            int d=n%10;
            sum+=d;
            c=c/10;
        }
        if (sum==f) {
            System.out.println("it is a neon number");
        } else {
            System.out.println("not a neon number");
        }
    }
}
