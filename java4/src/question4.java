import java.util.*;
import java.lang.*;

public class question4 {

    // function to sort hashmap by values
    public static HashMap<String, Integer> sortByValue(HashMap<String, Integer> hm)
    {
        // Create a list from elements of HashMap
        List<Map.Entry<String, Integer> > list =
                new LinkedList<Map.Entry<String, Integer> >(hm.entrySet());

        // Sort the list
        Collections.sort(list, new Comparator<Map.Entry<String, Integer> >() {
            public int compare(Map.Entry<String, Integer> o1,
                               Map.Entry<String, Integer> o2)
            {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });

        // put data from sorted list to hashmap
        HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>();
        for (Map.Entry<String, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }

    // Driver Code
    public static void main(String[] args)
    {

        HashMap<String, Integer> hm = new HashMap<String, Integer>();

        // enter data into hashmap
        hm.put("Albert", 23);
        hm.put("Neraj", 24);
        hm.put("Shubham", 22);
        hm.put("Nishtha", 22);
        hm.put("Smriti", 25);
        hm.put("Abha", 24);
        Map<String, Integer> hm1 = sortByValue(hm);

        // print the sorted hashmap
        for (Map.Entry<String, Integer> en : hm1.entrySet()) {
            System.out.println("Key = " + en.getKey() +
                    ", Value = " + en.getValue());
        }
    }
}