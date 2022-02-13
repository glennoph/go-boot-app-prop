# spring boot access application properties

## how to access properites from application main

```java
ConfigurableApplicationContext ctx =
	SpringApplication.run(GoBootAppPropApplication.class, args);

String username = ctx.getEnvironment().getProperty("username");
System.out.println("=>>>> " + username);
```

* see [application](src/main/java/go/boot/applicationproperties/gobootappprop/GoBootAppPropApplication.java)

* also see [profile scanner](src/main/java/go/boot/applicationproperties/gobootappprop/ProfileScannerBean.java)

## application.properties

* see [application.properties](src/main/resources/application.properties)
