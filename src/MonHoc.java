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
public class MonHoc {
    private String tenMonHoc;
    private int tinChi;
    private double diemSo;

    public MonHoc(String tenMonHoc, int tinChi, double diemSo) {
        this.tenMonHoc = tenMonHoc;
        this.tinChi = tinChi;
        this.diemSo = diemSo;
    }

    public String getTenMonHoc() {
        return tenMonHoc;
    }

    public void setTenMonHoc(String tenMonHoc) {
        this.tenMonHoc = tenMonHoc;
    }

    public int getTinChi() {
        return tinChi;
    }

    public void setTinChi(int tinChi) {
        this.tinChi = tinChi;
    }

    public double getDiemSo() {
        return diemSo;
    }

    public void setDiemSo(double diemSo) {
        this.diemSo = diemSo;
    }
}
