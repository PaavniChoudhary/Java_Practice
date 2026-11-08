package Array_ArrayList_Practice;
import java.util.Arrays;
import java.util.Scanner;
public class Sorting_SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of elements in the array");
        int n = sc.nextInt();
        System.out.println("enter the array");
        int[] a = new int[n];
        for (int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        SelectionSort(a);
        System.out.println(Arrays.toString(a));
    }
    static void SelectionSort(int[] a){
        for(int i=0;i<a.length;i++){
            int last=a.length-i-1;
            int maxIndex=getMaxIndex(a,0,last);
            swap(a,maxIndex,last);
        }
    }
    static void swap(int[] arr,int first,int second) {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
    static int getMaxIndex(int[] arr,int start,int end) {
        int max=start;
        for(int i=start;i<=end;i++){
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }
}