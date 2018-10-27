package vn.edu.ifi.secrak.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.edu.ifi.secrak.entity.Asset;
import vn.edu.ifi.secrak.entity.Buyer;
import vn.edu.ifi.secrak.entity.Saledoc;
import vn.edu.ifi.secrak.entity.User;

import java.util.List;

@Repository
public interface SaledocRepository extends JpaRepository<Saledoc, Long> {

    public List<Saledoc> findBySalerAndAsset(User saler, Asset asset) ;

    public List<Saledoc> findByBuyerAndAsset(Buyer buyer, Asset asset);


    /**
     * This method returns all sale documents of a given asset
     * @param asset
     * @return List<Saledoc>
     */
    public  List<Saledoc> findByAsset(Asset asset);


    /**
     * This method returns the last sale document of an asset
     * @param asset
     * @return Saledoc
     */
    public Saledoc findTopByAssetOrderBySaledocDateDesc(Asset asset);


}
