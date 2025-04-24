package javabasics;

public class FactorialNum {
    public int factorialNum(int n){
        if(n==0){
            return 1;
        }

        for(int i = n-1; i>0; i--){
            n*=i;
        }
        return n;
    }

    public static void main(String[] args) {
        FactorialNum obj = new FactorialNum();
        System.out.println(obj.factorialNum(5));
    }
    
}
