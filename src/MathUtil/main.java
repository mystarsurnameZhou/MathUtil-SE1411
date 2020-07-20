/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MathUtil;
import static fu.util.MathUtil.computeFactorial;
// gọi hàm từ package khác như C mà ko cần dấu chấm( hàm phải là STATIC)
/**
 *
 * @author Tyrael
 */
public class main {
    public static void main(String[] args) {
        System.out.println("5! = " + computeFactorial(5));
        //tui muon biet xem 5! chạy đúng ko
        //vậy tôi in kq xử lí của hàm ra (actual value) 
        //tui so sánh nó coi có bằng 120 mà tui tính trc ko(expected value)
        //neu ham co 1 value tra ve (actual - gia su 120) 
        //va khop vs cai tui can no phai the(expected - gia su minh can ham
        //tra ve 120)
        //actual khop vs expected, ham chay dung
        //testing chang qua la chay app, chay ham, coi kq tra ve co
        //dung nhu minh mong doi hay ko - actual va expected la nhu nhau
        //neu ko khop, code co bug, hoac minh ki vong sai
        
        //expected: 720 moi chiu
        System.out.println("6! = " + computeFactorial(6));
        
        //expected: 1 moi chiu
        System.out.println("1! = " + computeFactorial(1));
        
        //expected: 1 moi chiu
        System.out.println("0! = " + computeFactorial(0));
        
        //cách test kiểu này phải
        //>chuẩn bị data đầu vào
        //>gọi hàm với data đầu vào
        //>tính trươc kq trả về (expected)
        //>so sánh kq trả về từ hàm (actual) với expected = mắt 
        //tự đưa ra kết luận -> luận hàm bằng mắt
        
        //expected : Exception à nhen
        //System.out.println("-5! = " + computeFactorial(-5));
        
        //kĩ thuật này dùng mắt đối chiếu kq ổn, nhưng ko hiệu quả
        //vì máy có thể đối chiếu dq dc lun mà, máy so dc expected và actual mà
        //GIANG HỒ ĐƯ RA 1 BỘ THƯ VIỆN, 1 FRAMEWORK GIÚP MÌNH 
        //TỰ ĐỘNG SO SÁNH 2 KẾT QUẢ EXPECTED VÀ ACTUAL
        //framework này sẽ tự so sánh và đưa ra màu sắc để hàm ý rằng
        //hàm mà chạy đúng, màu xanh
        //hàm chạy sai, ko như kì vọng, màu đỏ
        //áp dụng cho 1 loạt data đầu vào
        
    }
}






















