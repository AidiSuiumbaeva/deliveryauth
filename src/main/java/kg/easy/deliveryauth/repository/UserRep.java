package kg.easy.deliveryauth.repository;

import kg.easy.deliveryauth.models.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRep extends JpaRepository<Users,Long> {
}