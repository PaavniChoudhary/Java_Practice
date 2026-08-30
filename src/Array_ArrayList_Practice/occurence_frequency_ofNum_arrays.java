package Array_ArrayList_Practice;
import java.util.Scanner;
public class occurence_frequency_ofNum_arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
        System.out.println("enter a number you want to find");
        int n = sc.nextInt();
        System.out.println("enter the array");
        int count = 0;
        int c = 0;
        int index = 0;
        for(int i=0;i<a.length;i++) {
            a[i]=sc.nextInt();
            if (a[i]==n) {
                count++;
            }
        }
            for(int i=0;i<a.length;i++){
            if(a[i]==n){
                index=i;
                c=1;
                break;
            }
        }
        if(c==1){
            System.out.println("first occurence is index: "+index+" on: "+(index+1)+" place");
        }
        else{
            System.out.println("number not found in the array");
        }
        System.out.println("frequency of the number in the array is : "+count);
    }
}