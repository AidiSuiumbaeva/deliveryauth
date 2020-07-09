package kg.easy.deliveryauth.controllers;

import kg.easy.deliveryauth.models.dto.AccountDto;
import kg.easy.deliveryauth.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/account")
public class AccountCTRL {

    @Autowired
    private AccountService service;

    @PostMapping(value = "/save")
    AccountDto save(@RequestBody AccountDto accountDto)
    {
        return service.save(accountDto);
    }


    @PutMapping
    AccountDto update(@RequestBody AccountDto accountDto){
        return accountDto;
    }

    @DeleteMapping("/delete/{id")
    public boolean delete(@PathVariable Long id){
        return true;
    }

    @GetMapping("/find/{id}")
    public AccountDto getBuId(@PathVariable Long id){
        return null;
    }

    @GetMapping("/all")
    public List<AccountDto> findAll(){
        return null;
    }

}
