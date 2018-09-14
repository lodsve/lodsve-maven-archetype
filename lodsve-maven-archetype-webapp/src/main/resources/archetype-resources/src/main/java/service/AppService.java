package ${package}.service;

import org.springframework.stereotype.Service;
import ${package}.domain.App;

/**
 * .
 *
 * @author ${author}
 */
@Service
public class AppService {
    public App getApp(String appName) {
        App app = new App();
        app.setAppName("App");

        return app;
    }
}