package freeMarker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * порт 8080
 *
 * @deprecated шаблон из туториала, ибо по странице открывается string из MainController
 * стандартное расширение шаблона freemarker было изменено на ftlh начиная с SpringBoot 2.2.0.
 */

@SpringBootApplication
public class DemoApplication {

  public static void main(String[] args) {
    SpringApplication.run(DemoApplication.class, args);
  }
}