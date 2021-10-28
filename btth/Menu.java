package btth;

import java.util.Scanner;

public class Menu {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        QLTV x = new QLTV();
        while (true) {
            System.out.println("__________________________MENU__________________________");
            System.out.println("0. Thoat");
            System.out.println("1. Nhap Sach");
            System.out.println("2. Nhap bao");
            System.out.println("3. Hien thi danh sach va co so luong o cuoi");
            System.out.println("4. Sap xep tai lieu theo nha xuat ban");
            System.out.println("5. tim kiem tai lieu co so phat hanh tu ... den .... ");
            System.out.println("6. Dua ra tong dau sach theo moi tac gia");
            System.out.print("chon 0->6: ");
            int chon;
            chon = Integer.valueOf(sc.nextLine());
            switch (chon) {
            case 0:
                System.out.println("BYE!!!");
                System.exit(0);
            case 1:
                x.nhapSach();
                x.hienthiAll();
                break;
            case 2:
                x.nhapBao();
                x.hienthiAll();
                break;
            case 3:
                x.DanhSachTL();
                break;
            case 4:
                x.SapXepTaiLieuTheoTenNhaXuatBan();
                break;
            case 5:
                x.TimKiemTaiLieu();
                break;
            case 6:
                x.TongSoDauSachTheoMoiTacGia();
                break;
            default:
                System.out.println("chi chon 0 -> 9");
                break;
            }
        }
    }
}
