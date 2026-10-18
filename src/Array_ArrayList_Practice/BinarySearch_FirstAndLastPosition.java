package Array_ArrayList_Practice;
import java.util.Arrays;
import java.util.Scanner;
public class BinarySearch_FirstAndLastPosition {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of elements in an array");
        int l=sc.nextInt();
        System.out.println("enter the number for which we need to find first and last position");
        int n=sc.nextInt();
        System.out.println("enter the array");
        int[] a=new int[l];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        int[] ans={-1,-1};
        ans[0]=first_last_position(a,n,true);
        if(ans[0]!=-1) {
            ans[1]=first_last_position(a,n,false);
        }
        System.out.println(Arrays.toString(ans));
    }
    static int first_last_position(int[] a,int n,boolean findStartIndex) {
        int ans=-1;
        int s=0;
        int e=a.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(n>a[mid])
                s=mid+1;
            else if(n<a[mid])
                e=mid-1;
            else{
                //possible answer but not final answer
                ans=mid;
                if(findStartIndex){
                    e=mid-1;
                } else{
                    s=mid+1;
                }
            }
        }
        return ans;
    }
}