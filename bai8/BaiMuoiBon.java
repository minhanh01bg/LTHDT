package bai8;

import java.util.Scanner;

public class BaiMuoiBon {
    private String s;

    public BaiMuoiBon() {

    }

    public void nhapXau() {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap xau: ");
        s = sc.nextLine();
    }

    // nGuYEN vAN naM -> Nguyen Van Nam
    public void chuanHoa1() {
        s = s.trim();
        System.out.print("Xau sau khi chuan hoa: ");
        String ds[] = s.split("\\s+");
        StringBuilder kq = new StringBuilder();
        for (int i = 0; i < ds.length; i++) {
            ds[i] = ds[i].trim();
            kq.append(Character.toUpperCase(ds[i].charAt(0)));
            for (int j = 1; j < ds[i].length(); j++) {
                kq.append(Character.toLowerCase(ds[i].charAt(j)));
            }
            kq.append(" ");
        }
        kq.deleteCharAt(kq.length() - 1);
        System.out.println(kq.toString());
    }

    // nGUYEn quaNG vInH -> Quang Vinh, NGUYEN
    public void chuanHoa2() {
        s = s.trim();
        System.out.print("Xau sau khi chuan hoa: ");
        String ds[] = s.split("\\s+");
        StringBuilder kq = new StringBuilder();
        for (int i = 1; i < ds.length; i++) {
            ds[i] = ds[i].trim();
            kq.append(Character.toUpperCase(ds[i].charAt(0)));
            for (int j = 1; j < ds[i].length(); j++) {
                kq.append(Character.toLowerCase(ds[i].charAt(j)));
            }
            kq.append(" ");
        }
        kq.deleteCharAt(kq.length() - 1);
        System.out.print(kq + ", ");
        System.out.println(ds[0].toUpperCase());
    }

    // chuan hoa email
    public void email() {
        String[] tmp = s.toLowerCase().split("\\s+");
        String em = tmp[tmp.length - 1];
        for (int i = 0; i < tmp.length - 1; i++) {
            em += tmp[i].charAt(0);
        }
        em += "@ptit.edu.vn";
        System.out.println("Email duoc tao: " + em);
    }
    // chuan hoa van ban 
    public void chuanHoa(){
        s = s.replaceAll("\\,", "\\, ");
        s = s.replaceAll("\\.", "\\. ");
        s = s.replaceAll("\\?", "\\? ");
        s = s.replaceAll("\\;", "\\; ");
        s = s.replaceAll("\\:", "\\: ");
        s = s.replaceAll("\\!", "\\! ");
        s = s.replaceAll("\\s+", " ");
        s = s.replaceAll("\\s\\,", "\\,");
        s = s.replaceAll("\\s\\.", "\\.");
        s = s.replaceAll("\\s\\?", "\\?");
        s = s.replaceAll("\\s\\;", "\\;");
        s = s.replaceAll("\\s\\:", "\\:");
        s = s.replaceAll("\\s\\!", "\\!");
        System.out.println("Van ban sau khi chuan hoa:");
        System.out.println(s);
    }
}
