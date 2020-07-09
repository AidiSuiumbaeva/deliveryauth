package kg.easy.deliveryauth.models.entity;

import kg.easy.deliveryauth.models.dto.AccountDto;
import kg.easy.deliveryauth.models.dto.RoleDto;
import lombok.Data;

import javax.persistence.*;


@Data
@Entity
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String address;
    @OneToOne
    @JoinColumn(name = "account_id")
    private Account account;
    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role;
}
