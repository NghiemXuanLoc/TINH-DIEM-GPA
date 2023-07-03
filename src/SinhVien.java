/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contest14.B10;

/**
 *
 * @author PC
 */
public class SinhVien {

    private String msv, ten, lop;
    private MonHoc[] monDaHocQua;

    public SinhVien(String msv, String ten, String lop, MonHoc[] monDaHocQua) {
        this.msv = msv;
        this.ten = ten;
        this.lop = lop;
        this.monDaHocQua = monDaHocQua;
    }

    public String getMsv() {
        return msv;
    }

    public void setMsv(String msv) {
        this.msv = msv;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public MonHoc[] getMonDaHocQua() {
        return monDaHocQua;
    }

    public void setMonDaHocQua(MonHoc[] monDaHocQua) {
        this.monDaHocQua = monDaHocQua;
    }

    public double getGpa() {
        double gpa = 0;
        int tin = 0;
        int soTinDaHoc = 0;
        double diemSoDatDuoc = 0.0d;
        for (int i = 0; i < monDaHocQua.length; i++) {
            tin += monDaHocQua[i].getTinChi();
            soTinDaHoc = monDaHocQua[i].getTinChi();
            diemSoDatDuoc = monDaHocQua[i].getDiemSo();
            gpa += soTinDaHoc * diemSoDatDuoc;
        }
        return gpa/tin;
    }

    public String toString() {
        String diem = "" + this.getGpa();
        return this.msv + " " + this.ten + " " + this.lop + " " + diem.substring(0, 4) + "\n------------------------";
    }

}
