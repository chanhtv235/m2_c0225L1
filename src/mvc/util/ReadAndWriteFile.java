package mvc.util;



import mvc.entity.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    // ghi file
    public static void writeListToCSV(String pathFile, List<String> stringList, boolean append) {
        File file = new File(pathFile);
        // try-resource
        try (FileWriter fileWriter = new FileWriter(file, append);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);) {
            for (String line : stringList) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            System.out.println("lỗi ghi file");
        }
    }

    public static List<String> readFileCSV(String pathFile) {
        List<String> stringList = new ArrayList<>();
        File file = new File(pathFile);
        try (FileReader fileReader = new FileReader(file);
             BufferedReader bufferedReader = new BufferedReader(fileReader);) {
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                stringList.add(line);
            }
        } catch (IOException e) {
            System.out.println("lỗi ghi file");
        }
        return stringList;
    }

    public static void writeListStudentToBinaryFile(String pathFile, List<Student> studentList) {
        File file = new File(pathFile);
        try (FileOutputStream fileOutputStream = new FileOutputStream(file);
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);) {
            objectOutputStream.writeObject(studentList);
        } catch (FileNotFoundException e) {
            System.out.println("không tìm thấy file");
        } catch (IOException e) {
            System.out.println("lỗi ghi file");
            e.printStackTrace();
        }
    }
    public static List<Student> readFileBinary(String pathFile){
        List<Student> studentList = new ArrayList<>();
        File file = new File(pathFile);
        FileInputStream fileInputStream= null;
        ObjectInputStream objectInputStream= null;
        try {
             if (file.length()>0){
                 fileInputStream = new FileInputStream(file);
                 objectInputStream = new ObjectInputStream(fileInputStream);
                 studentList = (List<Student>) objectInputStream.readObject();
             }
        } catch (FileNotFoundException e) {
            System.out.println("không tìm thấy file");
        } catch (IOException e) {
            System.out.println("lỗi đọc file");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("không tìm thấy lớp");
            e.printStackTrace();
        }finally {
            try {
                objectInputStream.close();
                fileInputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return studentList;
    }
}
