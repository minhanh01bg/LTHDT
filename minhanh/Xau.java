package minhanh;

import java.util.Scanner;
import java.util.regex.Pattern;
public class Xau {
    private String s;
    Scanner sc = new Scanner(System.in);
    public Xau() {

    }

    public void nhap() {
        System.out.println("Nhap doan:");
        s = sc.nextLine();
        System.out.print("Doan vua nhap:");
        System.out.println(s);
    }

    public void chekMSV(){
        System.out.println("nhap xau");
        String re = "^[B\\{d}\\{d}DCCN\\{d}\\{d}\\{d}]";
        s = sc.nextLine().toUpperCase();
        if(Pattern.matches(s,re)){
            System.out.println("la ma sinh vien");
        }
        else System.out.println("khong la ma sinh vien");
    }    

    public void tachTu() {
        System.out.print("Nhap doan can tach: ");
        s = sc.nextLine();
        s = s.trim();
        String S = s;
        System.out.println("Cac tu:");
        String[] str = S.split("[^a-zA-Z]");
        for (int i = 0; i < str.length; i++) {
            if (str[i].length() != 0)
                System.out.println(str[i]);
        }
    }

    public void demSoLanXuatHien() {
        System.out.println("Nhap xau can dem:");
        s = sc.nextLine();
        System.out.println("Tu va so lan xuat hien: ");
        s = s.trim();
        String S = s;
        String[] tu = S.split("[^a-zA-Z0-9]");
        int dem = 0;
        for (int i = 0; i < tu.length; i++) {
            dem = 1;
            for (int j = i + 1; j < tu.length; j++) {
                if (tu[i].equals(tu[j]) == true) {
                    dem += 1;
                    tu[j] = "";
                }
            }
            if (tu[i].length() != 0)
                System.out.println(tu[i] + " " + dem);
        }
    }
}
