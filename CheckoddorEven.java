package practice;

import java.util.Scanner;

public class CheckoddorEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n % 2 == 0)
        {
            System.out.println("it is even");
        }
        else
        {
            System.out.println("it is odd");
        }
    }
}
