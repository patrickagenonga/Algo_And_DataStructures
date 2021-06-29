package String_Practice;

public class Valid_Palindrome_With_Removal {

    public static void main(String[] args) {
        String str1 = "abcba";
        String str2 = "foobof";
        String str3 = "abccab";

        System.out.println(valid_Palindrome_With_Removal(str1));
        System.out.println(valid_Palindrome_With_Removal(str2));
        System.out.println(valid_Palindrome_With_Removal(str3));
    }

    public static boolean valid_Palindrome_With_Removal(String str){
        int i = 0;
        int j = str.length() - 1;

        while(i < j){
            if(str.charAt(i) != str.charAt(j)){
                return isPalidrome(str, i + 1, j) || isPalidrome(str, i, j - 1);
            }
            i++;
            j--;
        }
        return true;
    }

    public static boolean isPalidrome(String str, int i, int j){

        while(i < j){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
