package _05_EXCEPTION._12_TransferExceptionForCaller;
/*
 Mot ngoai le dau tien duoc nem ra tu phia tren cua call stack
 (Stack chua cac phuong thuc goi den nhau) va neu no khong catch
 no se giam xuong ngan xep den ohuong thuc truoc, neu khong
 duoc catch o do, ngoai le lai giam xuong phuong thuc truoc,
 va cu nhu vay cho den khi chung duoc catch hoac cho den khi chung cham den day
 cua stack. Dieu nay duoc goi la
 truỷn ngoai le (truyen exception trong java)
 */


//Quy tac: Theo mac dinh, Cac ngoai le unchecked duoc chuyen tiep trong chuoi
// goi goi (duoc truyen)
public class TestExceptionPropagetion1 {
   void m(){
       int data = 50 / 0;
   }

   void n(){
       m();
   }

   void p(){
       try {
           n();
       } catch (Exception e){
           System.out.println("exception hanlded");
       }

       n();
   }

    public static void main(String[] args) {
        TestExceptionPropagetion1 t = new TestExceptionPropagetion1();
        t.p();
        System.out.println("normal flow...");
    }

    /*
    Giai thich
    * STACK *
     m()
     n()
     p()
     main()
     */
    //Call Stack

    /*
    Trong ví dụ về ngoại lệ trên xảy ra trong phương thức m()
    nơi nó không được xử lý, do đó nó được truyền đến phương thức n()
    nhưng nó không được xử lý, một lần nữa nó được truyền đến phương thức p()
    trong đó ngoại lệ được xử lý.
   */

    /*
    Ngoại lệ có thể được xử lý trong bất kỳ phương thức nào trong call stack
     hoặc trong phương thức main(), phương thức p(), phương thức n() hoặc m().
     */
}
