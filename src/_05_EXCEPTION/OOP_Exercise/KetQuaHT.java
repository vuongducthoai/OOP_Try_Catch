package _05_EXCEPTION.OOP_Exercise;

import java.util.Scanner;

public class KetQuaHT {
    private int Id;
    private int mssv;
    private HocPhan hocPhan;
    private int soTC;
    private float diem;

    public KetQuaHT(int id, int mssv, HocPhan hocPhan, int soTC, float diem) {
        Id = id;
        this.mssv = mssv;
        this.hocPhan = hocPhan;
        this.soTC = soTC;
        this.diem = diem;
    }

    public KetQuaHT() {
    }

    public void nhapKetQuaHT() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã kết quả học tập: ");
        this.Id = sc.nextInt();
        System.out.println("Nhập MSSV: ");
        this.mssv = sc.nextInt();
        System.out.println("Nhập số tín chỉ");
        this.soTC = sc.nextInt();
        System.out.println("Nhập điểm: ");
        this.diem = sc.nextFloat();
    }

    public void xuatKetQuaHT() {
        System.out.println("Id: " + this.getId() + "\tMSSV: " + this.getMssv() + "\tSoTC: " + this.getSoTC() + "\tDiem: " + this.getDiem());
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getMssv() {
        return mssv;
    }

    public void setMssv(int mssv) {
        this.mssv = mssv;
    }

    public HocPhan getHocPhan() {
        return hocPhan;
    }

    public void setHocPhan(HocPhan hocPhan) {
        this.hocPhan = hocPhan;
    }

    public int getSoTC() {
        return soTC;
    }

    public void setSoTC(int soTC) {
        this.soTC = soTC;
    }

    public float getDiem() {
        return diem;
    }

    public void setDiem(float diem) {
        this.diem = diem;
    }
}
