package nl.sogyo.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
	}

	//TODO controller, factory and repo needs to be made at the start
	private static ResourceConfig createResources() {
		// Create the dependencies we want to inject
		IMancalaFactory factory = new MancalaFactory();
		IMancalaRepository repository = new MancalaRepository();
		// Create the MancalaController and inject the dependencies
		MancalaController mancalaController = new MancalaController(factory, repository);
		// Register our MancalaController
		return new ResourceConfig().register(mancalaController);
		// Note: Jetty (and most other frameworks) can also handle Dependency
		// Injection and registering controllers automatically.
	}
}
