package kg.easy.deliveryauth.models.dto;

import lombok.Data;

@Data
public class UserDto {
    private Long id;
    private String name;
    private String address;
    private AccountDto accountDto;
    private RoleDto roleDto;
}
