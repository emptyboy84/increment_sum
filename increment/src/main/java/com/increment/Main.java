package com.increment;


public class Main {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        scanner.close();
        int result = sum_incr(n);
        System.out.println("Sum increment: " + result);
    }

    private static int sum_incr(int n) {
        int s=0;
        for (int i = 0; i < n+1; i++) {
            s += n;
        }
        
        return s;
    }
}

/*class class Increment {
    public int sum_incr(int n) {
       
    }
}*/