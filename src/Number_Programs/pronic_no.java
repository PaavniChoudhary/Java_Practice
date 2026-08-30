package Number_Programs;
import java.util.Scanner;
public class pronic_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        boolean isPronic = false;
        for (int i = 0; i <= n / 2; i++) {
            if (i * (i + 1) == n) {
                isPronic = true;
                break;
            }
        }
        if (isPronic == true) {
            System.out.println("it is a pronic number");
        } else {
            System.out.println("it is not a pronic number");
        }
    }
}