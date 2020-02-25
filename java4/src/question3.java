import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class question3 {
    static void characterCount(String str)
    {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        char myCharArray[] = str.toCharArray();
        for(int i=0;i<myCharArray.length;i++){
            if(!hashMap.containsKey(myCharArray[i])){
                hashMap.put(myCharArray[i],1);
            }
            else{
                int temp=hashMap.get(myCharArray[i]);
                temp=temp+1;
                hashMap.put(myCharArray[i],temp);
            }
            //System.out.println(hashMap);
            //for (Map.Entry<Character,Integer> entry : hashMap.entrySet()) {
             //   System.out.println(entry.getKey()+" : "+entry.getValue());
            //}

        }
        //System.out.println(hashMap);
        for (Map.Entry<Character,Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey()+" : "+entry.getValue());

        }


    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String myString = sc.nextLine();;
        characterCount(myString);
    }
}