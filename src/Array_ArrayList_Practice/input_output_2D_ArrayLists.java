package Array_ArrayList_Practice;
import java.util.Scanner;
import java.util.ArrayList;
public class input_output_2D_ArrayLists {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter length of arrayLists");
        int n=sc.nextInt();
        System.out.println("enter an arraylist");
        ArrayList<ArrayList<Integer>> a=new ArrayList<>();
        for(int i=0;i<n;i++){
            a.add(new ArrayList<>());
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int num=sc.nextInt();
                a.get(i).add(num);
            }
        }
        System.out.println("output : "+a);
    }
}