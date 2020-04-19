/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2;

/**
 *
 * @author Khiem
 */
public class Main {
      public static void main(String[] args) {
        GioHang GH1 = new GioHang();
        GioHang GH2 = new GioHang();
        
        GH1.sethinhThucTT(new ThanhToanCOD());
        GH2.sethinhThucTT(new ThanhToanOnline());
        
        HangHoa HH1 = new HangHoa("Thịt bò mỹ",100000,"Thịt tươi không ô thiu");
        HangHoa HH2 = new HangHoa("Thịt heo",10000,"Thịt heo không bơm nưóc");
        HangHoa HH3 = new HangHoa("Tôm hùm",3000000,"Tươi sống");
        
        GH1.themHH(HH1);
        GH1.themHH(HH3);
        GH1.themHH(HH2);
        
        GH2.themHH(HH1);
        GH2.themHH(HH3);
        
        System.out.println("Danh sách hàng hóa GH1: ");
          GH1.HienThi();
          System.out.println("Tổng tiền hàng hóa: " +GH1.tinhTienHangHoa()+
                  "\nTổng tiền khách trả: " +GH1.tinhTienKhachTra());
        System.out.println("Danh sách hàng hóa GH2: ");
          GH2.HienThi();
          System.out.println("Tổng tiền hàng hóa: " +GH2.tinhTienHangHoa()+
                  "\nTổng tiền khách trả: " +GH2.tinhTienKhachTra());
    }
}
