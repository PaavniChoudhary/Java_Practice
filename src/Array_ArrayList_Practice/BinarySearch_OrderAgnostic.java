package Array_ArrayList_Practice;
import java.util.Scanner;
public class BinarySearch_OrderAgnostic {
    public static void main(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length of the array");
        int l=sc.nextInt();
        System.out.println("enter the number to be searched");
        int n=sc.nextInt();
        System.out.println("enter the array");
        int[] a=new int[l];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        int c=order_agnostic_binary_search(a,n);
        if(c!=-1)
            System.out.println("no. present at "+c+" index or "+(c+1)+" position");
        else
            System.out.println("the no. is not present in the array");
    }
    static int order_agnostic_binary_search(int[] a,int n) {
        int s=0;
        int e=a.length-1;
        boolean isAsc=a[s]<=a[e];
        while(s<=e){
            int mid=s+(e-s)/2;
            if(n==a[mid])
                return mid;
            if(isAsc){
                if(n>a[mid])
                    s=mid+1;
                else
                    e=mid-1;
            }
            else{
                if(n>a[mid])
                    e=mid-1;
                else
                    s=mid+1;
            }
        }
        return -1;
    }
}