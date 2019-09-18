package com.replcodes;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //System.out.println(multiply(2.0, 4.0));
//        System.out.println(divide(25, 5));
//        System.out.println(subtract(99, 49));
//        System.out.println(add(99, 1));
//        System.out.println(remainder(21, 2));
//        System.out.println(CalculateFinalPrice(25, 69.99));
//        sqrt(100);
//        tenToOne(10);
//        squareRootArray(new int[]{9, 25, 49});
//        getSum();
//        getAverage();
//        threeP(1, 2, 3);

    }



    //creating a method
    public static double multiply(double x, double y) {
        return x * y;

    }

    public static int divide(int a, int b) {
        return a / b;
    }

    public static int subtract(int c, int d) {
        return c - d;
    }

    public static int add(int e, int f) {
        return e + f;
    }

    public static int remainder(int g, int h) {
        return g % h;
    }

    public static double CalculateFinalPrice(double discountAmount, double productPrice) {
        return productPrice - ((discountAmount / 100) * productPrice);
    }

    public static void CalculateArea(double radius) {
        System.out.println(Math.PI * radius * radius);
    }

    public static void sqrt(int s) {
        System.out.println(Math.sqrt(s));
    }

    public static void tenToOne(int number) {
        for (int t = number; t >= 0; t--)
            System.out.println(t * t);
    }

    public static void squareRootArray(int[] sqrtArray) {
        for (int anything : sqrtArray)
            System.out.println(Math.sqrt(anything));
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

    public static void threeP(int a, int b, int c) {
        System.out.println(a * b + c);
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
