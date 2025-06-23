package mvc.repository;

import mvc.entity.Instructor;
import mvc.entity.Student;
import mvc.util.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;

public class InstructorRepository implements IInstructorRepository{
    private final String INSTRUCTOR_FILE ="src/mvc/data/instructor.csv";
    @Override
    public List<Instructor> findAll() {
        List<Instructor> instructorList = new ArrayList<>();

        List<String> stringList = ReadAndWriteFile.readFileCSV(INSTRUCTOR_FILE);
        String[] array =null;
        for (String line: stringList) {
            array = line.split(",");
            Instructor instructor = new Instructor(Long.parseLong(array[0]),array[1],array[2],
                                           Float.parseFloat(array[3]));
            instructorList.add(instructor);
        }
        return instructorList;
    }

    @Override
    public void add(Instructor instructor) {
        // ghi file text
        List<String> stringList = new ArrayList<>();
        stringList.add(instructor.getInfoToCSV());
        ReadAndWriteFile.writeListToCSV(INSTRUCTOR_FILE,stringList,true);
    }

    @Override
    public boolean deleteById(int id) {
        return false;
    }
}
