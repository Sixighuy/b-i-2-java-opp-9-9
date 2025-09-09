import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<TaiKhoan> danhSachTaiKhoan = new ArrayList<>();


        danhSachTaiKhoan.add(new TaiKhoan("TK001", "Nguyen Van A", 5000));
        danhSachTaiKhoan.add(new TaiKhoan("TK002", "Le Thi B", 3000));
        danhSachTaiKhoan.add(new TaiKhoan("TK003", "Tran Van C", 7000));

        System.out.println(" Danh sách tài khoản ban đầu ");
        for (TaiKhoan tk : danhSachTaiKhoan) {
            tk.hienThiThongTin();
        }

        System.out.println("\ Thực hiện giao dịch ");
        
        danhSachTaiKhoan.get(0).napTien(2000);

        danhSachTaiKhoan.get(1).rutTien(1000);

        System.out.println("\nTính lãi cho tất cả tài khoản:");
        for (TaiKhoan tk : danhSachTaiKhoan) {
            tk.tinhLaiMotThang();
        }


        TaiKhoan.hienThiLaiSuat();
        TaiKhoan.thayDoiLaiSuat(0.06);
        System.out.println("\n Danh sách tài khoản sau khi xử lý ")
        for (TaiKhoan tk : danhSachTaiKhoan) {
            tk.hienThiThongTin();
        }

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

        danhSachTaiKhoan.sort((a, b) -> Double.compare(b.getSoDu(), a.getSoDu()));

        System.out.println("\n Danh sách tài khoản sắp xếp theo số dư giảm dần ");
        for (TaiKhoan tk : danhSachTaiKhoan) {
            tk.hienThiThongTin();
        }
    }
}


