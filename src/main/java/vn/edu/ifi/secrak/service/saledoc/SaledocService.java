package vn.edu.ifi.secrak.service.saledoc;


import vn.edu.ifi.secrak.entity.Asset;
import vn.edu.ifi.secrak.entity.Saledoc;

import java.util.List;

public interface SaledocService {

    Saledoc saveSaledoc(Saledoc saledoc);

    Saledoc saveSaledoc(Long asset_id, Long buyer_id, Long saler_id, int warranty, float price) ;

    Saledoc getSaleducById(Long id);

    List<Saledoc> getHistoryAssetFromSaledoc(Long id);


    List<Saledoc> getAllSaledoc();
}
