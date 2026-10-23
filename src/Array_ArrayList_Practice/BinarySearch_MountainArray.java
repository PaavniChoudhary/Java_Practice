package Array_ArrayList_Practice;
import java.util.Scanner;
public class BinarySearch_MountainArray {
    public static void main(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length of array");
        int l=sc.nextInt();
        System.out.println("enter the number to be seached");
        int n=sc.nextInt();
        System.out.println("enter the mountain array");
        int[] a=new int[l];
        for (int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        int ans=search(a,n);
        System.out.println("answer is present at index : "+ans);
    }
    static int search(int[] a,int n) {
        int peak = PeakElementInMountainArray(a);
        int firstTry = OrderAgnosticBinarySearch(a,n,0,peak);
        if (firstTry != -1) {
            return firstTry;
        }
        // try to search in second half
        return OrderAgnosticBinarySearch(a,n,peak+1,a.length - 1);
    }
    static int PeakElementInMountainArray(int[] a){
        int s=0;
        int e=a.length-1;
        while(s<e){
            int mid=s+(e-s)/2;
            if(a[mid]>a[mid+1])
                // you are in dec part of array
                // this may be the ans, but look at left
                // this is why end != mid - 1
                e=mid;
            else
                // you are in asc part of array
                // because we know that mid+1 element > mid element
                s=mid+1;
        }
        // in the end, start == end and pointing to the largest number because of the 2 checks above
        // start and end are always trying to find max element in the above 2 checks
        // hence, when they are pointing to just one element, that is the max one because that is what the checks say
        // more elaboration: at every point of time for start and end, they have the best possible answer till that time
        // and if we are saying that only one item is remaining, hence cuz of above line that is the best possible ans
        // or return end as both are =
        return s;
    }
    static int OrderAgnosticBinarySearch(int[] a,int n,int s,int e){
        boolean isAsc = a[s]<a[e];
        while(s<=e){
            int mid=s+(e-s)/2;
        if(a[mid]==n){
            return mid;
        }
        if(isAsc){
            if(n<a[mid]){
                e=mid-1;
            } else{
                s=mid+1;
            }
        }
        else{
            if (n>a[mid]) {
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
    }
        return -1;
    }
}