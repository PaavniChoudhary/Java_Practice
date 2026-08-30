package Array_ArrayList_Practice;
import java.util.Scanner;
import java.util.Arrays;
public class sum_2D_arrays {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of rows");
        int r=sc.nextInt();
        System.out.println("enter number of columns");
        int c=sc.nextInt();
        System.out.println("enter a 2D array");
        int[][] a=new int[r][c];
        int sum=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                a[i][j]=sc.nextInt();
                sum+=a[i][j];
            }
        }
        System.out.println("sum of all elements : "+sum);
        for(int i=0;i<a.length;i++){
            System.out.println(Arrays.toString(a[i]));
        }
    }
}