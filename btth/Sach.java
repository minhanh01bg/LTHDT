package btth;

public class Sach extends TaiLieu implements ITinhGia {
    private String tenTacGia, tenSach;
    private int soTrang;

    public Sach(String id, String tenNhaXuatBan, int soBanPhatHanh, String tenTacGia, String tenSach, int soTrang) {
        super(id, tenNhaXuatBan, soBanPhatHanh);
        this.tenTacGia = tenTacGia;
        this.soTrang = soTrang;
        this.tenSach = tenSach;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    public String getTenTacGia() {
        return tenTacGia;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public String getTenSach() {
        return tenSach;
    }

    @Override
    public String toString() {
        return "Sach: " + this.getId() + " " + this.getTenNhaXuatBan() + " " + this.getSoBanPhatHanh() + " " + tenTacGia
                + " " + tenSach + " " + soTrang;
    }

    @Override
    public int getGia() {
        if (this.getSoBanPhatHanh() >= 300) {
            return this.getSoTrang() * 2000;
        }
        return this.getSoTrang() * 1600;
    }
}
