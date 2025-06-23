package mvc.service;

import mvc.entity.Instructor;
import mvc.repository.IInstructorRepository;
import mvc.repository.InstructorRepository;

import java.util.List;

public class InstructorService implements IInstructorService{
    private IInstructorRepository instructorRepository = new InstructorRepository();
    @Override
    public List<Instructor> findAll() {
        return instructorRepository.findAll();
    }

    @Override
    public void add(Instructor instructor) {
     instructorRepository.add(instructor);
    }

    @Override
    public boolean deleteById(int id) {
        return instructorRepository.deleteById(id);
    }
}
