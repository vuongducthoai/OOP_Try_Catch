package _05_EXCEPTION.OOP_Exercise;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.*;

public class ListHocPhan {
    private List<HocPhan> listHocPhan;

    public List<HocPhan> getListHocPhan() {
        return listHocPhan;
    }

    public void setListHocPhan(List<HocPhan> listHocPhan) {
        this.listHocPhan = listHocPhan;
    }

    public void layDanhSachHocPhan() throws SQLException {
        Connection connection = DbConnection.getConnection();
        listHocPhan = DBUtils.hocPhanList(connection);
        System.out.printf("%-5s %-15s %-25s\n", "STT", "MAHP", "TenHP");
        System.out.println("------------------------------------------");

        int index = 1;
        for (HocPhan hocPhan : listHocPhan) {
            System.out.printf("%-5s %-15s %-25s\n",
                    index++,
                    hocPhan.getMaHP(),
                    hocPhan.getTenHP()
                    );
        }
    }
}
