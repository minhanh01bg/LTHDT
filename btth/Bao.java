package btth;

public class Bao extends TaiLieu implements ITinhGia {
    private String ngayPhatHanh;

    public Bao(String id, String tenNhaXuatBan, int soBanPhatHanh, String ngayPhatHanh) {
        super(id, tenNhaXuatBan, soBanPhatHanh);
        this.ngayPhatHanh = ngayPhatHanh;
    }

    public void setNgayPhatHanh(String ngayPhatHanh) {
        this.ngayPhatHanh = ngayPhatHanh;
    }

    public String getNgayPhatHanh() {
        return ngayPhatHanh;
    }

    public int getThangPhatHanh() {
        int x;
        String str[] = ngayPhatHanh.split("/|-");
        x = Integer.valueOf(str[1]);
        return x;
    }

    public int getNgayPhatHanh1() {
        int x;
        String str[] = ngayPhatHanh.split("/|-");
        x = Integer.valueOf(str[0]);
        return x;
    }

    public int getNamPhatHanh() {
        int x;
        String str[] = ngayPhatHanh.split("/|-");
        x = Integer.valueOf(str[2]);
        return x;
    }

    @Override
    public String toString() {
        return "Bao: " + this.getId() + " " + this.getTenNhaXuatBan() + " " + this.getSoBanPhatHanh() + " "
                + ngayPhatHanh;
    }

    @Override
    public int getGia() {
        if (this.getSoBanPhatHanh() >= 300) {
            return 10000;
        } else
            return 9000;
    }
}
