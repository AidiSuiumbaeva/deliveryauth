package kg.easy.deliveryauth.controllers;

import kg.easy.deliveryauth.models.dto.SessionsDto;
import kg.easy.deliveryauth.service.SessionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/sessions")
public class SessionsCTRL {

    @Autowired
    private SessionsService service;


    @PostMapping(value = "/save")
    SessionsDto save(@RequestBody SessionsDto sessionsDto){
         return service.save(sessionsDto);
    }
}
