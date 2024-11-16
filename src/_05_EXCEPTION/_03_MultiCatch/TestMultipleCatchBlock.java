package _05_EXCEPTION._03_MultiCatch;

public class TestMultipleCatchBlock {
    /*
        Quy tac: Vao mot thoi diem chi xay ra mot ngoai le
         va tai mot thoi diem chi co mot khoi catch duoc thuc thi
     */

    /*
    Quy tac: Tat ca cac khoi lenh catch phai duoc sap xeo tu cu the nhat den chung nhat
    tuc la phai khai bao khoi lenh catch de xy le loi ArithmeticException truoc khi khai bao catch de xu ly
    loi Exception
     */
    public static void main(String[] args) {
//        try{
//            int a[] = new int[5];
//            a[10] = 30 / 2;
//        }catch(ArithmeticException e){
//            System.out.println("task1 is completed");
//        } catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("task2 is completed");
//        } catch (Exception e){
//            System.out.println("common task completed");
//        }
//        System.out.println("rest of the code");


         /*
            Compile-time-error
          */
//                try{
//            int a[] = new int[5];
//            a[10] = 30 / 2;
//        }catch(Exception e){
//                    System.out.println("common task completed");
//        } catch (ArithmeticException e){
//                    System.out.println("common task completed");
//        } catch (ArrayIndexOutOfBoundsException  e){
//
//                    System.out.println("task2 is completed");
//        }
//        System.out.println("rest of the code");
    }
}
