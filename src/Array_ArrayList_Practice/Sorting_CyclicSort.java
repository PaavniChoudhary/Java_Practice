package Array_ArrayList_Practice;
import java.util.Scanner;
import java.util.Arrays;
public class Sorting_CyclicSort {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number n");
        int n=sc.nextInt();
        System.out.println("enter the array in range 1 to n");
        int[] a=new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        CyclicSort(a);
        System.out.println(Arrays.toString(a));
    }
    static void CyclicSort(int[] a){
        int i=1;
        while(i<a.length){
            int correct=a[i]-1;
            if(a[i]!=a[correct]){
               swap(a,i,correct);
            }
            else{
                i++;
            }
        }
    }
    static void swap(int[] a,int b, int c){
        int temp=a[b];
        a[b]=a[c];
        a[c]=temp;
    }
}