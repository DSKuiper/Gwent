package gwent.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication (scanBasePackages = "gwent")
public class ApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
	}


	/*private static ResourceConfig createResources() {
		// Create the dependencies we want to inject
		IMancalaFactory factory = new MancalaFactory();
		IMancalaRepository repository = new MancalaRepository();
		// Create the MancalaController and inject the dependencies
		MancalaController mancalaController = new MancalaController(factory, repository);
		// Register our MancalaController
		return new ResourceConfig().register(mancalaController);
		// Note: Jetty (and most other frameworks) can also handle Dependency
		// Injection and registering controllers automatically.
	}*/
}
