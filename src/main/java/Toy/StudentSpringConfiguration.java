package Toy;

import Toy.StudentService.Studentservice;
import Toy.Studentreposit.Studentreposit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentSpringConfiguration {


    private final Studentreposit studentreposit;
@Autowired
    public StudentSpringConfiguration(Studentreposit studentreposit) {
        this.studentreposit = studentreposit;}

    @Bean
    Studentservice studentservice(){
        return new Studentservice(studentreposit);
    }



}
