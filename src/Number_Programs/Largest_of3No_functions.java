package Number_Programs;
import java .util.Scanner;
public class Largest_of3No_functions {
    public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            System.out.println("enter 3 numbers");
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            largestNumber(a,b,c);
        }
        static void largestNumber(int a,int b,int c){
            int largest;
            if(a>b && a>c){
                largest=a;
            }
            else if(b>a && b>c){
                largest=b;
            }
            else{
                largest=c;
            }
            System.out.println("the largest of 3 numbers is : "+largest);
    }
}
