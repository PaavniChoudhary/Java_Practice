package Number_Programs;
import java.util.Scanner;
public class square_cube_function {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        calculations(n);
    }
    static void calculations(int n){
        int square=n*n;
        int cube=n*n*n;
        System.out.println("square of the number : "+square);
        System.out.println("cube of a number : "+cube);
    }
}
