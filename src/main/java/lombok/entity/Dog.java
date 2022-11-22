package lombok.entity;

import lombok.Builder;
import lombok.Data;

/**
 * @author likelong
 * @date 2022/11/21
 */
@Data
@Builder
public class Dog{
    private String name;
    private String color;
}
