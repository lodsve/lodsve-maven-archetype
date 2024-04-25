package ${package}.dao;

import com.lodsve.boot.component.mybatis.repository.BaseRepository;
import ${package}.pojo.po.DemoPO;
import ${package}.pojo.query.DemoQuery;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

/**
 * demo dao.
 *
 * @author Hulk Sun
 */
@Repository
public interface DemoDAO extends BaseRepository<DemoPO> {
    /**
     * 分页查询
     *
     * @param pageable 分页对象
     * @param query    查询条件
     * @return 分页数据
     */
    Page<DemoPO> findAll(Pageable pageable, DemoQuery query);
}
