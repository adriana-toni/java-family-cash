package guavas.cashcard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;

@SpringBootApplication
public class CashCardApplication {

	public static void main(String[] args) {
		SpringApplication.run(CashCardApplication.class, args);
	}

}
