package _05_EXCEPTION.OOP_Exercise;

import java.sql.SQLException;
import java.util.Scanner;

public class MAIN {
    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
        ListKQHocTap listKQHocTap = new ListKQHocTap();
        int choice;
        do {
            System.out.println("\n");
            System.out.println("------------------MENU------------------");
            System.out.println("1. Xuất ra danh sách KQHT từ database");
            System.out.println("2. Thêm KQHT từ database");
            System.out.println("3. Xóa KQHT từ database");
            System.out.println("4. Cập nhật thông tin KQHT");
            System.out.println("5. In danh sách các KQHT thuộc Học Phần");
            System.out.println("Thoát\n");
            System.out.println("Nhập lựa chọn:");
            choice = sc.nextInt();
            if(choice == 1) {
                listKQHocTap.layDanhSachKQHocTap();
            } else if(choice == 2){
                listKQHocTap.themKqHocTap();
            } else if(choice == 3){
                listKQHocTap.xoaKqHocTap();
            } else if(choice == 4){
                listKQHocTap.suaKetQuaHT();
            } else if(choice == 5){
                listKQHocTap.layDanhSachKQHocTapThuocHocPhan();
            } else {
                System.out.println("Nhập lựa chọn không hơp lệ. Vui lòng nhập lại!");
            }
        } while (choice != 0);
    }
}
