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
package ${package}.service.impl;

import com.lodsve.boot.component.mybatis.utils.BasePropertyUtil;
import ${package}.dao.DemoDAO;
import ${package}.pojo.form.DemoForm;
import ${package}.pojo.po.DemoPO;
import ${package}.pojo.query.DemoQuery;
import ${package}.pojo.vo.DemoVO;
import ${package}.service.DemoService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 * Demo Service Impl.
 *
 * @author ${author}
 */
@Service
public class DemoServiceImpl implements DemoService {
    private final DemoDAO demoDAO;

    public DemoServiceImpl(DemoDAO demoDAO) {
        this.demoDAO = demoDAO;
    }

    @Override
    public DemoVO loadDemo(Long id) {
        DemoPO demo = demoDAO.findById(id);
        DemoVO demoVO = new DemoVO();
        demoVO.setId(demo.getId());
        demoVO.setName(demo.getName());

        return demoVO;
    }

    @Override
    public Long save(DemoForm demoForm) {
        DemoPO demo = new DemoPO();
        demo.setName(demo.getName());
        BasePropertyUtil.initCreatedInfo(demo, 1L);

        demoDAO.save(demo);
        return demo.getId();
    }

    @Override
    public Page<DemoVO> findAll(Pageable pageable, DemoQuery query) {
        return demoDAO.findAll(pageable, query).map(d -> {
            DemoVO demoVO = new DemoVO();
            demoVO.setId(d.getId());
            demoVO.setName(d.getName());
            return demoVO;
        });
    }

    @Override
    public boolean update(DemoForm demoForm) {
        DemoPO demo = new DemoPO();
        demo.setId(demoForm.getId());
        demo.setName(demoForm.getName());
        return 1 == demoDAO.updateAll(demo);
    }
}
