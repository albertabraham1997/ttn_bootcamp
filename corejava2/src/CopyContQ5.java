public class CopyContQ5{
    public static void main(String[] args) {
        CopyCont c1=new CopyCont(123,"albert","btech");
        CopyCont c2=new CopyCont(c1);
        System.out.println(c1.name+c1.roll_no+c1.course);
        System.out.println(c2.name+c2.roll_no+c2.course);
    }

}
class CopyCont {
    public int roll_no;
    public String name;
    public String course;
    CopyCont(int roll_no,String name,String course){
        this.roll_no=roll_no;
        this.name=name;
        this.course=course;
    }
    CopyCont(CopyCont object){
        this.roll_no=object.roll_no;
        this.name=object.name;
        this.course=object.course;
    }
}
