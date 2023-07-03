/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contest14.B10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Bai10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<SinhVien> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            String msv = sc.nextLine();
            String ten = sc.nextLine();
            String lop = sc.nextLine();
            int soMon = sc.nextInt();
            sc.nextLine();
            MonHoc[] monDaHocQua = new MonHoc[soMon];
            for (int j = 0; j < soMon; j++) {
                String tenMonHoc = sc.nextLine();
                String[] diemVaGpa = sc.nextLine().split("\\s+");
                MonHoc x = new MonHoc(tenMonHoc, Integer.parseInt(diemVaGpa[0]), Double.parseDouble(diemVaGpa[1]));
                monDaHocQua[j] = x;
            }
            SinhVien ans = new SinhVien(msv, ten, lop, monDaHocQua);
            list.add(ans);
        }
        Collections.sort(list, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien t, SinhVien t1) {
                if (t.getGpa() != t1.getGpa()) {
                    if (t.getGpa() < t1.getGpa()) {
                        return 1;
                    } else {
                        return -1;
                    }
                } else {
                    return t.getMsv().compareTo(t1.getMsv());
                }
            }

        });
        for (SinhVien x : list) {
            System.out.println(x);
        }
    }
}
