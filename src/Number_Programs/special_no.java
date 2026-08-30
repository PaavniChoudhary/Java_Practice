package Number_Programs;
import java.util.Scanner;
public class special_no {
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        int m;int f=n;
        int sum=0;
        while(n>0){
            int c=n%10;
            m=1;
            for(int i=1;i<=c;i++){
                m=m*i;
            }
            sum+=m;
            n=n/10;
        }
        if(sum==f) {
            System.out.println("special number");
        }
        else {
            System.out.println("not a special no.");
        }
    }
}
