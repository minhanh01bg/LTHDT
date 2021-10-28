package bai8;

import java.util.Scanner;

public class BaiSau {
    private double x, sin, cos, pi, epsilon;
    private long n;
    private Scanner sc = new Scanner(System.in);

    public BaiSau() {

    }

    public void nhap() {
        // 5
        System.out.print("Nhap goc: ");
        this.x = Double.parseDouble(sc.nextLine());
        // 0.001
        System.out.print("Nhap epsilon: ");
        epsilon = Double.parseDouble(sc.nextLine());
    }

    // tinh PI
    public double Fpi(long n) {
        int a;
        if (n % 2 == 0)
            a = 1;
        else
            a = -1;
        return a * 1.0 / (2 * n + 1);
    }

    public void Pi() {
        pi = 0;
        n = 0;
        while (Math.abs(Fpi(n)) > epsilon) {
            pi += Fpi(n);
            n++;
        }
        pi *= 4;
        System.out.printf("Tinh Pi: %.4f\n", pi);
    }

    // tinh sin(x)
    public double Fsin(long n) {
        int a;
        if (n % 2 == 0)
            a = 1;
        else
            a = -1;
        double temp = 1;
        for (int i = 1; i <= 2 * n + 1; i++)
            temp = temp * x / i;
        return a * temp;
    }

    public void Sin() {
        sin = 0;
        n = 0;
        while (Math.abs(Fsin(n)) > epsilon) {
            sin += Fsin(n);
            n++;
        }
        System.out.printf("Tinh sin(x): %.4f\n", sin);
    }

    // tinh cos(x)
    public double Fcos(long n) {
        int a;
        if (n % 2 == 0)
            a = 1;
        else
            a = -1;
        double temp = 1;
        for (int i = 1; i <= 2 * n; i++)
            temp = temp * x / i;
        return a * temp;
    }

    public void Cos() {
        cos = 0;
        n = 0;
        while (Math.abs(Fcos(n)) > epsilon) {
            cos += Fcos(n);
            n++;
        }
        System.out.printf("Tinh cos(x): %.4f\n", cos);
    }
}