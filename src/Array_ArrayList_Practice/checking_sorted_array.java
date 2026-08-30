package Array_ArrayList_Practice;
import java.util.Scanner;
public class checking_sorted_array {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array");
        int n=sc.nextInt();
        System.out.println("enter an array");
        int[] a=new int[n];
        boolean sorted=true;
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<a.length-1;i++){
           if(a[i]>a[i+1]){
               sorted=false;
               break;
           }
        }
        if(sorted==true){
            System.out.println("it is a sorted array in ascending order");
        }
        else{
            System.out.println("not a sorted array");
        }
    }
}