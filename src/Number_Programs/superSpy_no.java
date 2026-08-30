package Number_Programs;
import java.util.Scanner;
public class superSpy_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        int sum=0;
        int count=0;
        while(n!=0){
            int c=n%10;
            sum+=c;
            count++;
            n=n/10;
        }
        if(sum==count) {
            System.out.println("it is a super spy number");
        }
        else {
            System.out.println("not a super spy number");
        }
    }
}