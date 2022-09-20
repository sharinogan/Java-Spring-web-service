package main;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class Cashier {
    
    @RequestMapping("/get-tax")
    double cal(String engine, double cc) {
        return 1.5 * cc;
    }
    
    @RequestMapping("/cashier/number")
    int showNumber () {
        return 123;
    }
    
    @RequestMapping("/cashier/all")
    String[] showAll () {
        String[] data = { "Gun", "Tom", "Jerry", "Mark" };
        return data;
    }
}

// Spring Stereotype
// @Service          @Reposity            @Component
// @Index
// @Controller       @RestController