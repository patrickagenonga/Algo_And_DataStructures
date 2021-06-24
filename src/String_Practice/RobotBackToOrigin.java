package String_Practice;

public class RobotBackToOrigin {
    public static void main(String[] args) {
        String str1 = "LR";
        String str2 = "URURD";
        String str3 = "RUULLDRD";

        System.out.println(isRobotBackToOrigin(str1));
        System.out.println(isRobotBackToOrigin(str2));
        System.out.println(isRobotBackToOrigin(str3));
    }

    public static boolean isRobotBackToOrigin(String str){
        int LR = 0;
        int UD = 0;

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == 'R'){
                LR++;
            }
            if(str.charAt(i) == 'L'){
                LR--;
            }
            if(str.charAt(i) == 'U'){
                UD++;
            }
            if(str.charAt(i) == 'D'){
                UD--;
            }
        }
        return LR == 0 && UD == 0;
    }
}
