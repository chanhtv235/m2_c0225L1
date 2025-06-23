package mvc.view;

import mvc.entity.Student;
import mvc.regex.CheckRegexStudent;

import java.util.List;
import java.util.Scanner;

public class StudentView {
    private static Scanner scanner = new Scanner(System.in);
    // nơi hiển thị hoặc nhập liêu
    public static void display(List<Student> studentList){
        for (Student student: studentList) {
            System.out.println(student);
        }
    }
    public static Student inputData(){
        System.out.println("Nhập Mã");
        long code = Long.parseLong(scanner.nextLine());
        System.out.println("Nhập Tên");
        String name = scanner.nextLine();
        System.out.println("Nhập Địa chỉ");
        String address = scanner.nextLine();
        System.out.println("Nhập Điểm");
        int point = Integer.parseInt(scanner.nextLine());
        String className ="";
        do {
            System.out.println("Nhập Tên Lớp");
            className = scanner.nextLine();
        }while (!CheckRegexStudent.checkClasName(className));

        return  new Student(code,name,address,point,className);
    }
}
