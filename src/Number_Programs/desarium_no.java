package Number_Programs;
import java.util.Scanner;
public class desarium_no {
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        int l=0;int org=n;
        int sum=0;int f=n;
        while(n!=0){
            int c=n%10;
            l++;
            n=n/10;
        }
        while(org!=0){
            int d=org%10;
            int p=(int)Math.pow(d,l);
            sum+=p;
            l--;
            org=org/10;
        }
        if(sum==f){
            System.out.println("it is a desarium number");
        }
        else{
            System.out.println("not an desarium number");
        }
    }
}