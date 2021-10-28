package btth;

import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;

public class QLTV implements IChucNang {
    private List<TaiLieu> list;
    private Scanner sc = new Scanner(System.in);

    public QLTV() {
        list = new ArrayList<>();
        list.add(new Sach("12", "Vu Minh Anh", 300, "Vu Minh Anh", "Cuoc song ao", 500));
        list.add(new Sach("13", "Do Kim Anh", 350, "Do Kim Anh", "Cuoc song ao", 400));

        list.add(new Bao("124", "Vu Minh Anh", 200, "20/12/2021"));
        list.add(new Bao("125", "Dang Quang Dung", 200, "20/12/2021"));
        list.add(new Bao("126", "Dinh Cong Manh", 200, "20/12/2021"));
        list.add(new Bao("127", "Le Duy Bach", 200, "20/12/2021"));

    }

    public void hienthiAll() {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());
        }
    }

    public boolean tontai(String id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(id)) {
                return false;
            }
        }
        return true;
    }

    public TaiLieu nhapTaiLieu() {
        TaiLieu t = null;
        String ma, tenNhaXuatBan;
        int sobanPhatHanh;
        while (true) {
            System.out.print("nhap ma tai lieu:");
            ma = sc.nextLine();
            if (tontai(ma) == false) {
                System.out.println("Nhap lai !!!");
            } else
                break;
        }
        System.out.print("Nhap ten nha xuat ban:");
        tenNhaXuatBan = sc.nextLine();
        System.out.print("Nhap so ban phat hanh:");
        sobanPhatHanh = Integer.valueOf(sc.nextLine());
        t = new TaiLieu(ma, tenNhaXuatBan, sobanPhatHanh);
        return t;
    }

    @Override
    public void nhapSach() {
        TaiLieu t = nhapTaiLieu();
        String tentacgia, tenSach;
        int sotrang;
        System.out.print("Nhap ten tac gia:");
        tentacgia = sc.nextLine();
        System.out.print("Nhap ten sach:");
        tenSach = sc.nextLine();
        System.out.print("Nhap so trang:");
        sotrang = Integer.valueOf(sc.nextLine());

        Sach x = new Sach(t.getId(), t.getTenNhaXuatBan(), t.getSoBanPhatHanh(), tentacgia, tenSach, sotrang);
        list.add(x);
    }

    public boolean survey(String date) {
        String regex = "^\\d{1,2}[/|-]\\d{1,2}[/|-]\\d{4}$";
        if (date.matches(regex)) {
            return true;
        }
        return false;
    }

    @Override
    public void nhapBao() {
        TaiLieu t = nhapTaiLieu();

        String ngayPhatHanh;
        while (true) {
            System.out.print("Nhap ngay phat hanh:");
            ngayPhatHanh = sc.nextLine();
            if (survey(ngayPhatHanh)) {
                break;
            } else
                System.out.println("Nhap lai !!!");
        }
        Bao x = new Bao(t.getId(), t.getTenNhaXuatBan(), t.getSoBanPhatHanh(), ngayPhatHanh);
        list.add(x);
    }

    @Override
    public void DanhSachTL() {
        int cnt1 = 0;
        System.out.println("_________Danh sach sach _______________");
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof Sach) {
                System.out.println(list.get(i).toString());
                cnt1 += 1;
            }
        }
        System.out.println("Tong so sach: " + cnt1);
        System.out.println("________danh sach bao____________");
        int cnt = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof Bao) {
                System.out.println(list.get(i).toString());
                cnt += 1;
            }
        }
        System.out.println("Tong so bao: " + cnt);
        System.out.println("Tong toan bo: " + list.size());
    }

    @Override
    public void SapXepTaiLieuTheoTenNhaXuatBan() {
        System.out.println("Sap xep theo ten nha xuat ban:");
        Collections.sort(list, new Comparator<TaiLieu>() {
            @Override
            public int compare(TaiLieu o1, TaiLieu o2) {
                return o1.getTenNhaXuatBan().compareTo(o2.getTenNhaXuatBan());
            }
        });
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());
        }
    }

    @Override
    public void TimKiemTaiLieu() {
        int soPhatHanh1, soPhatHanh2;
        System.out.print("Nhap so phat hanh tu:  ");
        soPhatHanh1 = Integer.valueOf(sc.nextLine());
        System.out.print("den: ");
        soPhatHanh2 = Integer.valueOf(sc.nextLine());
        int x = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getSoBanPhatHanh() >= soPhatHanh1 && list.get(i).getSoBanPhatHanh() <= soPhatHanh2) {
                System.out.println(list.get(i));
                x = 1;
            }
        }
        if (x == 0) {
            System.out.println("khong co !!!");
        }
    }

    @Override
    public void TongSoDauSachTheoMoiTacGia() {
        List<Sach> list2 = new ArrayList<Sach>();
        List<String> tg = new ArrayList<>();
        for (TaiLieu i : list) {
            if (i instanceof Sach)
                list2.add(((Sach) i));
        }

        for (Sach i : list2) {
            if (!tg.contains(i.getTenTacGia()))
                tg.add(i.getTenTacGia());
        }

        for (String ten : tg) {
            System.out.print("Tac gia: " + ten + ": ");
            int dem = 0;
            for (Sach i : list2) {
                if (i.getTenTacGia().equals(ten))
                    dem++;
            }
            System.out.println(dem + " sach");
        }
    }

}
