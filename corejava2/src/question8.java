import java.util.Scanner;
public class question8 {
    public static String word="nothing";
    public static void main(String[] args) {
        //String word="nothing";
        while (!word.equals("done")) {

            Scanner in = new Scanner(System.in);
            word = in.nextLine();


            String[] str = word.split("");
            if (str[0].equals(str[str.length - 1]))
                System.out.println("first and last char same");
        }
    }

}


