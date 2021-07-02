package HashMap_Practice;

public class Anagram {
    public static void main(String[] args) {

        String s1 = "cat", t1 = "tac"; // return true
        String s2 = "listen", t2 = "silent"; // return true
        String s3 = "program", t3 = "function"; // return false

        System.out.println(isAnagram(s1, t1));
        System.out.println(isAnagram(s2, t2));
        System.out.println(isAnagram(s3, t3));
    }

    public static boolean isAnagram(String str1, String str2){
        if(str1 == null || str1.length() == 0){
            return false;
        }

        if(str2 == null || str2.length() == 0){
            return false;
        }

        if(str1.length() != str2.length()){
            return false;
        }

        int[] temp = new int[256];

        for(int i = 0; i < str1.length(); i++){

            temp[str1.charAt(i) - 'a']++;
            temp[str2.charAt(i) - 'a']--;

        }

        for(int i : temp){

            if(i != 0)
                return false;
        }

        return true;
    }
}
