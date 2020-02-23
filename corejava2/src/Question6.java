public class Question6 {
    public static void main(String[] args) {
        nothing object=new nothing();
        int first=object.a;
        int second=object.b;
        try{
            int c=first/second;
        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic Exception occurs");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBounds Exception occurs");
        }
        catch(Exception e)
        {
            System.out.println("Parent Exception occurs");
        }
        finally {
            System.out.println("this will be executed always");
        }
    }
}
class nothing{
    public int a=120;
    public int b=0;

}
