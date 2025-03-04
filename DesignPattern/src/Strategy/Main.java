package Strategy;

//Interface Strategy (chiến lược)
interface WorkStrategy {
 void execute();
}

//Concrete Strategies (các chiến lược cụ thể)
class TeamLeaderStrategy implements WorkStrategy {
 public void execute() {
     System.out.println("Đi Tuần()");
     System.out.println("Gán việc nhân viên()");
     // Các công việc khác của Đội trưởng
 }
}

class DirectorStrategy implements WorkStrategy {
 public void execute() {
     System.out.println("Xét duyệt dự án");
     System.out.println("Đưa ra quyết định chiến lược");
     // Các công việc khác của Giám đốc
 }
}

class OfficeWorkerStrategy implements WorkStrategy {
 public void execute() {
     System.out.println("Xử lý văn thư");
     System.out.println("Tiếp nhận và trả lời điện thoại");
     // Các công việc khác của Nhân viên VP
 }
}

class FactoryWorkerStrategy implements WorkStrategy {
 public void execute() {
     System.out.println("Vận hành máy móc");
     System.out.println("Kiểm tra chất lượng sản phẩm");
     // Các công việc khác của Nhân viên Xưởng
 }
}

class ChiefAccountantStrategy implements WorkStrategy {
 public void execute() {
     System.out.println("Lập báo cáo tài chính");
     System.out.println("Quản lý dòng tiền");
     // Các công việc khác của Kế toán trưởng
 }
}

//Context (đối tượng chứa chiến lược)
class Employee {
 private WorkStrategy workStrategy;

 public Employee(WorkStrategy workStrategy) {
     this.workStrategy = workStrategy;
 }

 public void setWorkStrategy(WorkStrategy workStrategy) {
     this.workStrategy = workStrategy;
 }

 public void performWork() {
     workStrategy.execute();
 }
}

//Main class
public class Main {
 public static void main(String[] args) {
     // Tạo đối tượng nhân viên với chiến lược của Đội trưởng
     Employee employee = new Employee(new TeamLeaderStrategy());
     employee.performWork();

     // Thay đổi chiến lược thành Giám đốc
     employee.setWorkStrategy(new DirectorStrategy());
     employee.performWork();
 }
}