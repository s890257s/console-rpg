package tw.pers.allen.rpg;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import tw.pers.allen.rpg.initialize.Init;
import tw.pers.allen.rpg.service.GameService;
import tw.pers.allen.rpg.utils.ConsoleUtil;

@SpringBootApplication
public class ConsoleRpgApplication implements CommandLineRunner {

	public static void main(String[] args) throws Exception {
		Init.createDatabaseIfNotExist();

		SpringApplication.run(ConsoleRpgApplication.class, args);
	}

	private final GameService gameService;

	public ConsoleRpgApplication(GameService gameService) {
		this.gameService = gameService;
	}

	@Override
	public void run(String... args) throws Exception {

		gameService.start();
		ConsoleUtil.close();
		System.exit(0);

	}

}
