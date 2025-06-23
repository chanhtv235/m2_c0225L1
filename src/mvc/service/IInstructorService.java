package mvc.service;

import mvc.entity.Instructor;

import java.util.List;

public interface IInstructorService {
    List<Instructor> findAll();
    void add(Instructor instructor);
    boolean deleteById(int id);
}
