package _05_EXCEPTION._09_Final_Finally_Finalize;
//Su khac nhau giua final, finally, finalize
/*
    final                                        finally                                finalize
1.    Final duoc su dung de ap              Finally duoc su dung de thuc thi        Finalize duoc su dung de thuc hien qua trinh
    dung cac han che ve class,            code quan trong, no luon duoc thuc       xu ly xoa ngay truoc khi doi tuong duoc gom rac.
    phuong thuc va bien. Lop              thi cho du ngoai le duoc xu ly hay
    final khong the duoc ke thua,          khong
    phuong thuc final khong the
    duoc ghi de va gia tri bien final
    khong the thay doi

2. Final la mot tu khoa.                 Finally la mot khoi(block)                 Finalize la mot phuong thuc
 */

public class Example {

    public static void finalizes(){
        System.out.println("finalize called");
    }

    public static void main(String[] args) {
        //Example Final
          final int x = 100;
//          x = 200;  // Complie Time Error

        //Example finally
        try{
            int y = 200;
        } catch (Exception e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("finally block is executed");
        }


        //Example finalize
        Example obj = new Example();
        Example obj2 = new Example();
        obj = null;
        obj2 = null;
        System.gc();  //  là một lệnh trong Java được sử dụng để đề nghị hệ thống thực hiện quá trình thu gom rác (garbage collection)
        //nó yêu cầu JVM (Java Virtual Machine) xem xét và giải phóng bộ nhớ mà các đối tượng không còn được tham chiếu nữa, nhằm tối ưu hóa việc sử dụng bộ nhớ của ứng dụng.
    }

}
