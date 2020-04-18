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
public class context implements ITinh{
        ITinh tinhToan;
    
    public context(){
    }

    public ITinh getTinhToan() {
        return tinhToan;
    }

    public void setTinhToan(ITinh tinhToan) {
        this.tinhToan = tinhToan;
    }
    
    @Override
      public float Tinh(float a, float b)
     {
        return tinhToan.Tinh(a, b);
     }
}
