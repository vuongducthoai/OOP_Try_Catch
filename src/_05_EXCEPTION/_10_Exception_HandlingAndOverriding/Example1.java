package _05_EXCEPTION._10_Exception_HandlingAndOverriding;

//Neu phuong thuc cua lop cha khong khai bao nem ra exception
/*
    1)Quy tac: Neu phuong thuc cua lop cha khong khai bao(throws) nem ra exception
    phuong thuc duoc ghi de cua lop cha khong the khai bao nem ra ngoai le checked.
 */
public class Example1 {
   static class Parent{
        void msg(){
            System.out.println("parent");
        }
    }

    static class TextExceptionChild extends Parent{
    //    void msg() throws IOException{
      //      System.out.println("TestExceptionChild");
       // }


    }

    public static void main(String[] args) {
        Parent p = new TextExceptionChild();
        p.msg();

    }
}
