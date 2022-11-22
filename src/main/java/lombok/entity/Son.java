package lombok.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

/**
 * @author likelong
 * @date 2022/11/21
 */
@EqualsAndHashCode(callSuper = true)
@Data
@SuperBuilder
public class Son extends Parent {
    private Integer age;

    @Override
    public String toString() {
        return "Son.SonBuilder(super=" + super.toString() + ", age=" + this.age + ")";
    }
}
