package _05_EXCEPTION._10_Exception_HandlingAndOverriding;


//Neu phuong thuc cua lop cha khai bao nem ra exception
/*
Quy tac: Neu phuong thuc cua lop cha khai bao nem ra exception,
 phuong thuc duoc ghi de cua lop cha co the khai bao nem ra ngoai le
tuong tu, ngoai le con, nhung khong the khai bao nem ra ngoai le cha.
 */
public class Example3 {
    static class Parent{
        void msg() throws ArithmeticException {
            System.out.println("parent");
        }
    }

    static class TestExceptionChild1 extends Parent{
//        void msg() throws Exception {  // Exception class is parent of ArithmeticException class
//            System.out.println("child");
//        }

    }


    //VD ve TH phuong thuc ghi de cua lop cha khai bao nem ra ngoai le tuong tu.
    static class TestExceptionChild2 extends Parent{
        void msg() throws ArithmeticException {}
    }

    //VD ve truong hop phuong thuc ghi de
    // cua lop cha khong khai bao nem ra ngoai le nao
    static class TestExceptionChild3 extends Parent{
        void msg() {
            System.out.println("child");
        }
    }



    public static void main(String[] args) {
        Parent p = new TestExceptionChild3();
        p.msg();
    }
}


