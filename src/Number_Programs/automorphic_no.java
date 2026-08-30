package Number_Programs;
import java.util.Scanner;
public class automorphic_no {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        int p=n*n;
        int l =0;
        int org=n;
        while(n!=0){
            int c=n%10;
            l++;
            n=n/10;
        }
        int d=p%((int)Math.pow(10,l));
        if(d==org) {
            System.out.println("it is a automorphic number");
        }
        else{
            System.out.println("not a automorphic number");
        }
    }
}

