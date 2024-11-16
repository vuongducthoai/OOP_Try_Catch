package _05_EXCEPTION._07_Throws;

import java.io.IOException;
//TH1: Ban da bat ngoai le, tuc la xu ly ngoai le bang cach su dung try/catch
//Trong truong hop xu ly ngoai le, code se duoc thuc thi tot cho du ngoai le
// xuat hien trong chuong trinh  khong.
public class TestThrows1 {

    static class M {
        void method() throws IOException {
            throw new IOException("Loi thiet bi");
        }
    }

    public static void main(String args[]) {
        try {
            M m = new M();  // // Neu goi mot thuong thuc khai bao throws mot ngoai le,
            // Chung ta nen bat hoac throws ngoai le do.
            m.method();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Ngoai le duoc xu ly");
        }

        System.out.println("Luong binh thuong...");
    }
}
