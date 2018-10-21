/**
 * 
 */
package vn.edu.ifi.secrak.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import vn.edu.ifi.secrak.entity.Shop;

/**
 * @author sonfack
 *
 */

@Repository
public interface ShopRepository extends JpaRepository<Shop, Long> {

}
