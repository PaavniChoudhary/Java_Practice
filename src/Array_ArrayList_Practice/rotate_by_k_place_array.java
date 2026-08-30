package Array_ArrayList_Practice;
import java.util.Scanner;
import java.util.Arrays;
public class rotate_by_k_place_array {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter k");
        int k=sc.nextInt();
        System.out.println("enter size of array");
        int n=sc.nextInt();
        int[] a=new int[n];
        int[] ar=new int[n];
        System.out.println("enter array");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
            int newIndex=(i+k)%n;
            ar[newIndex]=a[i];

        }
        System.out.println("the merged array is : "+Arrays.toString(ar));
    }
}