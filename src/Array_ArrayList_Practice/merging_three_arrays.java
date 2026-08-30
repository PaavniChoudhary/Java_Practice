package Array_ArrayList_Practice;
import java.util.Scanner;
import java.util.Arrays;
public class merging_three_arrays {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of first array");
        int n1=sc.nextInt();
        System.out.println("enter size of second array");
        int n2=sc.nextInt();
        System.out.println("enter size of third array");
        int n3=sc.nextInt();
        int[] a=new int[n1];
        int[] ar=new int[n2];
        int[] arr=new int[n3];
        int[] merged=new int[n1+n2+n3];
        System.out.println("enter first array");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
            merged[i]=a[i];
        }
        System.out.println("enter second array");
        for(int i=0;i<ar.length;i++){
            ar[i]=sc.nextInt();
            merged[a.length+i]=ar[i];
        }
        System.out.println("enter third array");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            merged[a.length+ar.length+i]=arr[i];
        }
        System.out.println("the merged array is : "+Arrays.toString(merged));
    }
}