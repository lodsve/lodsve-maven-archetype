package ${package};

import com.lodsve.boot.LodsveBootApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * web application.
 *
 * @author ${author}
 */
@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) {
        LodsveBootApplication.run(DemoApplication.class, args);
    }
}
