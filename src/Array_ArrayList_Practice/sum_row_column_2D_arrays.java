package Array_ArrayList_Practice;
import java.util.Scanner;
import java.util.Arrays;
public class sum_row_column_2D_arrays {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of rows");
        int r=sc.nextInt();
        System.out.println("enter number of columns");
        int c=sc.nextInt();
        System.out.println("enter a 2D array");
        int[][] a=new int[r][c];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<a.length;i++){
            int sum_rows=0;
            for(int j=0;j<a[i].length;j++){
                sum_rows+=a[i][j];
            }
            System.out.println("sum of elements of rows "+i+" : "+sum_rows);
        }
        for(int j=0;j<c;j++){
            int sum_columns=0;
            for(int i=0;i<r;i++){
                sum_columns+=a[i][j];
            }
            System.out.println("sum of elements of rows "+j+" : "+sum_columns);
        }
        for(int i=0;i<a.length;i++){
            System.out.println(Arrays.toString(a[i]));
        }
    }
}