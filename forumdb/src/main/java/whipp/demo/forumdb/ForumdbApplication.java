package whipp.demo.forumdb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableEurekaClient
public class ForumdbApplication {

	public static void main(String[] args) {
		SpringApplication.run(ForumdbApplication.class, args);
	}

}
