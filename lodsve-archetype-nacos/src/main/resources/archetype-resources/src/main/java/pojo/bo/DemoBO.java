package ${package}.pojo.bo;

import com.lodsve.boot.pojo.BaseBO;
import lombok.Getter;
import lombok.Setter;

/**
 * demo bo.
 *
 * @author ${author}
 */
@Setter
@Getter
public class DemoBO extends BaseBO {
    private Long id;
    private String name;

    @Override
    public String toString() {
        return super.toString();
    }
}
