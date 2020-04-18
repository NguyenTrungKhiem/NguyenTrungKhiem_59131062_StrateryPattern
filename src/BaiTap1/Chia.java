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
public class Chia implements ITinh{

    @Override
    public float Tinh(float a, float b) {
        if(b==0)
        {
            System.out.println("Không có kết quả");
        }
        else
            return a/b;
        return 0;
    }
    
}
