package bai8;

import java.util.Scanner;

public class BaiMuoi {
    private int[][] a;
    private int n;
    private Scanner sc = new Scanner(System.in);

    public BaiMuoi() {
        System.out.println("Nhap so phan tu cua ma tran vuong: ");
        this.n = Integer.parseInt(sc.nextLine());
        a = new int[n][n];
    }

    public BaiMuoi(int n) {
        this.n = n;
        this.a = new int[n][n];
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

    public void setN(int n) {
        this.n = n;
    }

    // nhap ma tran
    public void nhap() {
        System.out.println("nhap ma tran: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("[" + i + "]" + "[" + j + "] = ");
                a[i][j] = Integer.parseInt(sc.nextLine());
            }
        }
        System.out.println("Ma Tran vua nhap: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    // hien thi ma tran
    public void hienthi() {
        // System.out.println("Ma Tran: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    // tong hai ma tran
    public BaiMuoi tong(int[][] b) {
        int[][] t = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                t[i][j] = a[i][j] + b[i][j];
            }
        }
        BaiMuoi m = new BaiMuoi(n);
        m.setA(t);
        System.out.println("tong hai ma tran: ");
        return m;
    }

    // tich ma tran
    public BaiMuoi tich(int[][] b) {
        int[][] t = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                t[i][j] = 0;
                for (int k = 0; k < n; k++) {
                    t[i][j] = t[i][j] + t[i][k] * t[k][j];
                }
            }
        }
        BaiMuoi m = new BaiMuoi(n);
        m.setA(t);
        System.out.println("tich hai ma tran: ");
        return m;
    }

    // chuyen ve ma tran chuyen vi
    public void maTranChuyenVi() {
        System.out.println("Ma tran chuyen vi:");
        int[][] t = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                t[i][j] = a[j][i];
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(t[i][j] + " ");
            }
            System.out.println();
        }

    }

    // tong duong ngang, doc, cheo lon nhat
    public void maxDuong() {
        long sum;
        long res = 0;
        String tmp = "";

        for (int i = 0; i < n; i++) {
            sum = 0;
            String x = "";
            for (int j = 0; j < n; j++) {
                sum += a[i][j];
                x += String.valueOf(a[i][j]) + " ";
            }
            if (sum > res) {
                res = sum;
                tmp = x;
            }
        }

        for (int j = 0; j < n; j++) {
            sum = 0;
            String x = "";
            for (int i = 0; i < n; i++) {
                sum += a[i][j];
                x += String.valueOf(a[i][j]) + " ";
            }
            if (sum > res) {
                res = sum;
                tmp = x;
            }
        }
        sum = 0;
        String x = "";
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    sum += a[i][j];
                    x += String.valueOf(a[i][j]) + " ";
                }
            }
        }
        if (res < sum) {
            res = sum;
            tmp = x;
        }

        System.out.println("Tong lon nhat: " + res);
        System.out.println(tmp);

    }

    // tong duong ngang, doc, cheo nho nhat
    public void minDuong() {
        long sum;
        long res = 1000000;
        String tmp = "";

        for (int i = 0; i < n; i++) {
            sum = 0;
            String x = "";
            for (int j = 0; j < n; j++) {
                sum += a[i][j];
                x += String.valueOf(a[i][j]) + " ";
            }
            if (sum < res) {
                res = sum;
                tmp = x;
            }
        }

        for (int j = 0; j < n; j++) {
            sum = 0;
            String x = "";
            for (int i = 0; i < n; i++) {
                sum += a[i][j];
                x += String.valueOf(a[i][j]) + " ";
            }
            if (sum < res) {
                res = sum;
                tmp = x;
            }
        }

        sum = 0;
        String x = "";
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    sum += a[i][j];
                    x += String.valueOf(a[i][j]) + " ";
                }
            }
        }
        if (res > sum) {
            res = sum;
            tmp = x;
        }

        System.out.println("Tong nho nhat: " + res);
        System.out.println(tmp);

    }

    // kiem tra ma tran doi xung hay khong ?
    public boolean doiXung() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j] != a[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }

    public void checkDoiXung() {
        if (doiXung())
            System.out.println("Ma tran doi xung");
        else
            System.out.println("Ma tran khong doi xung");
    }

    // tinh dinh thuc ma tran
    public void getCofactor(int mat[][], int temp[][], int p, int q, int n) {
        int i = 0, j = 0;

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if (row != p && col != q) {
                    temp[i][j++] = mat[row][col];
                    if (j == n - 1) {
                        j = 0;
                        i++;
                    }
                }
            }
        }
    }

    public int tinhDT(int mat[][], int n) {
        int D = 0;
        if (n == 1)
            return mat[0][0];

        int temp[][] = new int[this.n][this.n];
        int sign = 1;
        for (int f = 0; f < n; f++) {
            getCofactor(mat, temp, 0, f, n);
            D += sign * mat[0][f] * tinhDT(temp, n - 1);

            sign = -sign;
        }
        return D;
    }

    public void tinhDinhThuc() {
        System.out.println("det a = " + tinhDT(a, n));
    }
    // 7 - 8

}
