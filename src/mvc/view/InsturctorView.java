package mvc.view;

import mvc.entity.Instructor;
import mvc.entity.Student;

import java.util.List;
import java.util.Scanner;

public class InsturctorView {
    private static Scanner scanner = new Scanner(System.in);
    // nơi hiển thị hoặc nhập liêu
    public static void display(List<Instructor> instructorList){
        for (Instructor instructor: instructorList) {
            System.out.println(instructor);
        }
    }
    public static Instructor inputData(){
        System.out.println("Nhập Mã");
        long code = Long.parseLong(scanner.nextLine());
        System.out.println("Nhập Tên");
        String name = scanner.nextLine();
        System.out.println("Nhập Địa chỉ");
        String address = scanner.nextLine();
        System.out.println("Nhập Luong");
        float salary = Float.parseFloat(scanner.nextLine());

        return  new Instructor(code,name,address,salary);
    }
}
