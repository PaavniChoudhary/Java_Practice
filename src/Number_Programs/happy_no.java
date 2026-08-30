package Number_Programs;
import java.util.Scanner;
public class happy_no {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        int sum=0;
        while(n>9){
            while(n!=0){
                int c=n%10;
                sum+=(c*c);
                n=n/10;
            }
            n=sum;
            sum=0;
        }
        if(n==1){
            System.out.println("it is a happy number");
        }
        else{
            System.out.println("not a happy number");
        }
    }
}