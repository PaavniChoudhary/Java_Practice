package Array_ArrayList_Practice;
import java.util.Scanner;
public class BinarySearch_RotatedArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length of the array");
        int l=sc.nextInt();
        System.out.println("enter the number to be searched");
        int n=sc.nextInt();
        System.out.println("enter the array (don't repeat ant number)");
        int[] a=new int[l];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        int ans=search(a,n);
        System.out.println("the answer is present on index : "+ans);
    }
    //this code works only for non-repeating values
    static int search(int[] a,int n) {
        int pivot=findPivot(a);
        // if you did not find a pivot, it means the array is not rotated
        if(pivot==-1){
            // just do normal binary search
            return binarySearch(a,n,0,a.length-1);
        }
        // if pivot is found, you have found 2 asc sorted arrays
        if(a[pivot]==n){
            return pivot;
        }
        return binarySearch(a,n,pivot+1,a.length-1);
    }
    static int binarySearch(int[] a,int n,int s,int e){
        while(s<=e){
            int mid=s+(e-s)/2;
            if (n<a[mid]){
                e=mid-1;
            } else if(n>a[mid]){
                s=mid+1;
            } else{
                // ans found
                return mid;
            }
        }
        return -1;
    }
    static int findPivot(int[] arr){
        int s=0;
        int e=arr.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            // 4 cases over here
            if(mid<e && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid>s && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[mid]<=arr[s]){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return -1;
    }
}