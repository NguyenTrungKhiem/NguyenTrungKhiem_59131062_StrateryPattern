/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap1;
/**
 *
 * @author Khiem
 */
public class Main {
    public static void main(String[] args) {
        context pheptinh1 = new context();
        ITinh cong = new Cong();
        pheptinh1.setTinhToan(cong);
        System.out.println("Kết quả phép cộng là: " +pheptinh1.Tinh(5, 7));
        
         context pheptinh2 = new context();
        ITinh tru = new Tru();
        pheptinh1.setTinhToan(tru);
        System.out.println("Kết quả phép cộng là:" +pheptinh1.Tinh(5, 7));
        
         context pheptinh3 = new context();
        ITinh nhan = new Nhan();
        pheptinh1.setTinhToan(nhan);
        System.out.println("Kết quả phép cộng là: " +pheptinh1.Tinh(5, 7));
        
         context pheptinh4 = new context();
        ITinh chia = new Chia();
        pheptinh1.setTinhToan(chia);
        System.out.println("Kết quả phép cộng là: " +pheptinh1.Tinh(8, 2));
    }
}
