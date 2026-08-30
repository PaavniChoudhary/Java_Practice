package Array_ArrayList_Practice;
import java.util.Scanner;
public class count_EveOdd_PosNeg_zero_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
        System.out.println("enter the array");
        int even=0;int odd=0;int pos=0;int neg=0;int zero=0;
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
            if (a[i]%2==0){
                even++;
            }
            if (a[i]%2!=0) {
                odd++;
            }
            if (a[i]>0) {
                pos++;
            }
            if (a[i]<0) {
                neg++;
            }
            if (a[i]==0) {
                zero++;
            }
        }
        System.out.println("number of even numbers : "+even);
        System.out.println("number of odd numbers : "+odd);
        System.out.println("number of positive numbers : "+pos);
        System.out.println("number of negative numbers : "+neg);
        System.out.println("number of zeros : "+zero);
    }
}