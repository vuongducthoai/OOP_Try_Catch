package _05_EXCEPTION._07_Throws;

import java.io.IOException;

//TH2: Bạn khai báo ném ngoại lệ, tức là sử dụng từ khóa throws với phương thức.
public class TestThrows2 {
    //TH2: Khai báo throws ngoại lệ
    /*
        * A)  Trong trường hợp bạn khai báo throws ngoại lệ,
        *  nếu ngoại lệ không xảy ra, code sẽ được thực hiện tốt.

         * B) Trong trường hợp bạn khai báo throws ngoại lệ, nếu ngoại lệ xảy ra,
         * một ngoại lệ sẽ được ném ra tại runtime vì throws nên không xử lý ngoại đó.

         *
     */

    //A) Ngoai le khong xay ra
        static class M{
        void method() throws IOException {
            System.out.println("Thiet bi dang hoat dong tot");
        }
    }

    public static void main(String[] args) throws IOException {
        M m = new M();
        m.method();
        System.out.println("Luong binh thuong...");
    }

}
