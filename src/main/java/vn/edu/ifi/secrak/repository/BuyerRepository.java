package vn.edu.ifi.secrak.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.edu.ifi.secrak.entity.Buyer;

public interface BuyerRepository extends JpaRepository<Buyer, Long> {
}
