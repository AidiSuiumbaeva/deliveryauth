package kg.easy.deliveryauth.controllers;

import kg.easy.deliveryauth.models.dto.UserDto;
import kg.easy.deliveryauth.models.entity.Users;
import kg.easy.deliveryauth.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserCTRL {

    @Autowired
    private UsersService service;

    @PostMapping(value = "/save")
    UserDto save(@RequestBody UserDto userDto){
        return service.save(userDto);
    }
}
