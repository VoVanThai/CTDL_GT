package com.thaivv2004110036.tuan1;

import java.util.Scanner;

public class Bai1Lab1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập họ và tên: ");
        String hoTen = sc.nextLine();
        System.out.println("Nhập điểm trung bình");
        double diemTB = sc.nextDouble();
        System.out.println("Họ và tên: " + hoTen);
        System.out.println("Điểm trung bình: " + diemTB);
    }
}
