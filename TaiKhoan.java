import java.util.Scanner;

public class TaiKhoan {
    private String soTaiKhoan;
    private String tenChuTaiKhoan;
    private double soDu;

    private static double laiSuatNam = 0.05; 


    public TaiKhoan(String soTaiKhoan, String tenChuTaiKhoan, double soDu) {
        this.soTaiKhoan = soTaiKhoan;
        this.tenChuTaiKhoan = tenChuTaiKhoan;
        this.soDu = soDu;
    }


    public void napTien(double soTien) {
        if (soTien > 0) {
            soDu += soTien;
            System.out.println("Nạp thành công " + soTien + " vào tài khoản " + soTaiKhoan);
        } else {
            System.out.println("Số tiền nạp phải lớn hơn 0!");
        }
    }


    public void rutTien(double soTien) {
        if (soTien > 0 && soTien <= soDu) {
            soDu -= soTien;
            System.out.println("Rút thành công " + soTien + " từ tài khoản " + soTaiKhoan);
        } else {
            System.out.println("Số dư không đủ hoặc số tiền rút không hợp lệ!");
        }
    }


    public void tinhLaiMotThang() {
        double tienLai = soDu * (laiSuatNam / 12);
        soDu += tienLai;
        System.out.println("Tài khoản " + soTaiKhoan + " đã được cộng lãi " + tienLai);
    }

    public void hienThiThongTin() {
        System.out.printf("Số TK: %s | Chủ TK: %s | Số dư: %.2f\n",
                soTaiKhoan, tenChuTaiKhoan, soDu);
    }


    public static void thayDoiLaiSuat(double laiSuatMoi) {
        if (laiSuatMoi >= 0) {
            laiSuatNam = laiSuatMoi;
            System.out.println("Lãi suất đã được cập nhật thành: " + (laiSuatNam * 100) + "%/năm");
        } else {
            System.out.println("Lãi suất không hợp lệ!");
        }
    }

    public static void hienThiLaiSuat() {
        System.out.println("Lãi suất hiện tại: " + (laiSuatNam * 100) + "%/năm");
    }

    public String getSoTaiKhoan() {
        return soTaiKhoan;
    }

    public double getSoDu() {
        return soDu;
    }
}


