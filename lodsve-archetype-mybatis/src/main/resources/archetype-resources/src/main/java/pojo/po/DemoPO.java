package ${package}.pojo.po;

import com.lodsve.boot.component.mybatis.pojo.BasePropertyPO;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * demo po.
 *
 * @author ${author}
 */
@Setter
@Getter
@ToString(callSuper = true)
public class DemoPO extends BasePropertyPO {
    private String name;
}
