package Array_ArrayList_Practice;
import java.util.Scanner;
public class linear_search_inRange {
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int si=sc.nextInt();
        System.out.println("enter the starting range");
        int start=sc.nextInt();
        System.out.println("enter the ending range");
        int end=sc.nextInt();
        System.out.println("enter the array");
        int [] a=new int[si];
        for(int i=0; i<a.length;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("enter the number to searched");
        int n=sc.nextInt();
        int s=linear_search(a,start,end,n);
        if(s==-1)
            System.out.println("the number is not present in the array");
        else
            System.out.println("the number is present on index : "+s);
    }
    static int linear_search(int[] a,int start,int end,int n){
        int c=0;int i=0;
        for(i=start;i<end;i++) {
            if (a[i] == n) {
                c = 1;
                break;
            }
        }
            if(c==1)
                return i;
            else
                return -1;
    }
}