package mapstruct.entity;

import lombok.Builder;
import lombok.Data;

/**
 * @author likelong
 */
@Data
@Builder
public class Doctor {
    private int id;
    private String name;
    private String specialty;
    // getters and setters or builder
}
