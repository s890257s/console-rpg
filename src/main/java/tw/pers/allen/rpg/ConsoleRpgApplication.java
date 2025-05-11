package tw.pers.allen.rpg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import tw.pers.allen.rpg.initialize.Init;

@SpringBootApplication
public class ConsoleRpgApplication {

	public static void main(String[] args) throws Exception {
		Init.createDatabaseIfNotExist();

		SpringApplication.run(ConsoleRpgApplication.class, args);
	}

}
