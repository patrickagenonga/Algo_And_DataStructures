package HashMap_Practice;

import java.util.HashSet;
import java.util.Set;

public class Stone_And_Jewels {
    public static void main(String[] args) {

        String str1 = "abc", str11 = "ac";
        String str2 = "Af", str22 = "AaaddfFf";
        String str3 = "AYOPD", str33 = "ayopd";

        System.out.println(stone_And_Jewels(str1, str11));
        System.out.println(stone_And_Jewels(str2, str22));
        System.out.println(stone_And_Jewels(str3, str33));

    }

    public static int stone_And_Jewels(String jewels, String stones){
        Set<Character> set = new HashSet<>();

        for(char c : jewels.toCharArray()){
            set.add(c);
        }

        int result = 0;

        for(char c : stones.toCharArray()){
            if(set.contains(c)){
                result++;
            }
        }
        return result;
    }
}
