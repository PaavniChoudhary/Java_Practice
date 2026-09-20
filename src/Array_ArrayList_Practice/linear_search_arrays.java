package Array_ArrayList_Practice;
import java.util.Scanner;
public class linear_search_arrays {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of array");
        int si = sc.nextInt();
        System.out.println("enter the array");
        int[] a = new int[si];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("enter the number to be searched ");
        int n = sc.nextInt();
        int s = linear_search(a, n);
        if (s == -1)
            System.out.println("the number is not present in the array");
        else
            System.out.println("the number is present on index : " + s);
    }

    static int linear_search(int[] a, int target) {
        int c=0;
        int i;
        for(i=0;i<a.length;i++){
            if(a[i]==target) {
                c=1;
                break;
            }
        }
        if(c==1) {
            return i;
        } else {
            return -1;
        }
    }
}