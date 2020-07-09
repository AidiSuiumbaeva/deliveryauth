package kg.easy.deliveryauth.models.dto;

import lombok.Data;

@Data
public class PhoneDto {
    private Long id;
    private String phone;
    private boolean active;
    private UserDto userDto;
}
