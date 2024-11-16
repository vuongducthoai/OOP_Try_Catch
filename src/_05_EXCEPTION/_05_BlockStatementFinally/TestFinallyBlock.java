package _05_EXCEPTION._05_BlockStatementFinally;
/*
    Tai sao phai su dung khoi finally?
    Khoi finally co the duoc su dung de chen lenh "cleanup"  vao chuong tring như viec dong file, dong ket noi
 */

//Cach su khoi finally trong java
public class TestFinallyBlock {
    public static void main(String[] args) {
        /*
            TH1: Su dung khoi finally noi ngoai le khong xay ra
         */
//        try{
//            int data = 25 / 5;
//            System.out.println(data);
//        } catch (NullPointerException e){
//            System.out.println(e.getMessage());
//        } finally{
//            System.out.println("finally block is always executed");
//        }
//        System.out.println("rest of the code...");

        /*
            TH2: Su dung khoi lenh finally noi xay ra ngoai le nhung khong xu ly
         */
//        try {
//            int data = 25 / 0;
//            System.out.println(data);
//        } catch (NullPointerException e) {
//            System.out.println(e);
//        } finally {
//            System.out.println("finally block is always executed");
//        }
//        System.out.println("rest of the code ...");


         /*
         TH3: Su dung khoi lenh finally noi ngoai le xay ra va duoc xu ly
          */
//        try {
//            int data = 25 / 0;
//            System.out.println(data);
//        } catch (ArithmeticException e) {
//            System.out.println(e);
//        } finally {
//            System.out.println("finally block is always executed");
//        }
//        System.out.println("rest of the code ...");

        /*
          TH4: Su dung khoi lenh finally trong truong hop trong khoi try co lenh return
         */

        try {
            int data = 25;
            if(data % 2 != 0){
                System.out.println(data + " is odd number");
                return;
            }
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        } finally{
            System.out.println("Finally block is always executed");
        }
        System.out.println("rest of the code ...");

        //Quy tac: Doi voi moi khoi try, co the co khong nhieu khoi catch, nhung chi co moi khoi finally
        /*
        Khoi finally se khong duoc thuc thi neu chuong trinh bi thoat(bang cach goi System.exit() hoac xay ra
        mot loi khong the tranh khien chuong tnih bi chet).
         */
    }
}
