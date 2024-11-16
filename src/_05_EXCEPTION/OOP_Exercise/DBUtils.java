package _05_EXCEPTION.OOP_Exercise;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

public class DBUtils {
    public static HocPhan getHocPhan(String MaHP, Connection conn) throws SQLException {
        String sql = "SELECT * FROM HocPhan WHERE MaHP = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, MaHP);
        ResultSet rs = ps.executeQuery();
        HocPhan hocPhan = null;
        if(rs.next()) {
            hocPhan = new HocPhan(MaHP, rs.getString("MaHP"));
        }
        return hocPhan;
    }

    public static List<HocPhan> hocPhanList(Connection conn) throws SQLException {
        String sql = "SELECT * FROM HocPhan";
        PreparedStatement ps = conn.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        List<HocPhan> hocPhans = new ArrayList<>();
        while(rs.next()) {
            String maHP = rs.getString("MaHP");
            String tenHP = rs.getString("tenHP");
            hocPhans.add(new HocPhan(maHP, tenHP));
        }
        return hocPhans;
    }

    public static List<KetQuaHT> ketQuaHTList(Connection conn) throws SQLException {
        String sql = "SELECT * FROM KetQuaHT";
        PreparedStatement ps = conn.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        List<KetQuaHT> hocPhanList = new ArrayList<>();
        while(rs.next()) {
            int id = rs.getInt("Id");
            int mssv = rs.getInt("MSSV");
            int soTC = rs.getInt("soTC");
            float diem = rs.getFloat("diem");
            String maHP = rs.getString("MaHP");
            HocPhan hocPhan = getHocPhan(maHP, conn);
            KetQuaHT ketQuaHT = new KetQuaHT(id, mssv, hocPhan, soTC, diem);
            hocPhanList.add(ketQuaHT);
        }
        return hocPhanList;
    }

    public static List<KetQuaHT> layDanhSachKetQuaHTThuocHocPhan(Connection conn, HocPhan hocPhan) throws SQLException {
        String sql = "SELECT * FROM HocPhan WHERE MAHP = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, hocPhan.getMaHP());
        ResultSet rs = ps.executeQuery();
        List<KetQuaHT> ketQuaHTList = new ArrayList<>();
        while(rs.next()) {
            int id = rs.getInt("Id");
            int mssv = rs.getInt("MSSV");
            int soTC = rs.getInt("soTC");
            float diem = rs.getFloat("diem");
            KetQuaHT ketQuaHT = new KetQuaHT(id, mssv, hocPhan, soTC, diem);
            ketQuaHTList.add(ketQuaHT);
        }
        return ketQuaHTList;
    }

    public static void insertKQHocTap(Connection conn, KetQuaHT ketQuaHT) throws SQLException {
        String sql = "INSERT INTO KetQuaHT VALUES(?,?,?,?,?)";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, ketQuaHT.getId());
        ps.setInt(2, ketQuaHT.getMssv());
        ps.setString(3, ketQuaHT.getHocPhan().getMaHP());
        ps.setInt(4, ketQuaHT.getSoTC());
        ps.setFloat(5, ketQuaHT.getDiem());
        ps.executeUpdate();
    }


    public static void updateKetQuaHocTap(Connection conn, KetQuaHT ketQuaHT) throws SQLException {
        KetQuaHT ketQuaHT1 = findKetQuaHT(conn, ketQuaHT.getId());
        if(ketQuaHT1 != null) {
            String sql = "UPDATE KetQuaHT SET mssv = ?, MAHP = ? ,soTC = ?, diem = ? WHERE Id = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, ketQuaHT.getMssv());
            ps.setString(2, ketQuaHT.getHocPhan().getMaHP());
            ps.setInt(3, ketQuaHT.getSoTC());
            ps.setFloat(4, ketQuaHT.getDiem());
            ps.setInt(5, ketQuaHT.getId());
            ps.executeUpdate();
        } else{
            insertKQHocTap(conn, ketQuaHT);
        }
    }

    public static KetQuaHT findKetQuaHT(Connection conn, int Id) throws SQLException {
        String sql = "SELECT * FROM KetQuaHT WHERE Id = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, Id);
        ResultSet rs = ps.executeQuery();
        KetQuaHT ketQuaHT = null;
        if(rs.next()) {
            ketQuaHT = new KetQuaHT();
            ketQuaHT.setId(rs.getInt("Id"));
            ketQuaHT.setMssv(rs.getInt("MSSV"));
            ketQuaHT.setSoTC(rs.getInt("soTC"));
            ketQuaHT.setDiem(rs.getFloat("diem"));
            ketQuaHT.setHocPhan(new HocPhan());
        }
        return ketQuaHT;
    }


    public static void deleteKetQuaHT(Connection conn, int Id) throws SQLException {
        String sql = "DELETE FROM KetQuaHT WHERE Id = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, Id);
        ps.executeUpdate();
    }
}
