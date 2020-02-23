public class singleton{
    public static void main(String[] args) {
        singleton1 s1=singleton1.getInstance();
        singleton1 s2=singleton1.getInstance();
        singleton1 s3=singleton1.getInstance();
        System.out.println(s1.str);
        s1.str=s1.str.toUpperCase();
        System.out.println(s1.str);
        System.out.println(s2.str);
        System.out.println(s3.str);

    }
}


class singleton1{

    private static singleton1 partOfSingleton = null;
    public String str;
    private singleton1(){
        str="hey there";
    }
    public static singleton1 getInstance() {
        if (partOfSingleton == null){
            partOfSingleton = new singleton1();
        }
        return partOfSingleton;
    }
}
