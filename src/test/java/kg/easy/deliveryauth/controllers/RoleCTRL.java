package kg.easy.deliveryauth.controllers;

import kg.easy.deliveryauth.models.dto.RoleDto;
import kg.easy.deliveryauth.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/role")
public class RoleCTRL {
    @Autowired
    private RoleService service;

    @PostMapping
    RoleDto save(@RequestBody RoleDto roleDto){
        return  service.save(roleDto);
    }
}
