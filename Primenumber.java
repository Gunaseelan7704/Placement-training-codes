package practice;

import java.util.Scanner;

public class Primenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean ans = primecheck(n);
        System.out.println(ans);
    }

     static boolean primecheck(int n) {
        if(n <= 1)
        {
            return false;
        }
       int i = 2;
            while(i <= n/2)
            {
                if(n % i == 0)
                {
                    return false;
                }
                i++;
            }
        return i > n/2;
    }

}
