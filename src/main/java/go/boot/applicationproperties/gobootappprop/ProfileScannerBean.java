package go.boot.applicationproperties.gobootappprop;

import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Arrays;

@Component
public class ProfileScannerBean {

    private Environment environment;
    private String username;
    private String password;

    ProfileScannerBean(Environment environment) {
        this.environment = environment;
    }

    @PostConstruct
    void postConstruct() {
        String[] activeProfiles = environment.getActiveProfiles();
        System.out.println("ProfileScannerBean.postConstruct active profiles: "
        + Arrays.toString(activeProfiles));
        username = environment.getProperty("username");
        password = environment.getProperty("password");

        System.out.println("usernane : " + username);
        System.out.println("password : " + password);
    }

}
