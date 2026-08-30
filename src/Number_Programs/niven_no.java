package Number_Programs;
import java.util.Scanner;
public class niven_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        int sum=0;
        int f=n;
        while (n>0) {
            int c=n%10;
            sum+=c;
            n=n/10;
        }
        if (f%sum==0) {
            System.out.println("it is a niven number");
        } else {
            System.out.println("not a niven number");
        }
    }
}

