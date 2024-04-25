package ${package}.pojo.query;

import com.lodsve.boot.pojo.BaseQuery;
import lombok.Getter;
import lombok.Setter;

/**
 * demo query.
 *
 * @author ${author}
 */
@Setter
@Getter
public class DemoQuery extends BaseQuery {
    private String name;

    @Override
    public String toString() {
        return super.toString();
    }
}
