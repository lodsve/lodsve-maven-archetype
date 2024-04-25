package ${package}.web;

import ${package}.pojo.form.DemoForm;
import ${package}.pojo.query.DemoQuery;
import ${package}.pojo.vo.DemoVO;
import ${package}.service.DemoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * demo controller.
 *
 * @author ${author}
 */
@Api(value = "Demo Controller", description = "Demo Controller")
@RestController
@RequestMapping("/demo")
public class DemoController {
    private final DemoService demoService;

    @Autowired
    public DemoController(DemoService demoService) {
        this.demoService = demoService;
    }

    @ApiOperation(value = "获取", notes = "获取")
    @ApiResponses({@ApiResponse(code = 200, message = "获取成功")})
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public DemoVO loadUser(@ApiParam(name = "id", value = "用户ID") @PathVariable("id") Long id) {
        return demoService.loadDemo(id);
    }

    @ApiOperation(value = "更新", notes = "更新")
    @ApiResponses({@ApiResponse(code = 200, message = "更新成功")})
    @RequestMapping(value = "/", method = RequestMethod.PATCH)
    public boolean update(@ApiParam(name = "demoForm", value = "需要更新的") @RequestBody DemoForm demoForm) {
        return demoService.update(demoForm);
    }

    @ApiOperation(value = "保存", notes = "保存")
    @ApiResponses({@ApiResponse(code = 200, message = "保存成功")})
    @RequestMapping(value = "/", method = RequestMethod.POST)
    public Long save(@ApiParam(name = "demoForm", value = "需要保存的") @RequestBody DemoForm demoForm) {
        return demoService.save(demoForm);
    }

    @ApiOperation(value = "列出", notes = "列出")
    @ApiResponses({@ApiResponse(code = 200, message = "列出成功")})
    @RequestMapping(value = "/list", method = RequestMethod.POST)
    public Page<DemoVO> findAll(@ApiParam(name = "pageable", value = "分页信息,传参方式：?page=0&size=10") @PageableDefault(page = 0, size = 10) Pageable pageable, @ApiParam(name = "query", value = "查询对象") @RequestBody DemoQuery query) {
        return this.demoService.findAll(pageable, query);
    }
}
