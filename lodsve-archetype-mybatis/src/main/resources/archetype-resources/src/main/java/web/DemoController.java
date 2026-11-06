/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ${package}.web;

import ${package}.pojo.form.DemoForm;
import ${package}.pojo.query.DemoQuery;
import ${package}.pojo.vo.DemoVO;
import ${package}.service.DemoService;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
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
@Tag(name = "Demo Controller", description = "Demo Controller")
@RestController
@RequestMapping("/demo")
public class DemoController {
    private final DemoService demoService;

    @Autowired
    public DemoController(DemoService demoService) {
        this.demoService = demoService;
    }

    @Operation(summary = "获取", description = "获取")
    @ApiResponses({@ApiResponse(responseCode = "200", description = "获取成功")})
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public DemoVO loadUser(@Parameter(name = "id", description = "用户ID") @PathVariable("id") Long id) {
        return demoService.loadDemo(id);
    }

    @Operation(summary = "更新", description = "更新")
    @ApiResponses({@ApiResponse(responseCode = "200", description = "更新成功")})
    @RequestMapping(value = "/", method = RequestMethod.PATCH)
    public boolean update(@Parameter(name = "demoForm", description = "需要更新的") @RequestBody DemoForm demoForm) {
        return demoService.update(demoForm);
    }

    @Operation(summary = "保存", description = "保存")
    @ApiResponses({@ApiResponse(responseCode = "200", description = "保存成功")})
    @RequestMapping(value = "/", method = RequestMethod.POST)
    public Long save(@Parameter(name = "demoForm", description = "需要保存的") @RequestBody DemoForm demoForm) {
        return demoService.save(demoForm);
    }

    @Operation(summary = "列出", description = "列出")
    @ApiResponses({@ApiResponse(responseCode = "200", description = "列出成功")})
    @RequestMapping(value = "/list", method = RequestMethod.POST)
    public Page<DemoVO> findAll(@Parameter(name = "pageable", description = "分页信息,传参方式：?page=0&size=10") @PageableDefault(page = 0, size = 10) Pageable pageable, @Parameter(name = "query", description = "查询对象") @RequestBody DemoQuery query) {
        return this.demoService.findAll(pageable, query);
    }
}
