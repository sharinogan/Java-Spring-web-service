package main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

class Start {
    public static void main(String[] data) {
        ApplicationContext context;
        context = SpringApplication.run(Setup.class);
        String s = context.getBean(String.class);
        System.out.println(s);
        SpringApplication.exit(context);
    }
}

// class Setup is use for create bean
@SpringBootApplication
class Setup {
    @Bean
    String city(Integer k) {
        return "London" + k;
    }
    
    @Bean
    Integer code() {
        return 806;
    }
}

@RestController
class Sample {
    @RequestMapping("/check")
    String show() {
        return "I love you";
    }
}