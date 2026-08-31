package Array_ArrayList_Practice;
import java.util.Scanner;
import java.util.ArrayList;
public class sum_min_max_ArrayList {
    public static void main()
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter size of Arraylist");
        int n=sc.nextInt();
        System.out.println("enter an arraylist");
        ArrayList<Integer> a=new ArrayList<>(n);
        int sum=0;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int num=sc.nextInt();
            a.add(num);
            sum+=num;
        }
        System.out.println("sum of number is : "+sum);
        for(int i=0;i<a.size();i++){
            System.out.println(a.get(i));
        }
        a.add(55);
        a.add(70);
        System.out.println("updated list : "+a);
        for(int i=0;i<a.size();i++){
            int current_num=a.get(i);
            if(min>current_num)
                min=current_num;
            if(max<current_num)
                max=current_num;
        }
        System.out.println("largest value is : "+max);
        System.out.println("smallest value is : "+min);
    }
}