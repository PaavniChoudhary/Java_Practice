package Number_Programs;

import java.util.Scanner;
public class min_max_digit {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        int min=9;int max=0;
        while(n!=0){
            int c=n%10;
            if(c>max){
                max=c;
            }
            if(c<min){
                min=c;
            }
            n=n/10;
        }
        System.out.println("max didit of number : "+max);
        System.out.println("min digit of number : "+min);
    }
}