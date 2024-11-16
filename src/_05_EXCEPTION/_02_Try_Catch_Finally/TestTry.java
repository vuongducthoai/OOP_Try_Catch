package _05_EXCEPTION._02_Try_Catch_Finally;

public class TestTry {
    //Syntax of block statement try-catch
    /*
        try{
            //code co the nem ra ngoai le
        } catch(Exception_class_Name ref){
            // code xu ly ngoai le
        }
     */

    //Syntax of block  statement try-finally
    /*
        try {
            //code co the nem ra ngoai le
        } finally {
            //code trong khoi nay luon duoc thuc thi
        }
     */

    public static void main(String[] args) {
        try {
            int data = 50 / 0;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("rest of the code");
    }
}
