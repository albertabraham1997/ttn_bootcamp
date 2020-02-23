import java.util.HashMap;
import java.util.Scanner;

public class question3 {
    static void characterCount(String str)
    {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        char myCharArray[] = str.toCharArray();

        for (char eachCharacter : myCharArray)
        {
            if(hashMap.containsKey(eachCharacter))
            {
                hashMap.put(eachCharacter, hashMap.get(eachCharacter)+1);
            }
            else
            {
                hashMap.put(eachCharacter, 1);
            }
        }

        for (HashMap.Entry entry: hashMap.entrySet())
        {
            System.out.println("Occurences of each character in string is: "+entry.getKey()+" : "+entry.getValue());
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String myString = sc.nextLine();;
        characterCount(myString);
    }
}