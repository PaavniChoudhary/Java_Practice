package Array_ArrayList_Practice;
import javax.swing.*;
import java.util.Scanner;
public class linear_search_strings {
    public static void main(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String s=sc.nextLine();
        System.out.println("enter the character to be searched");
        char c=sc.next().trim().charAt(0);
        int a=searchInString(s,c);
        if(a!=0)
            System.out.println("character is present in string at "+(a+1)+"place (first occurence)");
        else
            System.out.println("character is not present in the string");
    }
    static int searchInString(String s,char c){
        for(int i=0;i<s.length();i++){
            if(c==s.charAt(i))
                return i;
        }
        return 0;
    }
}
