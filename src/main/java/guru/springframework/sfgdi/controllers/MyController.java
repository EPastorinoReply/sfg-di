package guru.springframework.sfgdi.controllers;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {
   public String sayHello(){
       System.out.println("Hello Hell!!");

       return "Hi guyzzz!";
   }
}
