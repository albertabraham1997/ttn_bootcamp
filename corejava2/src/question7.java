
import java.util.Scanner;


public class question7 {
    public static int seconds;
    public static void display(int seconds){
        int days;
        int a=24*60*60;
        days=seconds/a;
        int b=seconds-(days*24*60*60);
        int c=60*60;
        int hours;
        hours=b/c;
        int d=b-(hours*60*60);
        int minutes=d/60;
        int second=d-minutes*60;
        System.out.println("the total time is "+days+" days "+hours+" hours "+minutes+" minutes "+"and "+second+" second");




    }

    public static void main(String[] args) {

        System.out.println("enter the seconds");

        Scanner in = new Scanner(System.in);

        seconds = in.nextInt();
        display(seconds);
    }




}
