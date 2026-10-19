package Array_ArrayList_Practice;
import java.util.Scanner;
public class BinarySearch_InfiniteArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] a= {3, 5, 7, 9, 10, 90,
                100, 130, 140, 160, 170, 200, 270, 300, 370};
        int n= 300;
        int s=0;
        int e=1;
        while(n>a[e]){
            int temp=e+1;
            e=e+(e-s+1)*2;
            s=temp;
        }
        int ans=BinarySearchInInfiniteArrays(a,n,s,e);
        System.out.println("the location of number in infinite array is : "+ans);
    }
    static int BinarySearchInInfiniteArrays(int[] a,int n,int s,int e){
        while(s<=e){
            int mid=s+(e-s)/2;
            if(n>a[mid])
                s=mid+1;
            else if(n<a[mid])
                e=mid-1;
            else
                return mid;
        }
        return -1;
    }
}