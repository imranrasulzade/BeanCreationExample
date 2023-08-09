package matrix.springapp;

import org.springframework.boot.ApplicationContextFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;

@SpringBootApplication
public class SpringAppApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringAppApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        Student student = (Student) context.getBean("student");
        Student student2 = (Student) context.getBean("student");

        Person person = (Person) context.getBean("person");
        Person person2 = (Person) context.getBean("person");

        student2.setName("Imran2");

        person2.setName("Fehruz2");

        System.out.println(student.getId());
        System.out.println(student.getName());
        System.out.println(student.getSurname());

        System.out.println(person.getId());
        System.out.println(person.getName());
        System.out.println(person.getSurname());


        System.out.println("===================================");

        ApplicationContext context1 = new AnnotationConfigApplicationContext(MyConfig.class);
        Student student3 = (Student) context1.getBean("student");
        Person person3 = (Person) context1.getBean("person");

        Student student4 = (Student) context1.getBean("student");
        Person person4 = (Person) context1.getBean("person");

        student4.setName("IMRANNNN");
        person4.setName("ALLLIIII");

        System.out.println(student3.getId());
        System.out.println(student3.getName());
        System.out.println(student3.getSurname());

        System.out.println(person3.getId());
        System.out.println(person3.getName());
        System.out.println(person3.getSurname());

    }
}
