package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

		System.out.println("Controller");
		MyController myController = (MyController) ctx.getBean("myController");
		String greeting = myController.sayHello();
		System.out.println(greeting);

		System.out.println("Property Injection");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("Setter Injection");
		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("Constructor Injection");
		ConstructionInjectedController constructionInjectedController = (ConstructionInjectedController) ctx.getBean("constructionInjectedController");
		System.out.println(constructionInjectedController.getGreeting());

		System.out.println("Profile");
		I18nController i18nController = (I18nController) ctx.getBean("i18nController");;
		System.out.println(i18nController.sayHello());

		System.out.println("Pet:");
		PetController petController = (PetController) ctx.getBean("petController");
		System.out.println(petController.revealPet());

	}

}
