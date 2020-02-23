class customer{
    private int cust_id;
    private String cust_name;
    public int token_no;
    public int order(){
        System.out.println("payment done");
        return token_no;
    }

}
class cashier{
    public void ordermake(customer c){
        System.out.println("order received by the cafe");

    }

}
class barista{

}
public class CoffeShop {

}
