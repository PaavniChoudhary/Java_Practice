package Number_Programs;
import java.util.Scanner;
public class magic_no {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        while(n>9){
            int sum=0;
            while(n!=0){
                int c=n%10;
                sum+=c;
                n=n/10;
            }
            n=sum;
        }
        if(n==1){
            System.out.println("it is a magic number");
        }
        else{
            System.out.println("not a magic number");
        }
    }
}
