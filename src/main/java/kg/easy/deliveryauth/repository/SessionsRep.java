package kg.easy.deliveryauth.repository;

import kg.easy.deliveryauth.models.entity.Sessions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SessionsRep extends JpaRepository<Sessions,Long> {
}