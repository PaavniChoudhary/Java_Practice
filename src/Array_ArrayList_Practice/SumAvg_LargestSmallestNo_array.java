package Array_ArrayList_Practice;
import java.util.Scanner;
public class SumAvg_LargestSmallestNo_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] a=new int[10];
        System.out.println("enter the array");
        int sum=0;
        for (int i=0;i<a.length;i++) {
            a[i]=sc.nextInt();
            sum+=a[i];
        }
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.println("sum of all elements : "+sum);
        System.out.println("average of all elements : "+(sum/a.length));
        smallest(a);
        largest(a);
    }
    static void smallest(int[] a){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++){
            if(a[i]<min){
                min=a[i];
            }
        }
        System.out.println("smallest number :" +min);
    }
    static void largest(int[] a){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        System.out.println("largest number :" +max);
    }
}