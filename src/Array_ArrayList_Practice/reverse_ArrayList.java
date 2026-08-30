package Array_ArrayList_Practice;
import java.util.Scanner;
import java.util.ArrayList;
public class reverse_ArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length of arrayLists");
        int n = sc.nextInt();
        System.out.println("enter an arraylist");
        ArrayList<Integer> a = new ArrayList<>();
        for (int i=0;i<n;i++) {
            int num=sc.nextInt();
            a.add(num);
        }
        int s=0;
        int e=a.size()-1;
        while (s<e){
            int temp=a.get(s);
            a.set(s,a.get(e));
            a.set(e,temp);
            s++;
            e--;
        }
        System.out.println("output : " + a);
    }
}