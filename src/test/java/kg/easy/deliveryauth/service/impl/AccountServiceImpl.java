package kg.easy.deliveryauth.service.impl;

import kg.easy.deliveryauth.mappers.AccountMapper;
import kg.easy.deliveryauth.models.dto.AccountDto;
import kg.easy.deliveryauth.models.entity.Account;
import kg.easy.deliveryauth.repository.AccountRep;
import kg.easy.deliveryauth.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountRep accountRep;
    @Override
    public AccountDto save(AccountDto accountDto) {
        Account account= AccountMapper.ACCOUNT_MAPPER.accountToAccountDto(accountDto);
        account=accountRep.save(account);
        accountDto=AccountMapper.ACCOUNT_MAPPER.accountDtoToAccount(account);
        return accountDto;
    }
}
