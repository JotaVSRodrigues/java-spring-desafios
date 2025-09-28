package start_spring_io.start_spring_io;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import start_spring_io.start_spring_io.model.Contador;

@SpringBootApplication
public class StartSpringIoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StartSpringIoApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        Contador contador = new Contador();
        contador.contar(10);
    }
}
