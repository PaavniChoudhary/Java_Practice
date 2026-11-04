package Array_ArrayList_Practice;
import java.util.Scanner;
public class BinarySearch_RotationCount {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length of the array");
        int l=sc.nextInt();
        System.out.println("enter the array (don't repeat ant number)");
        int[] a=new int[l];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        int ans=countRotations(a);
        System.out.println("the number of rotations is : "+ans);
    }
    //this code works only for non-repeating values
    private static int countRotations(int[] arr) {
        int pivot = findPivot(arr);
        return pivot + 1;
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
