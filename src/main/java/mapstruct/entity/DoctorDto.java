package mapstruct.entity;

import lombok.Data;

/**
 * @author likelong
 */
@Data
public class DoctorDto {
    private int id;
    private String name;
    private String specialization;
    // getters and setters or builder
}
