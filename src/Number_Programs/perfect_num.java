package Number_Programs;
import java.util.Scanner;
public class perfect_num {
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        int sum=0;int i;
        for(i=1;i<=n/2;i++){
            if (n % i == 0) {
                sum+=i;
            }
        }
        if (sum==n){
            System.out.println("it is a perfect number");
        }
        else{
            System.out.println("not a perfect number");
        }
    }
}
