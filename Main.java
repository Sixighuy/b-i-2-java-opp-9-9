import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Danh sách các tài khoản
        ArrayList<TaiKhoan> danhSachTaiKhoan = new ArrayList<>();

        // Tạo một số tài khoản mẫu
        danhSachTaiKhoan.add(new TaiKhoan("TK001", "Nguyen Van A", 5000));
        danhSachTaiKhoan.add(new TaiKhoan("TK002", "Le Thi B", 3000));
        danhSachTaiKhoan.add(new TaiKhoan("TK003", "Tran Van C", 7000));

        System.out.println("=== Danh sách tài khoản ban đầu ===");
        for (TaiKhoan tk : danhSachTaiKhoan) {
            tk.hienThiThongTin();
        }

        System.out.println("\n=== Thực hiện giao dịch ===");
        // Nạp tiền
        danhSachTaiKhoan.get(0).napTien(2000);

        // Rút tiền
        danhSachTaiKhoan.get(1).rutTien(1000);

        // Tính lãi cho tất cả tài khoản
        System.out.println("\nTính lãi cho tất cả tài khoản:");
        for (TaiKhoan tk : danhSachTaiKhoan) {
            tk.tinhLaiMotThang();
        }

        // Hiển thị lãi suất hiện tại
        TaiKhoan.hienThiLaiSuat();

        // Thay đổi lãi suất
        TaiKhoan.thayDoiLaiSuat(0.06);

        // Hiển thị danh sách tài khoản sau khi xử lý
        System.out.println("\n=== Danh sách tài khoản sau khi xử lý ===");
        for (TaiKhoan tk : danhSachTaiKhoan) {
            tk.hienThiThongTin();
        }

        // Tìm kiếm tài khoản theo số tài khoản
        System.out.println("\nNhập số tài khoản cần tìm: ");
        String timSoTK = sc.nextLine();
        boolean timThay = false;
        for (TaiKhoan tk : danhSachTaiKhoan) {
            if (tk.getSoTaiKhoan().equalsIgnoreCase(timSoTK)) {
                System.out.println("Thông tin tài khoản tìm thấy:");
                tk.hienThiThongTin();
                timThay = true;
                break;
            }
        }
        if (!timThay) {
            System.out.println("Không tìm thấy tài khoản có số: " + timSoTK);
        }

        // Sắp xếp tài khoản theo số dư giảm dần
        danhSachTaiKhoan.sort((a, b) -> Double.compare(b.getSoDu(), a.getSoDu()));

        System.out.println("\n=== Danh sách tài khoản sắp xếp theo số dư giảm dần ===");
        for (TaiKhoan tk : danhSachTaiKhoan) {
            tk.hienThiThongTin();
        }
    }
}

