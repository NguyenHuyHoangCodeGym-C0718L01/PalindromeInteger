package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the number: ");
        int number = scanner.nextInt();

        if(isPalindrome(number)==true){
            System.out.println(number+" is Palindrome Integer!");
        }else{
            System.out.println(number+" is NOT Palidrome Integer!");
        }
    }

    public static int reverse(int number){
        String temp = Integer.toString(number);
        char[] array = temp.toCharArray();
        char[] reverseArray = new char[array.length];
        int j = 0;
        for(int i = array.length-1; i >= 0; i--){
            for(; j < reverseArray.length; ){
                reverseArray[j] = array[i];
                break;
            }
            j++;
        }
        String reverseTemp = "";
        for(int k = 0; k < reverseArray.length; k++){
            reverseTemp += String.valueOf(reverseArray[k]);
        }
        System.out.println("Reverse Number: "+Integer.parseInt(String.valueOf(reverseTemp)));
        return (Integer.parseInt(String.valueOf(reverseTemp)));
    }

    public static  boolean isPalindrome(int number){
        String temp = Integer.toString(number);
        char[] array = temp.toCharArray();
        if(number == reverse(number)){
            return true;
        }else{
            return false;
        }
    }
}
