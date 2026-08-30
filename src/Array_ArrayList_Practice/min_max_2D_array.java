package Array_ArrayList_Practice;
import java.util.Scanner;
import java.util.Arrays;
public class min_max_2D_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of rows");
        int r = sc.nextInt();
        System.out.println("enter number of columns");
        int c = sc.nextInt();
        System.out.println("enter a 2D array");
        int[][] a = new int[r][c];
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for (int i=0;i<a.length;i++) {
            for (int j=0;j<a[i].length;j++) {
                a[i][j]=sc.nextInt();
                if(min>a[i][j])
                    min=a[i][j];
                if(max<a[i][j])
                    max=a[i][j];
            }
        }
        System.out.println("smallest elements : "+min);
        System.out.println("largest elements : "+max);
        for(int i=0;i<a.length;i++){
            System.out.println(Arrays.toString(a[i]));
        }
    }
}