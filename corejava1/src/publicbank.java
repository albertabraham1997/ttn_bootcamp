class Bank{
    private float roi;
    public float getDetails(){
        return roi;
    }
}
class ICICI extends Bank{
    public float roi=4.5f;
    public ICICI(){
        System.out.println("im in icici bank");
    }
    public float getDetails(){
        return roi;
    }
}
class BOI extends Bank{
    public float roi=7.5f;
    public BOI(){
        System.out.println("im in boi bank");
    }
    public float getDetails(){
        return roi;
    }
}
class SBI extends Bank{
    public float roi=4.75f;

    public SBI(){
        System.out.println("im in sbi bank");
    }
    public float getDetails(){
        return roi;
    }
}
public class publicbank {
    public static void main(String[] args) {
        Bank b=new Bank();
        SBI sbi=new SBI();
        System.out.println(sbi.getDetails());
        ICICI icici=new ICICI();
        System.out.println(icici.getDetails());
        BOI boi=new BOI();
        System.out.println(boi.getDetails());



    }
}
