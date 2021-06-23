package String_Practice;

public class Palindrome {

    public static void main(String[] args) {
        String str1 = "level"; // return true
        String str2 = "algorithm"; // return false
        String str3 = "A man, a plan, a canal: Panama."; // return true
        String str4 = null;
        String str5 = " ";

        System.out.println(isPalindrome(str1));
        System.out.println(isPalindrome(str2));
        System.out.println(isPalindrome(str3));
        System.out.println(isPalindrome(str4));
        System.out.println(isPalindrome(str5));
    }

    public static boolean isPalindrome(String str){
        if(str == null || str.length() == 0){
            return false;
        }
        int i = 0;
        int j = str.length() - 1;

        while(i < j){
            while(i < j && !Character.isLetterOrDigit(str.charAt(i))){
                i++;
            }

            while(i < j && !Character.isLetterOrDigit(str.charAt(j))){
                j--;
            }

            if(i < j && Character.toLowerCase(str.charAt(i)) != Character.toLowerCase(str.charAt(j))){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
