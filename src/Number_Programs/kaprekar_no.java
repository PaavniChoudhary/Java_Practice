package Number_Programs;
import java.util.Scanner;
public class kaprekar_no {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        int p=n*n;
        int l =0;
        int a =n;
        while(n!=0){
            int c=n%10;
            l++;
            n=n/10;
        }
        int b=((int)Math.pow(10,l));
        int d=p%b;
        int e=p/b;
        int sum=d+e;
        if(sum==a) {
            System.out.println("it is a kaprekar number");
        }
        else{
            System.out.println("not a kaprekar number");
        }
    }
}