package Array_ArrayList_Practice;
import java.util.Arrays;
import java.util.Scanner;
public class BS_RowColOrderSortedMatrix {
    public static void main(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of elements in rows");
        int r=sc.nextInt();
        System.out.println("enter number of elements in columns");
        int c=sc.nextInt();
        System.out.println("enter target element");
        int n=sc.nextInt();
        System.out.println("enter the 2D array");
        int[][] a=new int[r][c];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                a[i][j]=sc.nextInt();
            }
        }
        for (int i=0;i<a.length;i++) {
            System.out.println(Arrays.toString(a[i]));
        }
        System.out.println(Arrays.toString(search(a,n)));
    }
    static int[] search(int[][] a,int n){
        int r=0;
        int c=a[0].length-1;
        while (r<a.length && c>=0){
            if (a[r][c]==n){
                return new int[]{r, c};
            }
            if (a[r][c]<n){
                r++;
            } else{
                c--;
            }
        }
        return new int[]{-1,-1};
    }
}
