import java.util.Scanner;
public class Duplicates {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.println(s);


        String[] arr = s.split(" ");
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].equals(arr[j])) {
                    count = count + 1;
                    arr[j] = "0";
                }
            }
            if (count > 1 && arr[i] != "0") {
                System.out.println(arr[i] + "-->" + count);
            }
        }


    }
}

