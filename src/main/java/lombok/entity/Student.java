package lombok.entity;

import lombok.Builder;
import lombok.Data;

/**
 * @author likelong
 * @date 2022/11/21
 */
@Data
@Builder
public class Student {
    private String name;
    private Integer sex;
    private Integer age;
}
