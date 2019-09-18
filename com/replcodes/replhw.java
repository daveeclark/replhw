package com.replcodes;

import java.util.Arrays;

public class replhw {

    public static void main(String[] args) {
        getSum();
        getAverage();
        System.out.println(getIndexByElement(new String[]{"a", "b","c","d","e",},"e"));
        System.out.println(containNames(new String []{"a","b","c","d","e"}, "c"));
        System.out.println(extractAllEvenNumbers(new int[]{1,2,3,4,5,6,7,8,9}));
        System.out.println(Arrays.toString(swap(new String[]{"a", "b", "c", "d", "e"})));
    }

    public static void getSum() {
        int[] yerr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        for (int num : yerr) {
            sum += num;
        }
        System.out.println(sum);
    }

    public static void getAverage() {
        double[] yeoo = {55, 28, 40, 16, 22, 36};
        double total = 0;
        for (int a = 0; a < yeoo.length; a++) {
            total += yeoo[a];
        }
        double average = total / yeoo.length;
        System.out.println(average);
    }

    public static boolean containNames(String[] name, String element) {
        String[] names = {"a", "b", "c", "d", "e"};

        for (String s : names) {
            if (s.equals(element)) ;
        }
        return true;
    }

    public static int getIndexByElement(String[] name, String element) {
        int index = -1;
        for (int s = 0; s < name.length; s++)
            if (name[s].equalsIgnoreCase(element)) {
                index = s;

            }
        return index;
    }

    public static String extractAllEvenNumbers(int [] numbers) {
        String ans = "";

        for (int o = 0; o < numbers.length; o++){
            if(numbers[o]%2==0) {
                ans += numbers[o] + ", ";
            }
        }
        ans = ans.substring(0, ans.length()-2);
        return ans;
    }

    public static String[] swap(String[] stringArray){

        int start = 0;
        int end = stringArray.length-1;

        String temp;

        while (start < end)
        {
            temp = stringArray[start];
            stringArray[start] = stringArray[end];
            stringArray[end] = temp;
            start++;
            end--;
        }

        return stringArray;
    }

}
