package bai8;

import java.util.Scanner;

public class BaiHai {
    private int n;
    public BaiHai(){

    }
    public void nhapN() {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap n: ");
        n = Integer.parseInt(sc.nextLine());
    }

    // tinh tong cac chu so cua n
    public void tongChuSoCuaN() {
        int m = n;
        int ans = 0;
        while (m != 0) {
            ans += (m % 10);
            m /= 10;
        }
        System.out.println("tong cac chu so cua n: " + ans);
    }

    // phan tich thua so nguyen to
    public void thuaSoNguyenTo() {
        int m = n;
        String str  = "Thua so sau khi phan tich: " + String.valueOf(m) + " = ";
        
        while (m % 2 == 0) {
            str += "2x";
            m /= 2;
        }

        for (int i = 3; i <= Math.sqrt(m); i += 2) {
            while (m % i == 0) {
                str += String.valueOf(i) +"x";
                m /= i;
            }
        }
        if (m > 2)
            str += String.valueOf(m) + "x";
        str = str.substring(0,str.length()-1);
        System.out.println(str);
    }
    // kiem tra so thuan nghich
    public void kiemTraThuanNghich(){
        String m = String.valueOf(n);
        StringBuilder x = new StringBuilder(m);
        x.reverse();
        if(m.equals(x.toString())){
            System.out.println("n la so thuan nghich");
        }
        else System.out.println("n khong la so thuan nghich");
    }
}
