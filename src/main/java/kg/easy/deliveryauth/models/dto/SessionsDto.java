package kg.easy.deliveryauth.models.dto;

import lombok.Data;

import java.util.Date;

@Data
public class SessionsDto {
    private Long id;
    private String token;
    private Date startDate;
    private Date endDate;
    private UserDto userDto;
}
