package kg.easy.deliveryauth.repository;

import kg.easy.deliveryauth.models.entity.Sessions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SessionRep extends JpaRepository<Sessions,Long> {
}
