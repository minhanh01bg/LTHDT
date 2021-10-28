package minhanh;

import java.util.Scanner;

public class MaTrix {
    private int[][] a;
    private int n, m;
    Scanner sc = new Scanner(System.in);

    public MaTrix() {
        System.out.print("Nhap n:");
        this.n = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap m:");
        this.m = Integer.parseInt(sc.nextLine());
        a = new int[n][m];
    }

    public MaTrix(int n, int m) {
        this.n = n;
        this.m = m;
        this.a = new int[n][m];
    }

    public int[][] getA() {
        return a;
    }

    public void setA(int[][] a) {
        this.a = a;
    }

    public int getN() {
        return n;
    }

    public void setN(int n, int m) {
        this.n = n;
        this.m = m;
    }

    public void nhap() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("[" + i + "]" + "[" + j + "] = ");
                a[i][j] = Integer.parseInt(sc.nextLine());
            }
        }
        System.out.println("Ma Tran vua nhap: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void hienthi() {
        System.out.println("Ma Tran: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void maTranChuyenVi() {
        System.out.println("Ma tran chuyen vi:");
        int[][] t = new int[m][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                t[j][i] = a[i][j];
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(t[i][j] + " ");
            }
            System.out.println();
        }

    }

    public boolean isPrime(int n) {
        if (n <= 1)
            return false;
        if (n <= 3)
            return true;
        if (n % 2 == 0 || n % 3 == 0)
            return false;

        for (int i = 5; i * i <= n; i += 6)
            if (n % i == 0 || n % (i + 2) == 0)
                return false;
        return true;
    }

    public void hangNguyenTo() {
        long dem;
        boolean check = false;
        for (int i = 0; i < n; i++) {
            dem = 0;
            String tmp = "";
            for (int j = 0; j < m; j++) {
                if (isPrime(a[i][j])) {
                    dem++;
                    tmp += String.valueOf(a[i][j]) + " ";
                }
            }

            if (dem == m) {
                check = true;
                System.out.println("Hang " + i + ": " + tmp);
            }
        }
        if (check == false) {
            System.out.println("khong co hang nguyen to");
        }
    }

}