package Array_ArrayList_Practice;
import java.util.Scanner;
import java.util.ArrayList;
public class count_occurance_ArrayLists {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter length of arrayLists");
        int n=sc.nextInt();
        System.out.println("enter the number you want to find");
        int no=sc.nextInt();
        System.out.println("enter an arraylist");
        ArrayList<Integer> a=new ArrayList<>();
        int c=0;
        for(int i=0;i<n;i++){
            int num=sc.nextInt();
            a.add(num);
            if(num==no)
                c++;
        }
        System.out.println("frequency of number is : "+c);
    }
}