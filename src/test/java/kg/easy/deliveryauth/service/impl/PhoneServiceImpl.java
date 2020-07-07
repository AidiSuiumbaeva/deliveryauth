package kg.easy.deliveryauth.service.impl;

import kg.easy.deliveryauth.mappers.PhoneMapper;
import kg.easy.deliveryauth.models.dto.PhoneDto;
import kg.easy.deliveryauth.models.entity.Phone;
import kg.easy.deliveryauth.repository.PhoneRep;
import kg.easy.deliveryauth.service.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PhoneServiceImpl implements PhoneService {

    @Autowired
    private PhoneRep phoneRep;
    @Override
    public PhoneDto save(PhoneDto phoneDto) {
        Phone phone= PhoneMapper.PHONE_MAPPER.phoneToPhoneDto(phoneDto);
        phone=phoneRep.save(phone);
        phoneDto=PhoneMapper.PHONE_MAPPER.phoneDtoToPhone(phone);
        return phoneDto;
    }
}
