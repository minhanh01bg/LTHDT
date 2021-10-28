package minhanh;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Epsilon x = new Epsilon();
        Xau y = new Xau();
        MaTrix z = null;
        while (true) {
            System.out.println("---------MENU---------");
            System.out.println("1. Nhap xau");
            System.out.println("2. Kiem tra ma sinh vien");
            System.out.println("3. Tach cac tu trong xau");
            System.out.println("4. Dua ra tu va so lan suat hien");

            System.out.println("5. Nhap vao ma tran A");
            System.out.println("6. Ma tran chuyen vi cua A");
            System.out.println("7. Dua ra cac hang chi co cac so nguyen to");

            System.out.println("8. Nhap x va epsilon");
            System.out.println("9. Tinh cos(x) ");

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
                    y.nhap();
                    break;
                case 2:
                    y.chekMSV();
                    break;
                case 3:
                    y.tachTu();
                    break;
                case 4:
                    y.demSoLanXuatHien();
                    break;
                case 5:
                    z = new MaTrix();
                    z.nhap();
                    break;
                case 6:
                    z.maTranChuyenVi();
                    break;
                case 7:
                    z.hangNguyenTo();
                    break;
                case 8:
                    x.nhap();
                    break;
                case 9:
                    x.Cos();
                    break;
                default:
                    System.out.println("chi chon 0 -> 9");
                    break;
            }
        }
    }
}
