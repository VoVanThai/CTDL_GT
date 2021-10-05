package com.thaivv2004110036.tuan2;

import java.util.Scanner;

public class Bai1Lab2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập hệ số a, b: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a == 0) {
            if (b == 0)
                System.out.println("Phương trình có vô số nghiệm");
            else
                System.out.println("Phương trình vô nghiệm");
        } else
            System.out.println("Phương trình có nghiệm là: " + (float) -b / a);

    }
}
