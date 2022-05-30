package Toy.StudentService;

import Toy.StudentDomain.Student;
import Toy.Studentreposit.Studentreposit;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public class Studentservice {

    private final Studentreposit studentreposit;


    public Studentservice(Studentreposit studentreposit) {
        this.studentreposit = studentreposit;}


    public Long Join(Student student){

        samestudent(student);
        studentreposit.save(student);
        return student.getId();
    }

    private void samestudent(Student student){
        studentreposit.findByName(student.getName()).ifPresent(student1 ->
        {throw new IllegalStateException("이미 존재");});
    }

    public List<Student> findmembers(){
        return studentreposit.findAll();}





}
