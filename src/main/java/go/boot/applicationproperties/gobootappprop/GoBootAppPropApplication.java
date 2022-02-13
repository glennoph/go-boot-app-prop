package go.boot.applicationproperties.gobootappprop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@SpringBootApplication
@PropertySource("classpath:application.properties")
public class GoBootAppPropApplication {




//	@Value("${spring.profiles.active}") // dft value ''
//	private static String activeProfile;

//	@Value("${username:default}")
//	private static String username ;




	public static void main(String[] args) {
		ConfigurableApplicationContext ctx =
				SpringApplication.run(GoBootAppPropApplication.class, args);

		String username = ctx.getEnvironment().getProperty("username");
		System.out.println("=>>>> " + username);

	}

}
