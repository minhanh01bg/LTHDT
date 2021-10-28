package btth;

public class TaiLieu {
    private String id, tenNhaXuatBan;int soBanPhatHanh;

    public TaiLieu(String id, String tenNhaXuatBan, int soBanPhatHanh) {
        this.id = id;
        this.tenNhaXuatBan = tenNhaXuatBan;
        this.soBanPhatHanh = soBanPhatHanh;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setSoBanPhatHanh(int soBanPhatHanh) {
        this.soBanPhatHanh = soBanPhatHanh;
    }

    public void setTenNhaXuatBan(String tenNhaXuatBan) {
        this.tenNhaXuatBan = tenNhaXuatBan;
    }

    public String getId() {
        return id;
    }

    public int getSoBanPhatHanh() {
        return soBanPhatHanh;
    }

    public String getTenNhaXuatBan() {
        return tenNhaXuatBan;
    }

    @Override
    public String toString() {
        return id + " " + tenNhaXuatBan + " " + soBanPhatHanh;
    }
}
