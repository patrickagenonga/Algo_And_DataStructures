package String_Practice;

public class Add_Binary {
    public static void main(String[] args) {

        String str1 = "100";
        String str11 = "1"; // return "101"
        String str2 = "11";
        String str22 = "1"; // return "100"
        String str3 = "1";
        String str33 = "0"; // return  "1"

        System.out.println(add_Binary(str1, str11));
        System.out.println(add_Binary(str2, str22));
        System.out.println(add_Binary(str3, str33));

    }

    public static String add_Binary(String binary1, String binary2){
        StringBuilder sb = new StringBuilder();
        int index1 = binary1.length() - 1;
        int index2 = binary2.length() - 1;
        int curry = 0;

        while(index1 >= 0 || index2 >= 0){
            int sum = curry;

            if(index1 >= 0){
                sum += binary1.charAt(index1--) - '0';
            }
            if(index2 >= 0){
                sum += binary2.charAt(index2--) - '0';
            }
            sb.insert(0,sum % 2);
            curry = sum / 2;
        }
        if(curry > 0){
            sb.insert(0,1);
        }
        return sb.toString();
    }
}
