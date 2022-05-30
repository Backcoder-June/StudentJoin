package Toy.Studentreposit;

import Toy.StudentDomain.Student;

import java.util.List;
import java.util.Optional;

public interface Studentreposit {

    Student save(Student student);

    Optional<Student> findByName(String name);

    Optional<Student> findById(Long id);

    List<Student> findAll();

}
