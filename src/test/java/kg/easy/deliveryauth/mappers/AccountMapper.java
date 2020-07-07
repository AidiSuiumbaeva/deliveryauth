package kg.easy.deliveryauth.mappers;

import kg.easy.deliveryauth.models.dto.AccountDto;
import kg.easy.deliveryauth.models.entity.Account;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AccountMapper {
    AccountMapper ACCOUNT_MAPPER= Mappers.getMapper(AccountMapper.class);
Account accountToAccountDto(AccountDto accountDto);
AccountDto accountDtoToAccount(Account account);

}
