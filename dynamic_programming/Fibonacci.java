import java.util.*;

public class Fibonacci{
    public int fibonacci(int n){
        if(n <= 1) return 1;

        int dp[] = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i = 2 ; i<=n ; i++){
            dp[i] = dp[i-2] + dp[i-1];
        }
        return dp[n];
    }


    public static void main(String[] args){
        Fibonacci fib = new Fibonacci();
        System.out.println(fib.fibonacci(4));
    } 
}