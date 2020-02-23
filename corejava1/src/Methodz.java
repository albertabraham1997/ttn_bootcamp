public class Methodz {
    public int method(int x,int y){
        return x+y;

    }
    public double method(double x,double y){
        return x+y;
    }
    public float method(float f1,float f2){
        return f1*f2;
    }
    public int mul(int a,int b){
        return a*b;
    }
    public String method(String S1,String S2){
        return S1+S2;
    }
    public  String method(String s1,String s2,String s3){
        return s1+s2+s3;
    }

    public static void main(String[] args) {
        Methodz m=new Methodz();
        System.out.println(m.method(2,3));
        System.out.println(m.method(2.3,3.3));
        System.out.println(m.method(2,3));
        System.out.println(m.method("albert","abraham"));
        System.out.println(m.method("to","the","new"));
        System.out.println(m.mul(2,3));


    }
}
