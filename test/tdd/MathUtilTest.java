/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd;

import org.junit.Test;
import static org.junit.Assert.*;
import fu.util.MathUtil;
//imporst static junit

/**
 *
 * @author Tyrael
 */
public class MathUtilTest {
    //đây là class đb, chứa các hàm , mà mỗi hàm dùng để test các hàm bên class
    //của dự án, vd test hàm cF() coi chạy đúng ko
    //mỗi hàm sẽ chạy 1 hoặc nhiều lệnh cF() tùy bạn, để kt coi
    //actual có khớp vs expected hay ko
    //khớp, ném ra màu xanh 
    //ko khớp, ném ra màu đỏ
    //mỗi hàm sẽ là 1 hàm main() nếu nó mang phía trước một kí hiệu 
    //@Test - gọi là annotation

    @Test
    public void testSuccessfulCases() {
        //hàm này gọi những cF() mà trả về kết quả giai thừa
        //assertEquals(120, 120);  //expected truoc, actual sau
        
        //expect 1, actual: chờ tính toán khi chạy hàm
        assertEquals(1, MathUtil.computeFactorial(1));
        
        //expect 1, actual: chờ tính toán khi chạy hàm
        assertEquals(1, MathUtil.computeFactorial(0));
        
        assertEquals(2, MathUtil.computeFactorial(2));
        
        assertEquals(6, MathUtil.computeFactorial(3));
        
        assertEquals(720, MathUtil.computeFactorial(6));
    }      

    @Test(expected = IllegalArgumentException.class)
    public void testFailedCases(){
//        hàm này test những tình huống cà chớn
//        ng dùng đưa 5!, tính thế éo nào đc
//        hàm cF() phải ném về ngoại lệ, một tình huống bất thường, 
//        1 Exception
//        khốn nạn, Exception ko phải là value để assert()
//        ta phải dùng 1 chiêu khác
        MathUtil.computeFactorial(-5);   //ko xài assertEquals()
//        đưa -5 vào tham số, mình (dev tk ra hàm cF() coi đây là cà chớn)
//        đập vào mặt ng đưa ra con số -5 này vào
//        bằng cách ném ra ngoại lệ IllegalArgumentException
//        hi
    }
    //one
}

//đỏ: chỉ cần 1 thằng đỏ, là coi như cả đám đỏ, hàm chạy đúng hầu hết 
//các cases, nhưng chỉ 1 tình huống sai, coi như hàm sai
//xanh: tất cả phải xanh, hàm đúng cho mọi tình huống