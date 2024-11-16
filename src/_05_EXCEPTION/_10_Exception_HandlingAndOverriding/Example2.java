package _05_EXCEPTION._10_Exception_HandlingAndOverriding;

/*
 2) Quy tac: Neu phuong thuc cua lop cha khong khai bao nem ra exception,
 phuong thuc duoc ghi de cua lop cha khong the nem ra ngoai le checked, nhung
 ngoai le unchecked thi co the.
 */
public class Example2 {
    static class Parent {
        void msg(){
            System.out.println("parent");
        }
    }

    static class TestExceptionChild1 extends Parent {
        void msg() throws ArithmeticException {
            System.out.println("child");
        }
    }

    public static void main(String args[]){
        Parent p = new TestExceptionChild1();
        p.msg();
    }
}
