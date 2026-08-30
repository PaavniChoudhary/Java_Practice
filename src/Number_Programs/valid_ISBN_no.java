package Number_Programs;
import java.util.Scanner;
public class valid_ISBN_no {
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        System.out.println("enter a number");
        long n=sc.nextInt();
        int l=0;
        long org=n;
        long sum=0;
        while(n!=0){
            long c=n%10;
            l++;
            n=n/10;
        }
        if(l==10){
            while(org!=0) {
                long d=org%10;
                long p=d*l;
                l--;
                sum+=p;
                org=org/10;
            }

            if(sum%11==0){
                System.out.println("it is a valid ISBN number");
            }
            else {
                System.out.println("not a valid ISBN number");
            }
        }
        else{
            System.out.println("not a valid ISBN number");
        }
}
}