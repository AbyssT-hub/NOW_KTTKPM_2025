package State;

//Interface State (trạng thái)
interface EmployeeState {
 void handleRequest();
}

//Concrete States (các trạng thái cụ thể)
class TeamLeaderState implements EmployeeState {
 public void handleRequest() {
     System.out.println("Đi Tuần()");
     System.out.println("Gán việc nhân viên()");
     // Các công việc khác của Đội trưởng
 }
}

class DirectorState implements EmployeeState {
 public void handleRequest() {
     System.out.println("Xét duyệt dự án");
     System.out.println("Đưa ra quyết định chiến lược");
     // Các công việc khác của Giám đốc
 }
}

class OfficeWorkerState implements EmployeeState {
 public void handleRequest() {
     System.out.println("Xử lý văn thư");
     System.out.println("Tiếp nhận và trả lời điện thoại");
     // Các công việc khác của Nhân viên VP
 }
}

class FactoryWorkerState implements EmployeeState {
 public void handleRequest() {
     System.out.println("Vận hành máy móc");
     System.out.println("Kiểm tra chất lượng sản phẩm");
     // Các công việc khác của Nhân viên Xưởng
 }
}

class ChiefAccountantState implements EmployeeState {
 public void handleRequest() {
     System.out.println("Lập báo cáo tài chính");
     System.out.println("Quản lý dòng tiền");
     // Các công việc khác của Kế toán trưởng
 }
}

//Context (đối tượng chứa trạng thái)
class Employee {
 private EmployeeState state;

 public Employee(EmployeeState state) {
     this.state = state;
 }

 public void setState(EmployeeState state) {
     this.state = state;
 }

 public void handleRequest() {
     state.handleRequest();
 }
}

//Main class
public class Main {
 public static void main(String[] args) {
     // Tạo đối tượng nhân viên với trạng thái Đội trưởng
     Employee employee = new Employee(new TeamLeaderState());
     employee.handleRequest();

     // Thay đổi trạng thái thành Giám đốc
     employee.setState(new DirectorState());
     employee.handleRequest();
 }
}
