package tuan3;

import java.util.Arrays;
import java.util.Scanner;

public class Bai3Lab3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử của mảng : ");
        int n = sc.nextInt();
        int[] mang = new int[n];
        for (int i = 0; i < n; i++)
            mang[i] = sc.nextInt();
        Arrays.sort(mang);
        System.out.print("Sắp xếp: ");
        xuatMang(mang);
        timMin(mang);
        TBCCacPtuChiaHetCho3(mang);
    }

    public static void xuatMang(int a[]) {
        for (int i : a)
            System.out.print(i + " ");
    }

    public static void timMin(int a[]) {
        int min = a[0];
        for (int i = 1; i < a.length; i++)
            if (a[i] <= min)
                min = a[i];
        System.out.println("\nGiá trị nhỏ nhất là: " + min);
    }

    public static void TBCCacPtuChiaHetCho3(int a[]) {
        int count = 0, sum = 0;
        for (int i : a) {
            if (i % 3 == 0) {
                sum += i;
                count++;
            }
        }
        System.out.println("Trung bình cộng các số chia hết cho 3: " + (float) sum / count);
    }
}
