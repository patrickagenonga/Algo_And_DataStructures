package String_Practice;

public class Reverse_String {

    public static void main(String[] args) {
        String str1 = "Cat"; // return taC
        String str2 = "The Daily Byte"; // return \"etyB yliaD ehT
        String str3 = "civic";  // return civic
        String str4 = null;
        String str5 = " ";

        System.out.println(reverse_String(str1));
        System.out.println(reverse_String(str2));
        System.out.println(reverse_String(str3));
        System.out.println(reverse_String(str4));
        System.out.println(reverse_String(str5));
    }

    public static String reverse_String(String str){  // Better solution than the ones below
        if(str == null || str.length() == 0){
            System.out.println("Nothing to reverse");
            return "";
        }
        char[] ch = new char[str.length()];
        int j = 0;

        for(int i = str.length() - 1; i >= 0; i--){
            ch[j++] = str.charAt(i);
        }
        return new String(ch);
    }

//    public static String reverse_String(String str){  //========== Good but using string affects performance since string is immutable.
//        if(str == null || str.length() == 0){
//            System.out.println("Nothing to reverse");
//            return "";
//        }
//        String reversed = "";
//
//        for(int i = str.length() - 1; i >= 0; i--){
//            reversed += str.charAt(i);
//        }
//        return reversed;
//    }

/*
    public static String reverse_String(String str){
        if(str == null || str.length() == 0){
            return null;
        }
        String[] strs = str.split(" ");
        StringBuilder sb = new StringBuilder();

        for(int i = strs.length - 1; i >= 0; i--){
            sb.append(strs[i]);
            sb.append(" ");
        }
        String[] s = sb.toString().trim().split(" ");
        StringBuilder sb1 = new StringBuilder();

        for(String st : s){
            sb1.append(reverse(st));
            sb1.append(" ");
        }
        return sb1.toString().trim();
    }

    public static String reverse(String str){
        char[] ch = str.toCharArray();
        int i = 0;
        int j = str.length() - 1;

        while(i < j){
            char temp = ch[j];
            ch[j] = ch[i];
            ch[i] = temp;
            i++;
            j--;
        }
        return new String(ch);
    }

 */
}
