package kg.easy.deliveryauth.mappers;

import kg.easy.deliveryauth.models.dto.UserDto;
import kg.easy.deliveryauth.models.entity.Users;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {
    UserMapper USER_MAPPER= Mappers.getMapper(UserMapper.class);

    Users userToUserDto(UserDto userDto);
    UserDto userDtoToUser(Users users);
}
