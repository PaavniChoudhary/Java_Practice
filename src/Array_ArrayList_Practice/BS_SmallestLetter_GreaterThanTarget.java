package Array_ArrayList_Practice;
import java.util.Scanner;
public class BS_SmallestLetter_GreaterThanTarget {
    public static void main(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length of array");
        int l=sc.nextInt();
        System.out.println("enter the letter");
        char c=sc.next().charAt(0);
        System.out.println("enter the array");
        char[] a = new char[l];
        for (int i=0;i<a.length;i++) {
            a[i]=sc.next().charAt(0);
        }
        char ch=SmallestLetter(a,c);
        System.out.println("the answer is "+ch);
    }
    static char SmallestLetter(char[] a,char c){
        int s=0;
        int e=a.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(c<a[mid]){
                e=mid-1;
            }
            else {
                s=mid+1;
            }
        }
        return a[s%a.length];
    }
}