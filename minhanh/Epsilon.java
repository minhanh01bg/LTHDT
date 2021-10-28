package minhanh;

import java.util.Scanner;

public class Epsilon {
    private double x, cos, epsilon;
    private long n;
    private Scanner sc = new Scanner(System.in);
    public Epsilon(){

    }
    public void nhap() {
        System.out.print("Nhap goc: ");
        this.x = Double.parseDouble(sc.nextLine());
        System.out.println("x = " + x);
        System.out.print("Nhap epsilon: ");
        epsilon = Double.parseDouble(sc.nextLine());
        System.out.println("epsilon = " + epsilon);
    }

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
