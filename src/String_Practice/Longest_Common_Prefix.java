package String_Practice;

public class Longest_Common_Prefix {
    /*
    ["colorado", "color", "cold"], return "col"
    ["a", "b", "c"], return ""
    ["spot", "spotty", "spotted"], return "spot"

     */

    public static void main(String[] args) {

        String[] arr1 = {"colorado", "color", "cold"};
        String[] arr2 = {"a", "b", "c"};
        String[] arr3 = {"spot", "spotty", "spotted"};

        System.out.println(longestCommonPrefix(arr1));
        System.out.println(longestCommonPrefix(arr2));
        System.out.println(longestCommonPrefix(arr3));

    }

    public static String longestCommonPrefix(String[] arr){

        StringBuilder longestPrefix = new StringBuilder();
        int index = 0;

        if(arr == null || arr.length == 0){
            return "";
        }

        for(char c : arr[0].toCharArray()){
            for(int i = 1; i < arr.length; i++){
                String s = arr[i];

                if(index >= s.length() || c != s.charAt(index)){
                    return longestPrefix.toString();
                }
            }
            longestPrefix.append(c);
            index++;
        }
        return longestPrefix.toString();
    }
}
