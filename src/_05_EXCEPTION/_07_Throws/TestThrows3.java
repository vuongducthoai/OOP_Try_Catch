package _05_EXCEPTION._07_Throws;

import java.io.IOException;

public class TestThrows3 {
    static class M {
        void method() throws IOException{
            throw new IOException();
        }
    }

    //Ngoai le xay ra vi  chung ta dang goi mot phuong thuc khai bao throws mot ngoai le,
    // ma chung ta khong bat hoac throws ngoai le do.
    public static void main(String[] args) {
        M m = new M();
//        m.method();
        System.out.println("Luong binh thuong");
    }
}
