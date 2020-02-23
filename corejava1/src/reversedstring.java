import java.io.*;
public class reversedstring {
    public static void main(String[] args) {
        StringBuffer str=new StringBuffer();
        str.append("ALBERTABRAHAM");
        str.reverse();
        System.out.println(str);
        str.delete(4,9);
        System.out.println(str);


    }
}
