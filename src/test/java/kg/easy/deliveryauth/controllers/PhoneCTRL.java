package kg.easy.deliveryauth.controllers;

import kg.easy.deliveryauth.models.dto.PhoneDto;
import kg.easy.deliveryauth.service.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/phone")
public class PhoneCTRL {
    @Autowired
    private PhoneService service;

    @PostMapping(value = "/save")
    PhoneDto save(@RequestBody PhoneDto phoneDto){
        return service.save(phoneDto);
    }
}
