package array;

import java.util.Scanner;

public class bilGenapGanjil {

    public static void hitung(int a) {
        if (a % 2 == 0) {
            System.out.println("Bilangan Kelompok Genap");
            System.out.println("==============");
        }
        if (a % 2 != 0) {
            System.out.println("Bilangan Kelompok Ganjil");
            System.out.println("==============");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("masukkan jumlah data: ");
        int length = input.nextInt();

        int data[] = new int[length];

        for (int i = 0; i < length; i++) {
            System.out.println("masukkan bilangan: ");
            int bil = input.nextInt();

            hitung(bil);

        }

    }
}
