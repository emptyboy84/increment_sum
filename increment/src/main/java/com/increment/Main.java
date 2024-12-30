package com.increment;


public class Main {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        scanner.close();
        int[] arr = new int[n];
        int result = sum_incr(arr);
    
        
        System.out.println("1 from " + java.util.Arrays.toString(arr) + " to Sum increment: " + result);
    }

    public static int sum_incr(int[] arr) {
        int incr = 0;   
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            incr += arr[i];
        }
        return incr;
    }
}
