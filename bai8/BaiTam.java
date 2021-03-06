package bai8;

import java.util.ArrayList;
import java.util.Scanner;

public class BaiTam {
    private int n;
    private double[] a;
    private Scanner sc = new Scanner(System.in);

    public BaiTam() {

    }

    public void nhap() {
        System.out.print("Nhap so phan tu: ");
        n = Integer.parseInt(sc.nextLine());
        a = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("a" + "[" + i + "]: ");
            a[i] = Double.parseDouble(sc.nextLine());
        }

        System.out.println("Day so thuc:");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    // Cac phan tu xuat hien 1 lan
    public void phanTu1Lan() {
        System.out.println("Cac phan tu xuat hien 1 lan:");
        ArrayList<Double> m = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (!m.contains(a[i]))
                m.add(a[i]);
        }
        for (int i = 0; i < m.size(); i++) {
            int dem = 0;
            for (int j = 0; j < n; j++) {
                if (a[j] == m.get(i))
                    dem++;
            }
            if (dem == 1)
                System.out.print(m.get(i) + " ");
        }
        System.out.println();
    }

    // So lan xuat hien cac phan tu
    public void soLanXuatHien() {
        System.out.println("So lan xuat hien cac phan tu:");
        ArrayList<Double> m = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (!m.contains(a[i]))
                m.add(a[i]);
        }
        for (int i = 0; i < m.size(); i++) {
            int dem = 0;
            for (int j = 0; j < n; j++) {
                if (a[j] == m.get(i))
                    dem++;
            }

            System.out.println(m.get(i) + " xuat hien " + dem + " lan");
        }
        System.out.println();
    }

    // Day so sau khi sap xep giam dan
    public void sapXepGiamGian() {
        System.out.println("Day so sau khi sap xep giam dan:");
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] < a[j]) {
                    double tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
        }
        
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
