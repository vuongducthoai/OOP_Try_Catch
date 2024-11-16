package _05_EXCEPTION._07_Throws;

import java.io.IOException;

/*
Tu khoa throws trong java duoc su dung de khai bao mot ngoai le.
 */
public class TestThrows {
    /* Syntax of throws in Java
        return_type method_name() throws exception_class_name {
            //method code
        }
     */
    /* Ngoai le nao nen duoc khai bao
        Chỉ co ngoai le checked, boi vi:
        * Ngoai le unchecked: nam trong su kiem soat cua ban
        * error: nam ngoai su kiem soat cua ban, vi du ban se khong the lam bat ki dieu gi
        khi cac loi VitualMachineError hoac StackOverflowError xay ra.
     */

    /* Benefit of keyword throws in Java
        - Ngoại lệ checked có thể được ném ra ngoài và được xử lý ở một hàm khác.
        - Cung cấp thông tin cho caller của phương thức về các ngoại lệ.
     */

    void m() throws IOException {
        throw new IOException("Loi thiet bi");// checked exception
    }

    void n() throws IOException {
        m();
    }

    void p() {
        try {
            n();
        } catch (Exception e) {
            System.out.println(e.getMessage()); // loi thiet bi
            System.out.println("ngoai le duoc xu ly");
        }
    }

    // Quy tac: Neu ban dang goi mot phuong thuc khai bao throws mot ngoai le, ban phai bat hoac
    // throws ngoại lệ đó.
    public static void main(String args[]) {
        TestThrows obj = new TestThrows();
        obj.p();
        System.out.println("luong binh thuong...");
    }
}
