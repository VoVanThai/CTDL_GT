package com.thaivv2004110036.tuan1;

import java.util.Scanner;

public class Bai2Lab1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chiều dài: ");
        int dai = sc.nextInt();
        System.out.println("Nhập chiều rộng: ");
        int rong = sc.nextInt();
        System.out.println("Chu vi hình chữ nhật là: " + (dai + rong) * 2);
        System.out.println("Diện tích hình chữ nhật là: " + dai * rong);
        System.out.println("Cạnh nhỏ nhất: " + Math.min(dai, rong));
    }
}
