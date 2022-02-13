package go.boot.applicationproperties.gobootappprop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@SpringBootApplication
@PropertySource("classpath:application.properties")
//@EnableConfigurationProperties(AppCtorConfig.class)
//@ConfigurationPropertiesScan(AppCtorConfig.class)
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

		System.out.println("-------------- configuration ");
		AppConfiguration appConfiguration = ctx.getBean(AppConfiguration.class);
		System.out.println("appConfiguration username : " + appConfiguration.getUsername());
		System.out.println("appConfiguration password : " + appConfiguration.getPassword());

		System.out.println("-------------- ctor config (not working)");
//		AppConfiguration appCtorConfig = ctx.getEnvironment(AppCtorConfig.class);
//		System.out.println("appCtorConfig username : " + appCtorConfig.getUsername());
//		System.out.println("appCtorConfig password : " + appCtorConfig.getPassword());

	}

}
