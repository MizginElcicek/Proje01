package Kodluyoruz;

import java.util.Scanner;

public class recursive_desen {
    static int f(int n){
        System.out.print(n + " ");
        if (n <= 0){
            return n;
        }
        f(n-5);
        System.out.print(n + " ");
        return n;
    }

    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("N sayısı: ");
        int n = scan.nextInt();
        f(n);
    }
}


