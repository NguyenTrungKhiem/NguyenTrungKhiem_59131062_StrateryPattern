/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;

import java.util.Date;

/**
 *
 * @author Khiem
 */
public class SinhVien {
    String hoTen;
    Date ngaySinh;
    float diemTb;
    
    public SinhVien(String hoTen, Date ngaySinh, float diemTB)
    {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diemTb = diemTB;
    }

    public SinhVien() {
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public float getDiemTb() {
        return diemTb;
    }

    public void setDiemTb(float diemTb) {
        this.diemTb = diemTb;
    }
}
