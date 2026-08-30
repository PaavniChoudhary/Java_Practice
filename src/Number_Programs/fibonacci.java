package Number_Programs;
import java.util.Scanner;
/*take input of a no. n and find nth Fibonacci number
0,1,1,2,3,5,8,13 (next num=sum of previous two)*/
public class fibonacci {
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        System.out.println("enter a number n");
        int n=sc.nextInt();
        int a=0;
        int b=1;
        for(int i=3;i<=n;i++){
            int temp=b;
            b=b+a;
            a=temp;
        }
        System.out.println("nth letter of Fibonacci series is : "+b);
    }
}
