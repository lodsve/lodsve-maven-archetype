package ${package};

import com.alibaba.cloud.nacos.endpoint.NacosConfigEndpointAutoConfiguration;
import com.lodsve.boot.LodsveBootApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * web application.
 *
 * @author ${author}
 */
@SpringBootApplication(exclude = NacosConfigEndpointAutoConfiguration.class)
public class DemoApplication {
    public static void main(String[] args) {
        LodsveBootApplication.run(DemoApplication.class, args);
    }
}
