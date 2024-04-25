package ${package}.pojo.vo;

import com.lodsve.boot.pojo.BaseVO;
import lombok.Getter;
import lombok.Setter;

/**
 * demo vo.
 *
 * @author ${author}
 */
@Setter
@Getter
public class DemoVO extends BaseVO {
    private Long id;
    private String name;

    @Override
    public String toString() {
        return super.toString();
    }
}
