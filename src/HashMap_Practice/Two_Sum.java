package HashMap_Practice;

import java.util.HashSet;

public class Two_Sum {

    public static void main(String[] args) {

        int[] arr1 = {1, 3, 8, 2};
        int[] arr2 = {3, 9, 13, 7};
        int[] arr3 = {4, 2, 6, 5, 2};

        System.out.println(two_Sum(arr1, 10));
        System.out.println(two_Sum(arr1, 8));
        System.out.println(two_Sum(arr1, 4));
    }

    public static boolean two_Sum(int[] arr, int target){
        if(arr == null || arr.length == 0){
            return false;
        }

        HashSet<Integer> set = new HashSet<>();

        for(int i : arr){

            int complement = target - i;

            if(set.contains(complement)){
                return true;
            }

            set.add(i);
        }
        return false;
    }
}
