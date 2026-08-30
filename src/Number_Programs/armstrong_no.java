package Number_Programs;
import java.util.Scanner;
public class armstrong_no {
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        int l=0;int org=n;
        int p;int sum=0;int f=n;
        while(n!=0){
            int c=n%10;
            l++;
            n=n/10;
        }
        while(org!=0){
            int d=org%10;
            p=(int)Math.pow(d,l);
            sum+=p;
            org=org/10;
        }
        if(sum==f){
            System.out.println("it is a armstrong number");
        }
        else{
            System.out.println("not an armstrong number");
        }
    }
}