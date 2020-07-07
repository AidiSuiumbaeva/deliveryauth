package kg.easy.deliveryauth.service.impl;

import kg.easy.deliveryauth.mappers.UserMapper;
import kg.easy.deliveryauth.models.dto.UserDto;
import kg.easy.deliveryauth.models.entity.Users;
import kg.easy.deliveryauth.repository.UserRep;
import kg.easy.deliveryauth.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UserRep userRep;
    @Override
    public UserDto save(UserDto userDto) {
        Users users= UserMapper.USER_MAPPER.userToUserDto(userDto);
        users=userRep.save(users);
        userDto=UserMapper.USER_MAPPER.userDtoToUser(users);
        return userDto;
    }
}
