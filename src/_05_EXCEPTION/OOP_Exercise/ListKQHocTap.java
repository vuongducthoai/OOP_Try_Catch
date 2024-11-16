package _05_EXCEPTION.OOP_Exercise;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.*;

public class ListKQHocTap {
    private List<KetQuaHT> ketQuaHTList;

    public List<KetQuaHT> getKetQuaHTList() {
        return ketQuaHTList;
    }

    public void setKetQuaHTList(List<KetQuaHT> ketQuaHTList) {
        this.ketQuaHTList = ketQuaHTList;
    }

    KetQuaHT ketQuaHT = null;
    public  void printKQHocTapList() {
        System.out.printf("%-5s %-5s %-10s %-30s %-5s %-10s\n", "STT", "Id", "MSSV", "TenHP", "SoTC", "Diem");
        System.out.println("---------------------------------------------------");

        int index = 1;
        for (KetQuaHT ketQuaHT: ketQuaHTList) {
            System.out.printf("%-5s %-5s %-10s %-30s %-5s %-10s\n",
                    index++,
                    ketQuaHT.getId(),
                    ketQuaHT.getMssv(),
                    ketQuaHT.getHocPhan().getTenHP(),
                    ketQuaHT.getSoTC(),
                    ketQuaHT.getDiem()
            );
        }
    }

    public HocPhan selectHocPhan(int flag) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        ListHocPhan listHocPhan = new ListHocPhan();
        System.out.println("Danh sách các học phần");
        listHocPhan.layDanhSachHocPhan();

        if(flag == 1){
            System.out.print("Chọn STT của Học Phần để thêm KQHT: ");
        } else if(flag == 2){
            System.out.print("Chọn STT của Học Phần để sửa KQHT: ");
        } else if(flag == 3){
            System.out.print("Chọn STT của Học Phần để xóa tất cả KQHT: ");
        }else {
            System.out.print("Chọn STT của Học Phần để lấy tất cả KQHT: ");
        }

        int selectHocPhanIndex;
        do {
            selectHocPhanIndex = scanner.nextInt();
            if(selectHocPhanIndex <= 0 || selectHocPhanIndex > ketQuaHTList.size()){
                System.out.println("Vui lòng chọn lại STT hợp lệ: ");
            }
        } while (selectHocPhanIndex <= 0 || selectHocPhanIndex > listHocPhan.getListHocPhan().size());
        HocPhan selectedHocPhan = listHocPhan.getListHocPhan().get(selectHocPhanIndex - 1);
        return selectedHocPhan;
    }

    public void layDanhSachKQHocTap() throws SQLException {
        Connection conn = DbConnection.getConnection();
        ketQuaHTList = DBUtils.ketQuaHTList(conn);
        printKQHocTapList();
    }



    public void layDanhSachKQHocTapThuocHocPhan() throws SQLException {
        Connection conn = DbConnection.getConnection();
        HocPhan hocPhan = selectHocPhan(4);
        ketQuaHTList = DBUtils.layDanhSachKetQuaHTThuocHocPhan(conn, hocPhan);
        System.out.println("Danh sách các kết quả học tập thuộc Học Phần: ");
        printKQHocTapList();
    }


    public void themKqHocTap() throws SQLException {
        KetQuaHT ketQuaHT = new KetQuaHT();
        ketQuaHT.nhapKetQuaHT();
        HocPhan hocPhan = selectHocPhan(1);
        ketQuaHT.setHocPhan(hocPhan);
        Connection conn = DbConnection.getConnection();
        DBUtils.insertKQHocTap(conn, ketQuaHT);
    }


    public void suaKetQuaHT() throws SQLException {
        Connection conn = DbConnection.getConnection();
        ketQuaHT = new KetQuaHT();
        ketQuaHT.nhapKetQuaHT();
        HocPhan hocPhan = selectHocPhan(2);
        ketQuaHT.setHocPhan(hocPhan);
        DBUtils.updateKetQuaHocTap(conn, ketQuaHT);
    }



    public void xoaKqHocTap() throws SQLException {
        Scanner sc = new Scanner(System.in);
        Connection conn = DbConnection.getConnection();
        boolean flag = true;
        do {
            System.out.println("Danh sách các kết quả học tập: ");
            layDanhSachKQHocTap();
            System.out.println("Nhập mã học phần cần xóa: ");
            int id = sc.nextInt();
            KetQuaHT ketQuaHT = DBUtils.findKetQuaHT(conn, id);
            if(ketQuaHT != null){
                DBUtils.deleteKetQuaHT(conn, id);
                System.out.println("Bạn đã xóa thành công. ");
                flag = false;
            } else {
                flag = true;
                System.out.println("Mã học phần không tồn tại vui lòng nhập lại: ");
            }
        } while(flag);
    }
}
