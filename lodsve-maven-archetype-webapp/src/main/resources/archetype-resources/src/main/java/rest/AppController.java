package ${package}.rest;

import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ${package}.domain.App;
import ${package}.service.AppService;

/**
 * .
 *
 * @author ${author}
 */
@Api(value = "App Controller", description = "App Controller")
@RestController
@RequestMapping("/app")
public class AppController {
    @Autowired
    private AppService appService;

    @ApiOperation(value = "Get App", notes = "Get App")
    @ApiResponses({@ApiResponse(code = 200, message = "Get the app successful!")})
    @RequestMapping(value = "/{appName}", method = RequestMethod.GET)
    public App getApp(@ApiParam(name = "appName", value = "App Name") @PathVariable("appName") String appName) {
        return appService.getApp(appName);
    }
}