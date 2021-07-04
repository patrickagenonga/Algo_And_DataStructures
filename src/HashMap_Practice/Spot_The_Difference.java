package HashMap_Practice;

import java.util.HashSet;
import java.util.Set;

public class Spot_The_Difference {
    public static void main(String[] args) {
        String s1 = "foobar", t1 = "barfoot"; // return 't'
        String s2 = "ide", t2 = "idea"; // return 'a'
        String s3 = "coding", t3 = "ingcod"; // return ''

        System.out.println((spot_The_Difference(s1, t1)));
        System.out.println((spot_The_Difference(s2, t2)));
        System.out.println((spot_The_Difference(s3, t3)));

    }

    public static Character spot_The_Difference(String str1, String str2){

        if(str1 == null || str1.length() == 0){
            return ' ';
        }
        Set<Character> set = new HashSet<>();

        for(char chr : str1.toCharArray()){
            set.add(chr);
        }

        for(char chr : str2.toCharArray()){
            if(!set.contains(chr)){
                return chr;
            }
        }

        return ' ';
    }
}
