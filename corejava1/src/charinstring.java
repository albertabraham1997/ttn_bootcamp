import java.sql.SQLOutput;
import java.util.Scanner;

public class charinstring {
    public static void main(String[] args) {
        System.out.println("enter the string");
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        System.out.println("enter the char");
        Scanner in2=new Scanner(System.in);
        String c=in2.nextLine();

        int n=s.length()-s.replace(c,"").length();
        System.out.println(n);


    }
}
