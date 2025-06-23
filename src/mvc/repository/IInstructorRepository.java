package mvc.repository;

import mvc.entity.Instructor;

import java.util.List;

public interface IInstructorRepository {
    List<Instructor> findAll();
    void add(Instructor instructor);
    boolean deleteById(int id);

}
