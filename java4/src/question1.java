import java.util.ArrayList;
import java.util.Scanner;
public class question1 {


    public static void main(String[] args) {
        ArrayList<Float> l=new ArrayList<Float>();
        float finalz= 0.0f;
        for(int i=0;i<5;i++)
        {
            Scanner in = new Scanner(System.in);
            float f=in.nextFloat();
            l.add(f);
        }
        for(int j=0;j<l.size();j++){
            finalz=finalz+ l.get(j);
        }
        System.out.println(finalz);
    }
}
