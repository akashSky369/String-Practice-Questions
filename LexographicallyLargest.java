package LeetCode;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class LexographicallyLargest {

    //Given Array Of Strings Return A String To Find The Lexographically Largest String with The Highest Count

    public static String GreatestString(String [] arr, int n){

        //Ordered Map
        Map<String,Integer> map = new TreeMap<>();


        //Adding Frequency Of Every String In Map
        for (String c: arr){
            map.put(c, map.getOrDefault(c,0)+1);
        }

        //finding max value in map
        int maxVal = Collections.max(map.values());

        String res = "";

        //Traversing Map Using Entry Set
        for (Map.Entry<String,Integer> m:map.entrySet()){

            //Searching Lexographically the largest String
            if (m.getValue()==maxVal){
                res= m.getKey();
            }
        }

        return res;

    }




    public static void main(String[] args) {

    }
}
