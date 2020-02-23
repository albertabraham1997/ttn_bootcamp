
public class stringsort
{
    public static void main(String[] args)
    {
        String s = "czafbed";
        char[] a =s.toCharArray();
        char temp;
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length-i-1;j++) {
                if (a[j+1] < a[j]) {
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        String str=new String(a);
        System.out.println(str);
    }
}
