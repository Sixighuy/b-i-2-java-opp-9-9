import java.util.Scanner;

public class TaiKhoan {
    private String soTaiKhoan;
    private String tenChuTaiKhoan;
    private double soDu;

    // Biến tĩnh: lãi suất năm (áp dụng chung cho mọi tài khoản)
    private static double laiSuatNam = 0.05; // 5% mặc định

    // Constructor
    public TaiKhoan(String soTaiKhoan, String tenChuTaiKhoan, double soDu) {
        this.soTaiKhoan = soTaiKhoan;
        this.tenChuTaiKhoan = tenChuTaiKhoan;
        this.soDu = soDu;
    }

    // ===== Các phương thức =====
    // Nạp tiền
    public void napTien(double soTien) {
        if (soTien > 0) {
            soDu += soTien;
            System.out.println("Nạp thành công " + soTien + " vào tài khoản " + soTaiKhoan);
        } else {
            System.out.println("Số tiền nạp phải lớn hơn 0!");
        }
    }

    // Rút tiền
    public void rutTien(double soTien) {
        if (soTien > 0 && soTien <= soDu) {
            soDu -= soTien;
            System.out.println("Rút thành công " + soTien + " từ tài khoản " + soTaiKhoan);
        } else {
            System.out.println("Số dư không đủ hoặc số tiền rút không hợp lệ!");
        }
    }

    // Tính lãi một tháng
    public void tinhLaiMotThang() {
        double tienLai = soDu * (laiSuatNam / 12);
        soDu += tienLai;
        System.out.println("Tài khoản " + soTaiKhoan + " đã được cộng lãi " + tienLai);
    }

    // Hiển thị thông tin tài khoản
    public void hienThiThongTin() {
        System.out.printf("Số TK: %s | Chủ TK: %s | Số dư: %.2f\n",
                soTaiKhoan, tenChuTaiKhoan, soDu);
    }

    // ====== Phương thức tĩnh ======
    // Thay đổi lãi suất
    public static void thayDoiLaiSuat(double laiSuatMoi) {
        if (laiSuatMoi >= 0) {
            laiSuatNam = laiSuatMoi;
            System.out.println("Lãi suất đã được cập nhật thành: " + (laiSuatNam * 100) + "%/năm");
        } else {
            System.out.println("Lãi suất không hợp lệ!");
        }
    }

    // Hiển thị lãi suất hiện tại
    public static void hienThiLaiSuat() {
        System.out.println("Lãi suất hiện tại: " + (laiSuatNam * 100) + "%/năm");
    }

    // Getter để phục vụ tìm kiếm & sắp xếp
    public String getSoTaiKhoan() {
        return soTaiKhoan;
    }

    public double getSoDu() {
        return soDu;
    }
}

