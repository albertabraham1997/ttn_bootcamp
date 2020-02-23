

class User{
    String name;
    int roll_no=0;
    String course;
    public User(String name,int roll_no){
        this.name=name;
        this.roll_no=roll_no;

    }
}
class Student extends User implements libraryfunctions{

    String course;
    int[] issue_book_id=new int[5];
    String[] booksonissue=new String[5];
    static int k=0;
    int[] issue_mag_id=new int[5];
    static int l=0;
    int[] return_book_id;
    static int t=0;
    int[] return_mag_id;
    static int n=0;

    public Student(String name,int roll_no,String course){
        super(name,roll_no);
        this.course=course;
    }
    public void issuebook(Books b){

        issue_book_id[k]=b.id;
        booksonissue[k]=b.name;
        k=k+1;
        //issue_mag_id[l]=m.id;
        //l=l+1;
    }
    public void issuemag(Magazines m){
        issue_mag_id[l]=m.id;
        l=l+1;

    }
    public void returnbook(Books b){

        return_book_id[k]=b.id;
        t=t+1;
        //return_mag_id[l]=m.id;
        //n=n+1;
    }
    public void returnmag(Magazines m){
        return_mag_id[l]=m.id;
        n=n+1;

    }
    public void booksonissueprint(String[] yz){
        for (int o=0;o<yz.length;o++) {
            System.out.println(yz[o]);
        }
    }
    public void showstudentinfo(Student st){
        System.out.println("roll no--->"+st.roll_no+"\n"+"name--->"+st.name+"\n"+"course--->"+st.course);
        System.out.println("books issued for above student is-->");
        //this.booksonissueprint(booksonissue)
    }

}
class Books{
    String name;
    int id;
    String author;
    public Books(String name,int id,String author){
        this.name=name;
        this.id=id;
        this.author=author;
    }

}
class Magazines extends Books{
    String season;
    String genre;
    public Magazines(String season,String genre,String name,int id,String author){
        super(name, id, author);
        this.genre=genre;
        this.season=season;
    }

}
class Teacher extends User implements libraryfunctions{
        String department;
        int[] issue_book_id;
        static int k=0;
        int[] issue_mag_id;
        static int l=0;
        int[] return_book_id;
        static int t=0;
        int[] return_mag_id;
        static int n=0;
    public Teacher(String name,int roll_no,String department){
        super(name, roll_no);
        this.department=department;
    }
    public void issuebook(Books b){

        issue_book_id[k]=b.id;
        k=k+1;
        //issue_mag_id[l]=m.id;
        //l=l+1;
    }
    public void issuemag(Magazines m){
        issue_mag_id[l]=m.id;
        l=l+1;
    }
    public void returnbook(Books b){

        return_book_id[k]=b.id;
        t=t+1;
        //return_mag_id[l]=m.id;
        //n=n+1;
    }


    @Override
    public void returnmag(Magazines m) {
        return_mag_id[l]=m.id;
        n=n+1;

    }
}
interface libraryfunctions{
    void issuebook(Books b);
    void issuemag(Magazines m);
    void returnbook(Books b);
    void returnmag(Magazines m);

}
public class library {
    public static void main(String[] args) {
        Student std1=new Student("albert",123,"btech");
        Student std2=new Student("ankit",256,"bba");
        Student std3=new Student("sam",342,"mca");
        Books b1=new Books("java",11,"mat patterson");
        Books b2=new Books("python",15,"james clark");
        Magazines m1=new Magazines("summer","health","Olympia",55,"chris brown");
        Magazines m2=new Magazines("spring","beauty","femina",68,"martin mcgumery");
        std1.issuebook(b1);
        std1.issuemag(m1);
        std1.issuebook(b2);
        std2.issuemag(m2);
        std1.showstudentinfo(std1);
        std1.booksonissueprint(std1.booksonissue);
        std2.showstudentinfo(std2);
        std2.booksonissueprint(std2.booksonissue);


    }
}
