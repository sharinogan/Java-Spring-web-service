package main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

class Start {
    public static void main(String[] data) {
        ApplicationContext context;
        context = SpringApplication.run(Setup.class);
        
        //SpringApplication.exit(context);
    }
}

// class Setup is use for create bean
@SpringBootApplication
class Setup {
    
    @Bean
    String first() {
        return "Frank Lampard";
    }
    
    @Bean
    Manager manager() {
        Manager m = new Manager();
        m.setName("Stephen Gerrard");      // it can set directly, but want to show Property Injection
        m.setSalary(47000);
        return m;
    }
}

@RestController
class Sample {
    
    @RequestMapping("/check")
    String show() {
        return "I love you ";
    }
    
    Manager manager;
    @Autowired
    public void setManager( Manager m) {
        manager = m;
        System.out.println(manager.getName());
    }
}


class Manager {
    double salary;          // This is a field, not property in Spring
    String name;            // This is a field
    
    public void setSalary(double x) {
        salary = x;         // Writable property
    }
    
    public double getSalary() {
        return salary;      // Readable property
    }
    
    public void setName(String x) {
        name = x;           // Writable property
    }
    
    public String getName() {
        return name;        // Readable property
    }
}