package ${package}.config;

import lodsve.web.webservice.EnableWebService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * .
 *
 * @author ${author}
 */
@Configuration
@EnableWebService
@ComponentScan(value = {"${package}.service"})
@ImportResource({"classpath*:/META-INF/spring/*.xml"})
public class AppConfig {

}