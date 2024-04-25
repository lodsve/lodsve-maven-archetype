package ${package}.service.impl;

import ${package}.pojo.form.DemoForm;
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
    @Override
    public DemoVO loadDemo(Long id) {
        return null;
    }

    @Override
    public Long save(DemoForm demoForm) {
        return 1L;
    }

    @Override
    public Page<DemoVO> findAll(Pageable pageable, DemoQuery query) {
        return null;
    }

    @Override
    public boolean update(DemoForm demoForm) {
        return false;
    }
}
