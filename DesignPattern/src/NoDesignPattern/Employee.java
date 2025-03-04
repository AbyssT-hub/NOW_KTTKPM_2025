package NoDesignPattern;

import java.util.Scanner;

public class Employee {
    String chucVu;

    public Employee(String chucVu) {
        this.chucVu = chucVu;
    }

    public void handleRequest() {
        switch (chucVu) {
            case "Đội trưởng":
                System.out.println("Đi Tuần()");
                System.out.println("Gán việc nhân viên()");
                // Các công việc khác của Đội trưởng
                break;
            case "Giám đốc":
                System.out.println("Xét duyệt dự án");
                System.out.println("Đưa ra quyết định chiến lược");
                // Các công việc khác của Giám đốc
                break;
            case "Nhân viên VP":
                System.out.println("Xử lý văn thư");
                System.out.println("Tiếp nhận và trả lời điện thoại");
                // Các công việc khác của Nhân viên VP
                break;
            case "Nhân viên Xưởng":
                System.out.println("Vận hành máy móc");
                System.out.println("Kiểm tra chất lượng sản phẩm");
                // Các công việc khác của Nhân viên Xưởng
                break;
            case "Kế Toán Trưởng":
                System.out.println("Lập báo cáo tài chính");
                System.out.println("Quản lý dòng tiền");
                // Các công việc khác của Kế toán trưởng
                break;
            default:
                System.out.println("Chức vụ không hợp lệ.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chức vụ nhân viên: ");
        String chucVu = scanner.nextLine();

        Employee employee = new Employee(chucVu);
        employee.handleRequest();

        scanner.close();
    }
}