package _05_EXCEPTION._12_TransferExceptionForCaller;

/*
Quy tac: Theo mac dinh, Cac ngoai le checked khong duoc chuyen tiep trong cac ham(duoc truyen)
 */
public class TestExceptionProgapation2 {
    void m() {
//        throw new IOException("driver error");
    }


    void n() {
        m();
    }

    void p(){
        try {
            n();
        } catch (Exception e){
            System.out.println("exception handeled");
        }
    }

    public static void main(String[] args) {
        TestExceptionProgapation2 p = new TestExceptionProgapation2();
        p.p();
        System.out.println("normal flow");
    }
}
