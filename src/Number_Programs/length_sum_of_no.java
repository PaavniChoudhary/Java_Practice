package Number_Programs;
import java.util.Scanner;
public class length_sum_of_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        int l=0;int sum=0;
        while(n>0){
            int c=n%10;
            l++;
            sum+=c;
            n=n/10;
        }
        System.out.println("length : "+l);
        System.out.println("sum of digits : "+sum);
    }
}