package Toy.Studentreposit;

import Toy.StudentDomain.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.w3c.dom.stylesheets.LinkStyle;

import javax.swing.text.html.Option;
import java.lang.reflect.Member;
import java.util.List;
import java.util.Optional;

public interface SpringdataJPAreposit extends JpaRepository<Student, Long>, Studentreposit {

    @Override
    Student save(Student student);

    @Override
    Optional<Student> findByName(String name);

    @Override
    Optional<Student> findById(Long id);

    @Override
    List<Student> findAll();
}
