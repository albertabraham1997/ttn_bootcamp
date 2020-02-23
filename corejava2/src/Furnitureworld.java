class furniture{
    int legs;
    String material;
    //abstract void stresstest();
    //abstract void firetest();

}
class Chair extends furniture {
    String company;
    int stressq;
    int fireq;

    public Chair(int legs, String material, String company, int stressq, int fireq) {
        this.legs = legs;
        this.material = material;
        this.company = company;
        this.stressq = stressq;
        this.fireq = fireq;
    }

    public void stresstest() {
        if (stressq > 500) {
            System.out.println("stress test passed");
        } else {
            System.out.println("fail");
        }

    }

    public void firetest() {
        if (fireq > 400) {
            System.out.println("fire test passed");
        } else {
            System.out.println("fail");
        }
    }
}
class Table extends furniture {
    String company;
    int stressq;
    int fireq;

    public Table(int legs, String material, String company, int stressq, int fireq) {
        this.legs = legs;
        this.material = material;
        this.company = company;
        this.stressq = stressq;
        this.fireq = fireq;
    }

    public void stresstest() {
        if (stressq > 800) {
            System.out.println("stress test passed");
        } else {
            System.out.println("fail");
        }
    }

    public void firetest() {
        if (fireq > 900) {
            System.out.println("fire test passed");
        } else {
            System.out.println("fail");
        }
    }
}
public class Furnitureworld {
        public static void main(String[] args) {
            Chair c1 = new Chair(4, "kashmir wood", "rolex", 800, 700);
            Chair c2 = new Chair(4, "english wood", "starbucks", 300, 100);
            //Chair c3 = new Chair(4, "indian wood", "cassandra", 900, 1700);
            Table t1 = new Table(6, "coptic wood", "reliance", 1000, 1200);
            Table t2 = new Table(4, "african wood", "bambooz", 400, 1200);
            //Table t3 = new Table(8, "europa wood", "woodworks", 1000, 1200);
            c1.firetest();
            c1.stresstest();
            c2.firetest();
            c2.firetest();
            t1.firetest();
            t1.stresstest();
            t2.firetest();
            t2.stresstest();


        }

}

