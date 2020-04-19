/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Khiem
 */
public class QuanLySinhVien {
    ISoSanh soSanh;
   ArrayList<SinhVien> DSSV = new ArrayList<>();

    public QuanLySinhVien() {
    }
    
    public QuanLySinhVien(ISoSanh soSanh)
    {
        this.soSanh = soSanh;
    }

    public void setSoSanh(ISoSanh soSanh) {
        this.soSanh = soSanh;
    }
    
    public void sapXep()
    {
        for(int i=0; i<DSSV.size()-1; i++)
           for(int j=i+1; j<DSSV.size();j++)
           {
               if(soSanh.soSanh(DSSV.get(i), DSSV.get(j))>0)
                   Collections.swap(DSSV, i ,j);
           }
    }
    public void inDS()
    {
        for(int i=0; i<DSSV.size();i++)
            DSSV.get(i).HienThiTT();
    }
    public void them(SinhVien sv)
    {
        DSSV.add(sv);
    }
}
