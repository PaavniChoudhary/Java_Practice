package Array_ArrayList_Practice;
import java.util.Scanner;
import java.util.Arrays;
public class evenodd_count_2D_arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of rows");
        int r = sc.nextInt();
        System.out.println("enter number of columns");
        int c = sc.nextInt();
        System.out.println("enter a 2D array");
        int[][] a = new int[r][c];
        int odd_count=0;int even_count=0;
        for (int i=0;i<a.length;i++) {
            for (int j=0;j<a[i].length;j++) {
                a[i][j]=sc.nextInt();
                if (a[i][j]%2==0)
                    even_count++;
                else
                    odd_count++;
            }
        }
        System.out.println("number of even elements : "+even_count);
        System.out.println("number of odd elements : "+odd_count);
        }
    }