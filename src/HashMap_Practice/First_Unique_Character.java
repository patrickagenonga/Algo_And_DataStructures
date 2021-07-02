package HashMap_Practice;

import java.util.HashMap;
import java.util.Map;

public class First_Unique_Character {
    public static void main(String[] args) {

        String str1 = "abcabd"; // return 2
        String str2 = "thedailybyte"; // return 1
        String str3 = "developer"; // return 0
        String str4 = "aabbccdd"; // return -1;
        String str5 = ""; // return -1
        String str6 = null; // return -1

        System.out.println(first_Unique_Character(str1));
        System.out.println(first_Unique_Character(str2));
        System.out.println(first_Unique_Character(str3));
        System.out.println(first_Unique_Character(str4));
        System.out.println(first_Unique_Character(str5));
        System.out.println(first_Unique_Character(str6));

    }

    public static int first_Unique_Character(String str){
        if(str == null || str.length() == 0){
            return -1;
        }

        Map<Character, Integer> map = new HashMap<>();

        for(char c : str.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for(int i = 0; i < str.length(); i++){
            if(map.get(str.charAt(i)) == 1){
                return i;
            }
        }
        return -1;
    }
}
