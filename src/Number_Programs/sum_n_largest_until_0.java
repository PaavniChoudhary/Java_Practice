package Number_Programs;
import java.util.Scanner;
public class sum_n_largest_until_0 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("input numbers until press 0");
        int a=Integer.MIN_VALUE;
        int n;
        int sum=0;
        do{
            n=sc.nextInt();
            sum+=n;
            if(n>a) {
                a = n;
            }
        }
        while(n!=0);
        System.out.println("the largest number is : "+a);
        System.out.println("the sum of all elements is : "+sum);
    }
}