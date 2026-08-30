package Array_ArrayList_Practice;
import java.util.Arrays;
import java.util.Scanner;
public class merge_two_arrays {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of first array");
        int n1=sc.nextInt();
        System.out.println("enter size of second array");
        int n2=sc.nextInt();
        int[] a=new int[n1];
        int[] ar=new int[n2];
        int[] arr=new int[n1+n2];
        System.out.println("enter first array");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
            arr[i]=a[i];
        }
        System.out.println("enter second array");
        for(int i=0;i<ar.length;i++){
            ar[i]=sc.nextInt();
            arr[a.length+i]=ar[i];
        }
        System.out.println("the merged array is : "+Arrays.toString(arr));
    }
}