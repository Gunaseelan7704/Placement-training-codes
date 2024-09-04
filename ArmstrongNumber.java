package practice;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int t = n;
        while(n > 0) {
            int rem = n % 10;
            sum += (int)Math.pow(rem,(int)Math.log10(t) + 1);
            n /= 10;
        }
        if(sum == t){
            System.out.println("Armstrong");
        }else{
            System.out.println("Not Armstrong");
        }
    }
}
