package Array_ArrayList_Practice;
import java.util.Scanner;
public class linearSearch_2D_array {
    public static void main(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of rows");
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
        System.out.println("enter the number to be searched");
        int n=sc.nextInt();
        int s=linearSearch(a,n);
        if(s==-1)
            System.out.println("the number is not present in the array");
        else
            System.out.println("the number is present in the array");
    }
    static int linearSearch(int[][]a,int n){
        int c=0;int i;
        for(i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                if(a[i][j]==n){
                    c=1;
                    break;
                }
            }
        }
        if(c==1)
            return i;
        else
            return -1;
    }
}
