import java.util.Scanner;
public class STRINGZZ {
    public static void main(String[] args) {
        System.out.println("enter the string");
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        String[] str=s.split("");
        int countupper=0;
        int countlower=0;
        int countnumber=0;
        int countspecial=0;
        int n=str.length;
        System.out.println(n);
        for(int i=0;i<n;i++){
            char m=str[i].charAt(0);
            if (Character.isUpperCase(m)){
                countupper=countupper+1;

            }
            else if (Character.isLowerCase(m)){
                countlower=countlower+1;
            }
            else if(Character.isDigit(m)){
                countnumber=countnumber+1;

            }
            else{
                countspecial=countspecial+1;
            }

        }
        System.out.println("number of upper case and percentage is");
        System.out.println(countupper+"..%-->"+(float)((countupper*100)/n));
        System.out.println("number of lower case and percentage is");
        System.out.println(countlower+"..%-->"+(float)((countlower*100)/n));
        System.out.println("number of integers and percentage is");
        System.out.println(countnumber+"..%-->"+(float)((countnumber*100)/n));
        System.out.println("number of special case and percentage is");



    }
}
