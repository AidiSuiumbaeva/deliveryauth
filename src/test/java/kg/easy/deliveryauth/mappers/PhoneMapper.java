package kg.easy.deliveryauth.mappers;

import kg.easy.deliveryauth.models.dto.PhoneDto;
import kg.easy.deliveryauth.models.entity.Phone;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PhoneMapper {
    PhoneMapper PHONE_MAPPER= Mappers.getMapper(PhoneMapper.class);
    Phone phoneToPhoneDto(PhoneDto phoneDto);
    PhoneDto phoneDtoToPhone(Phone phone);
}
