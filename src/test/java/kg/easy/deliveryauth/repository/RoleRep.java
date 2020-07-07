package kg.easy.deliveryauth.repository;

import kg.easy.deliveryauth.models.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRep extends JpaRepository<Role,Long> {
}
