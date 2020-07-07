package kg.easy.deliveryauth.repository;

import kg.easy.deliveryauth.models.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRep extends JpaRepository<Account,Long> {
}
