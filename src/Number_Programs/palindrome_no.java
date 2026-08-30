package Number_Programs;
import java.util.Scanner;
public class palindrome_no {
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        System.out.println("enter a no.to check if it is palindrome no.");
        int n=sc.nextInt();
        int s=n;
        int rev=0;
        while(n>0) {
            int c=n%10;
            rev=rev*10+c;
            n=n/10;
        }
        System.out.println("reverse of the number is : "+rev);
        if(rev==s){
            System.out.println("it is a palindrome number");
        }
        else {
            System.out.println("not a palindrome number");
        }
    }
}
