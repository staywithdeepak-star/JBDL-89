package first_app_src;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstAppApplication.class, args);

        System.out.println("Inside main function....");
	}

}
