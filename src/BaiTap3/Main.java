/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author Khiem
 */
public class Main {
    public static void main(String[] args) throws ParseException {
        QuanLySinhVien SV = new QuanLySinhVien();
        SinhVien SV1 = new SinhVien("Nguyễn Trung Khiêm",new SimpleDateFormat("dd/MM/yyyy").parse("07/08/1999"),8);
        SinhVien SV2 = new SinhVien("Nguyễn Lê Quốc Trung",new SimpleDateFormat("dd/MM/yyyy").parse("01/02/1999"),6);
        SinhVien SV3 = new SinhVien("Nguyễn Tấn Kiệt",new SimpleDateFormat("dd/MM/yyyy").parse("10/11/1999"),7);
    
        SV.them(SV1);
        SV.them(SV2);
        SV.them(SV3);
        
        System.out.println("Danh Sach Sinh Vien: ");
        SV.inDS();
        
        ISoSanh SSTheoDiem = new SoSanhTheoDiem();
        ISoSanh SSTheoTen = new SoSanhTheoTen();
        System.out.println("------------------------------------------------------------");
        SV.setSoSanh(SSTheoDiem);
        SV.sapXep();
        System.out.println("Danh Sach Sinh Vien Sap Xep Theo Diem: ");
        SV.inDS();
        
        System.out.println("------------------------------------------------------------");
        
        SV.setSoSanh(SSTheoTen);
        SV.sapXep();
        System.out.println("Danh Sach Sinh Vien Sap Xep Theo Ten: ");
        SV.inDS();
    }
}