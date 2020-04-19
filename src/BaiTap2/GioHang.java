/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2;

import java.util.ArrayList;

/**
 *
 * @author Khiem
 */
public class GioHang {
    IThanhToan hinhThucTT;
    ArrayList<HangHoa> DSHH = new ArrayList<>();

    public void sethinhThucTT(IThanhToan hinhThucTT) {
        this.hinhThucTT = hinhThucTT;
    }
    
    public void themHH(HangHoa HH)
    {
        DSHH.add(HH);
    }
    
    public int tinhTienHangHoa()
    {   
        int s=0;
        for(int i=0; i<DSHH.size();i++)
        {
           s = s + DSHH.get(i).getGia();
        }
        return s;
    }
    
    public double tinhTienKhachTra()
    {
        return hinhThucTT.thanhToan(tinhTienHangHoa());
    }
    
    public void HienThi()
    {
        for(int i=0; i<DSHH.size(); i++)
        {
            DSHH.get(i).HienThi();
        }
    }

}
