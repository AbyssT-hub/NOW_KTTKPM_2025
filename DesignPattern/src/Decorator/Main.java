package Decorator;

//Component
interface Employee {
 void doTask();
}

//Concrete Component
class BaseEmployee implements Employee {
 private String name;
 private String position;

 public BaseEmployee(String name, String position) {
     this.name = name;
     this.position = position;
 }

 public void doTask() {
     System.out.println(name + " (" + position + ") thực hiện công việc cơ bản.");
 }
}

//Decorator
abstract class EmployeeDecorator implements Employee {
 protected Employee decoratedEmployee;

 public EmployeeDecorator(Employee decoratedEmployee) {
     this.decoratedEmployee = decoratedEmployee;
 }

 public void doTask() {
     decoratedEmployee.doTask();
 }
}

//Concrete Decorators
class DailyReportDecorator extends EmployeeDecorator {
 public DailyReportDecorator(Employee decoratedEmployee) {
     super(decoratedEmployee);
 }

 public void doTask() {
     super.doTask();
     System.out.println("... và nộp báo cáo hàng ngày.");
 }
}

class MeetingDecorator extends EmployeeDecorator {
 public MeetingDecorator(Employee decoratedEmployee) {
     super(decoratedEmployee);
 }

 public void doTask() {
     super.doTask();
     System.out.println("... và tham gia cuộc họp.");
 }
}

class TrainingDecorator extends EmployeeDecorator {
 public TrainingDecorator(Employee decoratedEmployee) {
     super(decoratedEmployee);
 }

 public void doTask() {
     super.doTask();
     System.out.println("... và tham gia khóa đào tạo kỹ năng.");
 }
}

//Main class
public class Main {
 public static void main(String[] args) {
     Employee employee = new BaseEmployee("John Doe", "Nhân viên VP");
     employee.doTask();

     Employee dailyReportEmployee = new DailyReportDecorator(employee);
     dailyReportEmployee.doTask();

     Employee meetingAndTrainingEmployee = new TrainingDecorator(new MeetingDecorator(employee));
     meetingAndTrainingEmployee.doTask();
 }
}