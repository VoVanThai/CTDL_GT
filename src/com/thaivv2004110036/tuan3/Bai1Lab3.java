package tuan3;

import java.util.Scanner;

public class Bai1Lab3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào số n : ");
        int n = sc.nextInt();
        kiemTraSoNuyenTo(n);
    }

    public static void kiemTraSoNuyenTo(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                count++;
        }

        if (count > 2)
            System.out.println("Không phải là số nguyên tố");
        else
            System.out.println("Là số nguyên tố");

    }
}
