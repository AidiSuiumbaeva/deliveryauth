package kg.easy.deliveryauth.service.impl;

import kg.easy.deliveryauth.mappers.RoleMapper;
import kg.easy.deliveryauth.models.dto.RoleDto;
import kg.easy.deliveryauth.models.entity.Role;
import kg.easy.deliveryauth.repository.RoleRep;
import kg.easy.deliveryauth.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleRep roleRep;
    @Override
    public RoleDto save(RoleDto roleDto) {
        Role role= RoleMapper.ROLE_MAPPER.roleToRoleDto(roleDto);
        role=roleRep.save(role);
        roleDto=RoleMapper.ROLE_MAPPER.roleDtoToRole(role);
        return roleDto;
    }
}
