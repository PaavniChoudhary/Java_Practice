package Array_ArrayList_Practice;
import java.util.Scanner;
import java.util.Arrays;
public class Sorting_BubbleSort {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of elements in the array");
        int n=sc.nextInt();
        System.out.println("enter the array");
        int[] a=new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        BubbleSort(a);
        System.out.println(Arrays.toString(a));
    }
    static void BubbleSort(int[] a){
        for(int i=0;i<a.length;i++){
            boolean swapped=false;
            for(int j=1;j<a.length-i;j++){
                if(a[j]<a[j-1]){
                    int temp=a[j];
                    a[j]=a[j-1];
                    a[j-1]=temp;
                    swapped=true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
}
