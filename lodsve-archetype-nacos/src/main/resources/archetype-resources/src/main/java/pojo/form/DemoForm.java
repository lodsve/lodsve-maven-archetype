package ${package}.pojo.form;

import com.lodsve.boot.pojo.BaseForm;
import lombok.Getter;
import lombok.Setter;

/**
 * demo form.
 *
 * @author ${author}
 */
@Setter
@Getter
public class DemoForm extends BaseForm {
    private String name;

    @Override
    public String toString() {
        return super.toString();
    }
}
