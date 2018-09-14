package ${package}.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * .
 *
 * @author ${author}
 */
@ApiModel(description = "App")
public class App implements Serializable {
    private String appName;

    @ApiModelProperty(value = "App Name", required = true)
    public String getAppName() {
        return appName;
    }

    @ApiModelProperty(value = "App Name", required = true)
    public void setAppName(String appName) {
        this.appName = appName;
    }
}