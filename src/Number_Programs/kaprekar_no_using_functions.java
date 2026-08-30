package Number_Programs;
import java.util.Scanner;
public class kaprekar_no_using_functions {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        int a=kaprekarNo(n);
        if(a==n){
            System.out.println("it is a kaprekar number");
        }
        else{
            System.out.println("it is not a kaprekar number");
        }
    }
    static int kaprekarNo(int num){
        int l=0;
        int a=num*num;
        int f=a;
        while(num!=0){
            int c=num%10;
            l++;
            num/=10;
        }
        int b=(int)Math.pow(10,l);
        int p=f%b;
        int q=f/b;
        int sum=p+q;
        return sum;
    }
}