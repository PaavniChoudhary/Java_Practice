package Array_ArrayList_Practice;
import java.util.Scanner;
import java.util.ArrayList;
public class remove_even_no_ArrayList {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter length of arrayLists");
        int n=sc.nextInt();
        System.out.println("enter an arraylist");
        ArrayList<Integer> a=new ArrayList<>();
        int c=0;
        for(int i=0;i<n;i++){
            int num=sc.nextInt();
            a.add(num);
        }
        for(int i=0;i<a.size();i++){
            if(a.get(i)%2==0){
                a.remove(i);
                i--;
            }
    }
        //alternative for loop for(int i<a.size()-1;i>0;i--)
        //                        if(a.get(i)%2==0)
        //                        a.remove(i);
        for(int i=0;i<a.size();i++){
            System.out.println(a.get(i));
        }
    }
}
