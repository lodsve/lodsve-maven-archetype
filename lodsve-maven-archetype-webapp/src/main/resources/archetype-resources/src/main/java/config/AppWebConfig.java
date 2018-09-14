package ${package}.config;

import lodsve.web.mvc.annotation.EnableLodsveMvc;
import lodsve.web.springfox.annotations.EnableSpringFox;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.data.web.config.EnableSpringDataWebSupport;

/**
 * .
 *
 * @author ${author}
 */
@Configuration
@EnableLodsveMvc
@EnableSpringFox(prefix = "/rest")
@EnableSpringDataWebSupport
@ComponentScan("${package}.rest")
@ImportResource({"classpath*:/META-INF/springWeb/*.xml"})
public class AppWebConfig {
}