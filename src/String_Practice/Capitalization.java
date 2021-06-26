package String_Practice;

public class Capitalization {
    public static void main(String[] args) {

        String str1 = "USA"; // return true
        String str2 = "Calvin"; // return true
        String str3 = "compUter"; // return false
        String str4 = "coding"; // return true

        System.out.println(capitalization(str1));
        System.out.println(capitalization(str2));
        System.out.println(capitalization(str3));
        System.out.println(capitalization(str4));
    }

    public static boolean capitalization(String str){
        int count = 0;

        for(int i = 0; i < str.length(); i++){
            if(Character.isUpperCase(str.charAt(i))){
                count++;
            }
        }
        return count == str.length() || count == 0 || count == 1 && Character.isUpperCase(str.charAt(0));
    }
/*
    public static boolean capitalization(String str){
        if(str == null || str.length() == 0){
            return false;
        }

        int i = 0;
        boolean ans;

        while(true){

            if (Character.isUpperCase(str.charAt(i)) && islowerCase(str.substring(i + 1))){
                ans = true;
                break;
            }else if (isupperCase(str)){
                ans = true;
                break;
            }else if (islowerCase(str)){
                ans = true;
                break;
            }else{
                ans = false;
                break;
            }
        }
        return ans;
    }

    public static boolean islowerCase(String str){
        for(int i = 0; i < str.length(); i++){
            if(Character.isUpperCase(str.charAt(i))){
                return false;
            }
        }
        return true;
    }

    public static boolean isupperCase(String str){
        for(int i = 0; i < str.length(); i++){
            if(Character.isLowerCase(str.charAt(i))){
                return false;
            }
        }
        return true;
    }
 */
}
