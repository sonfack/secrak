package vn.edu.ifi.secrak.service.saledoc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import vn.edu.ifi.secrak.entity.Asset;
import vn.edu.ifi.secrak.entity.Buyer;
import vn.edu.ifi.secrak.entity.Saledoc;
import vn.edu.ifi.secrak.entity.User;
import vn.edu.ifi.secrak.repository.AssetRepository;
import vn.edu.ifi.secrak.repository.BuyerRepository;
import vn.edu.ifi.secrak.repository.SaledocRepository;
import vn.edu.ifi.secrak.repository.UserRepository;

import javax.accessibility.AccessibleStateSet;
import java.util.List;

@Service
@RestController
public class SaledocServiceImp implements SaledocService{

    @Autowired
    SaledocRepository saledocRepo;

    @Autowired
    AssetRepository assetRepo;

    @Autowired
    BuyerRepository buyerRepo;

    @Autowired
    UserRepository userRepo;

    public SaledocServiceImp(SaledocRepository saledocRepository){this.saledocRepo = saledocRepository; }


    @Override
    @RequestMapping(value = "/api/secrak/save/saledoc")
    public Saledoc saveSaledoc(Saledoc saledoc) {
        return saledocRepo.save(saledoc);
    }

    @Override
    @RequestMapping(value = "/api/secrak/asset/{asset_id}/buyer/{buyer_id}/saler/{saler_id}/save/saledoc/warranty/{warranty}/price/{price}")
    public Saledoc saveSaledoc(@PathVariable Long asset_id, @PathVariable Long buyer_id, @PathVariable Long saler_id, @PathVariable int warranty, @PathVariable float price) {
        Asset asset = assetRepo.findById(asset_id).get();
        User saler =  userRepo.findById(saler_id).get();
        Buyer buyer = buyerRepo.findById(buyer_id).get();
        if((saledocRepo.findBySalerAndAsset(saler, asset).isEmpty() && saledocRepo.findByBuyerAndAsset(buyer, asset).isEmpty()) || (saledocRepo.findTopByAssetOrderBySaledocDateDesc(asset).getBuyer().getBuyerId() == saler_id)) {
            Saledoc saledoc = new Saledoc();
            saledoc.setAsset(asset);
            saledoc.setBuyer(buyer);
            saledoc.setSaler(saler);
            saledoc.setWarranty(warranty);
            saledoc.setPrice(price);
            return saledocRepo.save(saledoc);
        }else {
            return null ;
        }
    }

    @Override
    @RequestMapping(value = "/api/secrak/get/history/saledoc/{id}", method = RequestMethod.GET)
    public List<Saledoc> getHistoryAssetFromSaledoc(@PathVariable Long id){
        Asset asset = assetRepo.findById(id).get();
        return saledocRepo.findByAsset(asset);
    }


    @Override
    @RequestMapping(value = "/api/secrak/get/saledoc/{id}", method = RequestMethod.GET)
    public Saledoc getSaleducById(@PathVariable Long id) {
        return saledocRepo.findById(id).get();
    }

    @Override
    @RequestMapping(value = "/api/secrak/get/saledoc", method = RequestMethod.GET)
    public List<Saledoc> getAllSaledoc() {
        return saledocRepo.findAll();
    }
}
