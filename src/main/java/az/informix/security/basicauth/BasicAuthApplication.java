package az.informix.security.basicauth;

import az.informix.security.basicauth.dao.CreateUserRequest;
import az.informix.security.basicauth.model.Role;
import az.informix.security.basicauth.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Set;

@SpringBootApplication
public class BasicAuthApplication implements CommandLineRunner {

	private final UserService userService;

	public BasicAuthApplication(UserService userService) {
		this.userService = userService;
	}

	public static void main(String[] args) {
		SpringApplication.run(BasicAuthApplication.class, args);
	}
	private void createDummyData(){
		CreateUserRequest request = CreateUserRequest.builder()
				.name("Emin")
				.username("emin")
				.password("pass")
				.authorities(Set.of(Role.ROLE_USER))
				.build();
		userService.createUser(request);
		CreateUserRequest request2 = CreateUserRequest.builder()
				.name("FSK")
				.username("fsk")
				.password("pass")
				.authorities(Set.of(Role.ROLE_FSK))
				.build();
		userService.createUser(request2);
		CreateUserRequest request3 = CreateUserRequest.builder()
				.name("No name")
				.username("noname")
				.password("pass")
				.authorities(Set.of(Role.ROLE_ADMIN))
				.build();
		userService.createUser(request3);

	}

	@Override
	public void run(String... args) throws Exception {
		createDummyData();
	}
}
