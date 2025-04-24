package javabasics;

import java.util.Arrays;

public class Fibonacci{
    public int[] fibonacci(int n){
        int[] arr = new int[n];
        arr[0] = 0;
        arr[1] = 1;
        for(int i = 2; i < arr.length; i++){
            arr[i] = arr[i-2] + arr[i-1];
        }
        return arr;
    }

    public static void main(String[] args) {
        Fibonacci fib = new Fibonacci();
        System.out.println(Arrays.toString(fib.fibonacci(5)));
    }
}