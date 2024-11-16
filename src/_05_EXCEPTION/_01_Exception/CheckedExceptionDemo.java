package _05_EXCEPTION._01_Exception;

public class CheckedExceptionDemo {
    public static void main(String[] args) {
        CheckedExceptionDemo.testCheckedExceptionDemo();
//        int a = 50/0; //ArthmeticException
          //String s = null; //NullPointerException
//        System.out.println(s.length());
          //String s = "abc";
          //int i = Integer.parseInt(s); // NumberFormatException
        int a[] = new int[5];
        a[10] = 50;  // ArrayIndexOutOfBoundsException
    }
    public static void testCheckedExceptionDemo() throws MyCheckedException {
        System.out.println("Checked exception demo");
    }
}
