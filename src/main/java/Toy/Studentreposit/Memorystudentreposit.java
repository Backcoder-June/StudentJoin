package Toy.Studentreposit;

import Toy.StudentDomain.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

//public class Memorystudentreposit implements Studentreposit{

    /*private long sequence = 0;
    private HashMap<Long, Student> store = new HashMap<>();

    @Override
    public Student save(Student student) {

        student.setId(++sequence);

        store.put(student.getId(), student);
        return student;
    }

    @Override
    public Optional<Student> findByName(String name) {
        return store.values().stream().filter(student -> student.getName().equals(name)).findAny();
    }

    @Override
    public Optional<Student> findById(Long id) {
        return Optional.ofNullable(store.get(id));
    }

    @Override
    public List<Student> findAll() {
        return new ArrayList<Student>(store.values());
    }*/
//}
