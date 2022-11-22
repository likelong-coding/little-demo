package mapstruct.mapper;

import mapstruct.entity.Doctor;
import mapstruct.entity.DoctorDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

/**
 * @author likelong
 */
@Mapper
public interface DoctorMapper {
    DoctorMapper INSTANCE = Mappers.getMapper(DoctorMapper.class);

    /**
     * 对象转换
     * @param doctor Doctor对象
     * @return DoctorDto对象
     */
    @Mapping(source = "doctor.specialty", target = "specialization")
    DoctorDto toDto(Doctor doctor);
}
