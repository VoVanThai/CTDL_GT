package com.thaivv2004110036.tuan1;

import java.util.Scanner;

public class Bai4Lab1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập a, b, c");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        double delta = b * b - 4 * a * c;
        System.out.println("Delta: " + delta);
        System.out.println("Căn Delta: " + Math.sqrt(delta));
    }
}
