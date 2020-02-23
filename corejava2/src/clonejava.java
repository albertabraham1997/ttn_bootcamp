public class clonejava implements Cloneable {
    String name;
    int roll_no;
    public clonejava(String name,int roll_no){
        this.name=name;
        this.roll_no=roll_no;

    }
    public Object clone()throws CloneNotSupportedException{
        return super.clone();
    }

    public static void main(String[] args) {
      try {

          clonejava cj1 = new clonejava("Albert", 234);
          clonejava cj2 = (clonejava) cj1.clone();
          System.out.println(cj1.name + "->" + cj1.roll_no);
          System.out.println(cj2.name + "->" + cj2.roll_no);
          }
      catch (CloneNotSupportedException c){}


    }


}
