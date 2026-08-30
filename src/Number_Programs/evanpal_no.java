package Number_Programs;
import java.util.Scanner;
public class evanpal_no {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        int sum=0;int rev=0;int f=n;
        while(n!=0){
            int c=n%10;
            rev=rev*10+c;
            sum+=c;
            n=n/10;
        }
        if(rev==f && sum%2==0){
            System.out.println("it is an evenpal number");
        }
        else{
            System.out.println("not an evenpal number");
        }
    }
}
