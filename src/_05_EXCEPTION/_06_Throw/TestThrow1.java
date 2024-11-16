package _05_EXCEPTION._06_Throw;
/*
    Tu khoa throw trong java duoc su dung de nem ra mot ngoai le cu the
 */
public class TestThrow1 {
    //throw ra ngoai le nhung khong xu ly
//    public static void validate(int age){
//        if(age < 18){
//            throw new ArithmeticException("not valid");
//        } else {
//            System.out.println("welcome");
//        }
//    }

    //throw ra ngoai le nhung co xu ly
    public static void validate(int age){
        try {
            if(age < 18){
                throw new ArithmeticException("not valid");
            } else {
                System.out.println("welcome");
            }
        }catch (ArithmeticException ex){
            System.out.println(ex.getMessage());
        }
    }


    public static void main(String[] args) {
        validate(13);
        System.out.println("rest of the code");
    }
}
