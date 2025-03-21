import java.util.*;

public class Fibonacci
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter N for Fibonacci:");
        int n = input.nextInt();
        input.close();
        int prev = 1 , current = 1 , next = 0;
        if(n == 1 || n == 2)
        {
            System.out.println(1);
            return;
        }
        for(int i = 3 ; i <= n ; i++)
        {
            next = prev + current;
            prev = current;
            current = next;
        }
        System.out.println(next);
    }
}