package ss19;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // viết regex kiểm tra tên học
        String regexClasName = "^C((0[1-9])|(1[0-2]))\\d{2}[GL][1-9]-JV10[13]$";
        System.out.println("nhập tên lớp");
        String className = scanner.nextLine();
        System.out.println(className.matches(regexClasName));

    }
}
