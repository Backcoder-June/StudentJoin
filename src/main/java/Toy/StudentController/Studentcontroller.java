package Toy.StudentController;

import Toy.StudentDomain.Student;
import Toy.StudentService.Studentservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class Studentcontroller {

    private final Studentservice studentservice;
@Autowired
    public Studentcontroller(Studentservice studentservice) {
        this.studentservice = studentservice;
    }


    @GetMapping("/students/new")
    public String joinPage() {
        return "student/joinpage";
    }

    @PostMapping("/students/new")
    public String Runjoin(studentform stname){
        Student student = new Student();
        student.setName(stname.getName());
        studentservice.Join(student);
        return "redirect:/";   }


    @GetMapping("/students")
    public String whole(Model model){
        List<Student> allmembers = studentservice.findmembers();
        model.addAttribute("students", allmembers);
        return "student/students";}



}
