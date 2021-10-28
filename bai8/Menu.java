package bai8;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        BaiMot n = null;
        BaiHai s = null;
        BaiSau m = null;
        BaiBon x = null;
        BaiMuoi a = null,b = null,tong = null;
        BaiBay k = null;
        BaiTam l = null;
        while (true) {
            System.out.println("---------MENU---------");
            System.out.println("1. Nhap n");
            System.out.println("2. Nhap n");
            System.out.println("3. Nhap n");

            System.out.println("4. Nhap xau");
            System.out.println("5. chuan hoa ten");
            System.out.println("6. tao email");

            System.out.println("7. Nhap n");
            System.out.println("8. Nhap n");
            System.out.println("9. Nhap n");

            System.out.println("0. Thoat");
            System.out.print("chon 0 -> 9: ");
            int chon;
            Scanner sc = new Scanner(System.in);
            chon = Integer.parseInt(sc.nextLine());
            switch (chon) {
                case 0:
                    System.out.println("BYE!!!");
                    System.exit(0);
                case 1:
                    n = new BaiMot();
                    n.nhapN();
                    n.vietRaCacSoThuanNghichCoNChuSo();
                    break;
                case 2:
                    s = new BaiHai();
                    s.nhapN();
                    s.kiemTraThuanNghich();
                    break;
                case 3:
                    m = new BaiSau();
                    m.nhap();
                    m.Pi();
                    m.Cos();
                    m.Sin();
                    break;

                case 4:
                    x = new BaiBon();
                    x.giaiPTBac2();
                    x.dienTich();
                    x.chuVi();
                    break;
                case 5:
                    a = new BaiMuoi();
                    a.nhap();
                    b = new BaiMuoi(a.getN());
                    b.nhap();
                    tong = a.tong(b.getA());
                    tong.hienthi();
                    break;
                case 6:
                    k = new BaiBay();
                    k.nhap();
                    k.demSoLanXuatHien();
                    break;
                case 7:
                    l = new BaiTam();
                    l.nhap();
                    l.phanTu1Lan();
                    l.soLanXuatHien();
                    l.sapXepGiamGian();
                    break;
                case 8:
                    break;
                case 9:
                    break;
                default:
                    System.out.println("chi chon 0 -> 9");
                    break;
            }
        }
    }
}
