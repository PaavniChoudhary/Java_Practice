package Array_ArrayList_Practice;
import java.util.Scanner;
public class even_digit_n_arrays{
    public static void main(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        System.out.println("enter the array");
        int[] a=new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        int total_even_digit_numbers=number(a);
        System.out.println("numbers with even number of digits = "+total_even_digit_numbers);
    }
    static int number(int [] a) {//iterate through array and count number with even digits
        int totalCount = 0;
        for (int i = 0; i < a.length; i++) {
            if (even(a[i]) == true)
                totalCount++;
        }
        return totalCount;
    }
    static boolean even(int num) { //check if no. of digits in a number is even
     int no_of_digits=digits(num);
     if(no_of_digits % 2==0)
         return true;
     else
         return false;
    }
    static int digits(int num){ //count how many digits in a number
        if(num==0) {
            return 1;
        }
        if(num<0) {
            num = num * -1;
        }
        int count;
        count=0;
        while(num!=0){
            int c=num%10;
            count++;
            num/=10;
        }
        return count;
    }
}
