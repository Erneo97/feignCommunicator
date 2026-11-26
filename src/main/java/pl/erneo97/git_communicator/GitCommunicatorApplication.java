package pl.erneo97.git_communicator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class GitCommunicatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(GitCommunicatorApplication.class, args);
	}

}
