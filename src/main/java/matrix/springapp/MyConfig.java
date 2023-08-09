package matrix.springapp;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class MyConfig {
    @Bean(name = "student", initMethod = "initMethod")
    @Scope("prototype")
    public Student getStudent(@Qualifier("person") Person person){
        Student student = new Student();
        student.setId(1);
        student.setName("Imran");
        student.setSurname("Rasulzade");
      return student;
    }

    @Bean(name = "person")
    @Scope("singleton")
    public Person getPerson(){
        Person person = new Person();
        person.setId(1);
        person.setName("Ali");
        person.setSurname("Aliyev");
        return person;
    }
}

