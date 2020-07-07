package kg.easy.deliveryauth.mappers;

import kg.easy.deliveryauth.models.dto.RoleDto;
import kg.easy.deliveryauth.models.entity.Role;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface RoleMapper {
    RoleMapper ROLE_MAPPER= Mappers.getMapper(RoleMapper.class);

    Role roleToRoleDto(RoleDto roleDto);
    RoleDto roleDtoToRole(Role role);
}
