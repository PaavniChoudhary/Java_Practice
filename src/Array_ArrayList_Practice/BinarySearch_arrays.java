package Array_ArrayList_Practice;
import java.util.Scanner;
public class BinarySearch_arrays {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of the array");
        int l = sc.nextInt();
        System.out.println("enter the number to be searched");
        int n = sc.nextInt();
        System.out.println("enter the array");
        int[] a = new int[l];
        for (int i=0;i<a.length;i++) {
            a[i]=sc.nextInt();
        }
        int c=binarySearch(a,n);
        if(c!=-1)
            System.out.println("it is located at index "+c);
        else
            System.out.println("it is not located in the array");
    }
    static int binarySearch(int a[],int n) {
        int s=0;
        int e=a.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(n>a[mid]) {
                s=mid+1;
            }
            else if(n<a[mid]){
                e=mid-1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}