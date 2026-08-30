package Number_Programs;
import java.util.Scanner;
public class duck_no {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        boolean duck=false;
        while(n!=0){
            int c=n%10;
            if(c==0){
                duck=true;
                break;
            }
            n=n/10;
        }
        if(duck==true){
            System.out.println("it is a duck number");
        }
        else{
            System.out.println("not a duck number");
        }
    }
}