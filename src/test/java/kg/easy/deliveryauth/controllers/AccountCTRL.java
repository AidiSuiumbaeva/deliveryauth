package kg.easy.deliveryauth.controllers;

import kg.easy.deliveryauth.models.dto.AccountDto;
import kg.easy.deliveryauth.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/account")
public class AccountCTRL {

    @Autowired
    AccountService service;

    @PostMapping(value = "/save")
    AccountDto save(@RequestBody AccountDto accountDto)
    {
        return service.save(accountDto);
    }

}
