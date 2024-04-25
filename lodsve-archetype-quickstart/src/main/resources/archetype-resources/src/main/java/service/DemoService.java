package ${package}.service;

import ${package}.pojo.form.DemoForm;
import ${package}.pojo.query.DemoQuery;
import ${package}.pojo.vo.DemoVO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * Demo Service.
 *
 * @author ${author}
 */
public interface DemoService {
    /**
     * load demo
     *
     * @param id id
     * @return demo
     */
    DemoVO loadDemo(Long id);

    /**
     * 保存
     *
     * @param demoForm demo form
     * @return demo id
     */
    Long save(DemoForm demoForm);

    /**
     * 分页查询列表，带有查询
     *
     * @param pageable 分页信息
     * @param query    查询参数
     * @return 列表数据
     */
    Page<DemoVO> findAll(Pageable pageable, DemoQuery query);

    /**
     * 更新列表
     *
     * @param demoForm demo form
     * @return 是否更新成功
     */
    boolean update(DemoForm demoForm);
}
