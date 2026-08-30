package Number_Programs;
import java.util.Scanner;
public class spy_no {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        int sum=0;
        int product=1;
        while(n>0){
            int c=n%10;
            sum+=c;
            product*=c;
            n=n/10;
        }
        if(sum==product) {
            System.out.println("it is a spy number");
        }
        else{
            System.out.println("not a spy number");
        }
    }
}