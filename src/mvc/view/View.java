package mvc.view;

import mvc.controller.InstructorController;
import mvc.controller.StudentController;
import mvc.entity.Student;

import java.util.List;
import java.util.Scanner;

public class View {
    public static void main(String[] args) {
        StudentController studentController = new StudentController();
        InstructorController instructorController = new InstructorController();
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("Chọn chức năng quản lý:\n" +
                    "1. Quản lý sinh viên\n" +
                    "2. Quản lý giá viên\n" +
                    "5. Thoát\n");
            System.out.println("Chọn chức năng: \n");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    studentController.displayMenu();
                    break;
                case 2:
                    instructorController.displayMenu();
                    break;
                default:
                    flag = false;
            }
        }
    }

}
