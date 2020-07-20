/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fu.util;

/**
 *
 * @author Tyrael
 */
//đây là class chứa các hàm toán học ta tự viết, mục đích là công cụ xài chung cho mọi nơi.
//Phàm cái gì mà dc thiết kế để xài chung ta dùng kĩ thuật STATIC

public class MathUtil {
    //tính n!= 1.2.3.4...5 vì n! tăng rất nhanh, sẽ tràn int sớm 
    //int chỉ lưu dc tối đa 2 tỷ 1, nên mình xài long an toàn hơn
    // 15! to lắm rồi, tính tối đa 15!
    public static long computeFactorial (int n)
    {
        if(n<0 || n>15)
            throw new IllegalArgumentException("Invalid argument.");
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
            
       //aaaaaaaaaaa
       
      //hi
    }
}
