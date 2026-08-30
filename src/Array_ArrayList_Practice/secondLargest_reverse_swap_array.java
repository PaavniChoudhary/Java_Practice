package Array_ArrayList_Practice;
import java.util.Arrays;
import java.util.Scanner;
public class secondLargest_reverse_swap_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] a=new int[10];
        System.out.println("enter the array");
        for (int i=0;i<a.length;i++) {
            a[i]=sc.nextInt();
        }
        second_largest(a);
        reverse(a);
        System.out.println("the reversed array : "+Arrays.toString(a));
        swap(a,0,6);
        System.out.println("swapping 0th and 6th element : "+Arrays.toString(a));
    }
    static void second_largest(int[] a){
        int maxs=Integer.MIN_VALUE;int max=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        for(int j = 0; j <a.length; j++){
            if(a[j]>maxs && a[j]<max){
                maxs=a[j];
            }
        }
        System.out.println("second largest number :" +maxs);
    }
    static void reverse(int[] a){
        int s=0;
        int e=a.length-1;
        while(s<e){
            swap(a,s,e);
            s++;
            e--;
        }
    }
    static void swap(int[] a,int i1,int i2){
        int temp=a[i1];
        a[i1]=a[i2];
        a[i2]=temp;
    }
}
