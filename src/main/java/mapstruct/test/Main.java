package mapstruct.test;

import mapstruct.entity.Doctor;
import mapstruct.entity.DoctorDto;
import mapstruct.mapper.DoctorMapper;

/**
 * @author likelong
 * @date 2022/11/21
 */
public class Main {

    public static void main(String[] args) {
        Doctor doctor = Doctor.builder().id(1).name("magic").specialty("very good").build();

        //复制Doctor对象属性到DoctorDto对象中
        //1、spring 工具类 BeanUtils.copyProperties(source, dest);

        //2、mapstruct方式
        System.out.println(doctor);
        DoctorDto doctorDto = DoctorMapper.INSTANCE.toDto(doctor);
        System.out.println(doctorDto);

    }
}
