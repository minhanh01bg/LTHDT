package bai8;

import java.util.Scanner;

public class BaiMot {
    private int n;

    private boolean isPrime(long m) {
        if (m < 2)
            return false;
        if (m == 2 || m == 3)
            return true;
        if (m % 2 == 0 || m % 3 == 0)
            return false;
        if (m % Math.sqrt(m) == 0)
            return false;
        for (int i = 5; i < Math.sqrt(m); i++) {
            if (m % i == 0)
                return false;
        }
        return true;
    }

    public BaiMot() {

    }

    // Nhập vào số nguyên dương n
    public void nhapN() {
        Scanner sc = new Scanner(System.in);
        System.out.print("1. nhap n: ");
        n = Integer.parseInt(sc.nextLine());
    }

    // tổng 1+2+3+...+n
    public void tong() {
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            ans += i;
        }
        System.out.println("Tong 1+2+3+...+n: " + ans);
    }

    // a tích 1.2.3...n
    public void tich() {
        int ans = 1;
        for (int i = 1; i <= n; i++) {
            ans *= i;
        }
        System.out.println("Tich 1*2*3*...*n: " + ans);
    }

    // a tổng các số chắn 2+4+...
    public void tongSoChan() {
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0)
                ans += i;
        }
        System.out.println("Tong So chan: " + ans);
    }

    // a tổng các số lẻ 1+3+5+..
    public void tongSoLe() {
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0)
                ans += i;
        }
        System.out.println("Tong so le: " + ans);
    }

    // Viết ra các số nguyên tố nhỏ hơn n
    public void vietRaCacSNT() {
        System.out.print("So nguyen to nho hon n: ");
        for (int i = 2; i < n; i++) {
            if (isPrime(i))
                System.out.print(i + " ");
        }
        System.out.println();
    }

    // Viết ra các ước số của n
    public void vietRaCacUocSoCuaN() {
        System.out.print("Uoc so cua n: ");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                System.out.print(i + " ");
        }
        System.out.println();
    }

    // Viết ra các ước số nguyên tố của n
    public void vietRaCacUocSoNTCuaN() {
        System.out.print("Uoc so nguyen to cua n:");
        for (int i = 2; i <= Math.sqrt(n); i++) {
            int x = 0;
            while (n % i == 0) {
                if (x == 0) {
                    System.out.print(i + " ");
                    x = 1;
                }
                n /= i;
            }
        }
        if (n != 1)
            System.out.print(n);
        System.out.println();
    }

    // m số Fibonacci thứ n
    public void fibonacciThuN() {
        long[] dp = new long[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i < n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        System.out.println("So fibonacci thu n: " + dp[n - 1]);
    }

    // Viết ra dãy số Fibonacci nhỏ hơn n
    public void fibonacciNhoHonN() {
        long[] dp = new long[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i < n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        System.out.print("So fibonacci nho hon n: ");
        for (int i = 0; i < n; i++)
            if (dp[i] < n)
                System.out.print(dp[i] + " ");
        System.out.println();
    }

    // Hãy liệt kê các số Fibonaci nhỏ hơn n là số nguyên tố

    public void fibonacciNhoHonNlaSNT() {
        long[] dp = new long[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i < n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        System.out.print("So fibonacci nho hon n la so nguyen to: ");
        for (int i = 0; i < n; i++)
            if (dp[i] < n && isPrime(dp[i]) == true)
                System.out.print(dp[i] + " ");
        System.out.println();
    }

    // sinh nhi phan
    private int b[] = new int[15];

    public void xauNhiPhanDoDaiN(int i) {
        for (int j = 0; j < 2; j++) {
            b[i] = j;
            if (i == n - 1) {
                for (int x = 0; x < n; x++)
                    System.out.print(b[x]);
                System.out.print(" ");
            } else
                xauNhiPhanDoDaiN(i + 1);
        }
    }

    // sinh hoan vi
    private boolean check[] = new boolean[10];
    private int[] A = new int[10];

    private void xuat() {
        for (int i = 0; i < n; i++)
            System.out.print(A[i]);
        System.out.print(" ");
    }

    public void init() {
        System.out.print("Hoan vi cua N: ");
        for (int i = 0; i < 10; i++) {
            check[i] = false;
        }
    }

    public void hoanVicuaN(int k) {
        for (int i = 1; i <= n; i++) {
            if (!check[i]) {
                A[k] = i;
                check[i] = true;
                if (k == n - 1)
                    xuat();
                else
                    hoanVicuaN(k + 1);
                check[i] = false;
            }
        }
    }

    // viet ra so nt co n chu so
    public void vietRaSoNTCoNChuSo() {
        System.out.print("so nguyen to co n chu so: ");
        for (int i = (int) Math.pow(10, n - 1); i < (int) Math.pow(10, n); i++) {
            if (isPrime(i))
                System.out.print(i + " ");
        }
        System.out.println();
    }

    // viet ra so thuan nghich co n chu so
    public void vietRaCacSoThuanNghichCoNChuSo() {
        StringBuilder s;
        String s1 = "";
        for (int i = (int) Math.pow(10, n - 1); i < (int) Math.pow(10, n); i++) {
            s1 = String.valueOf(i);
            s = new StringBuilder(s1);
            s.reverse();
            if (s1.equals(s.toString()))
                System.out.print(i + " ");
        }
        System.out.println();
    }

}
