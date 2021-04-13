package spring.conf;

import lang.Language;
import lang.Vietnamese;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"spring.bean"})
public class AppConfiguration {

  @Bean(name = "language")
  public Language getLanguage() {
    return new Vietnamese();
  }

}