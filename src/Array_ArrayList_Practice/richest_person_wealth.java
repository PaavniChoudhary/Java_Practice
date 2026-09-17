package Array_ArrayList_Practice;
import java.util.Arrays;
import java.util.Scanner;
public class richest_person_wealth {
    public static void main(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of people");
        int r=sc.nextInt();
        System.out.println("enter number of accounts");
        int c=sc.nextInt();
        System.out.println("enter in 2D array form");
        int[][] a=new int[r][c];
        int maxr=Integer.MIN_VALUE;
        int max_row_index=0;
        for(int person=0;person<a.length;person++){
            for(int account=0;account<a.length;account++){
                a[person][account]=sc.nextInt();
            }
        }
        for(int person=0;person<a.length;person++){
            int sum_rows=0;
            for(int account=0;account<a.length;account++){
                sum_rows+=a[person][account];
            }
            System.out.println("total wealth of a person "+(person+1)+" : "+sum_rows);
            if(maxr<sum_rows)
                maxr=sum_rows;
            max_row_index=person;
        }
        for(int person=0;person<a.length;person++){
            System.out.println(Arrays.toString(a[person]));
        }
        System.out.println("richest person is : "+(max_row_index+1)+" and the wealth is : "+maxr);
    }
}
