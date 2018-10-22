package vn.edu.ifi.secrak.service.asset;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.web.bind.annotation.*;
import vn.edu.ifi.secrak.entity.Asset;
import vn.edu.ifi.secrak.entity.Shop;
import vn.edu.ifi.secrak.repository.AssetRepository;
import vn.edu.ifi.secrak.repository.ShopRepository;

@Service
@RestController
public class AssetServiceImp implements AssetService {

    @Autowired
    private AssetRepository assetRepo ;

    @Autowired
    private ShopRepository shopRepo;

    public AssetServiceImp(){}

    public AssetRepository getAssetRepo() {
        return assetRepo;
    }

    public  void setAssetRepo(AssetRepository assetRepo){
        this.assetRepo = assetRepo;
    }

    @Override
    @RequestMapping(value = "/api/secrak/save/asset", method = RequestMethod.POST)
    public Asset saveAsset(Asset asset) {
        return assetRepo.save(asset);
    }

    @Override
    @RequestMapping(value = "/api/secrak/shop/{id}/save/asset", method = RequestMethod.POST)
	public Asset saveAsset(@PathVariable(value = "id") Long id, Asset asset) {
        Shop shop = shopRepo.findById(id).get();
        asset.setShop(shop);
		return assetRepo.save(asset);
	}

	@Override
    @RequestMapping(value = "/api/secrak/update/asset", method = RequestMethod.PUT)
	public Asset updateAsset(Asset asset) {
		return assetRepo.save(asset);
	}

	@Override
    @RequestMapping(value = "/api/secrak/delete/asset", method = RequestMethod.DELETE)
	public void deleteAsset(Asset asset) {
        assetRepo.delete(asset);
	}

	@Override
    @RequestMapping(value = "/api/secrak/delete/asset/{id}", method = RequestMethod.DELETE)
    public  void  deleteById(@PathVariable Long id){
        assetRepo.deleteById(id);
    }

	@Override
    @RequestMapping(value = "/api/secrak/get/asset/{id}", method = RequestMethod.GET)
	public Asset getAssetById(@PathVariable Long id) {
        System.out.println(assetRepo.findById(id).get().getShop());
		return assetRepo.findById(id).get();
	}

    @Override
    @RequestMapping(value = "/api/secrak/get/asset/idnumber/{idnumber}", method = RequestMethod.GET)
    public Asset getAssetByIdNumber(@PathVariable String idnumber) {
        return assetRepo.findByIdNumber(idnumber);
    }

	@Override
    @RequestMapping(value = "/api/secrak/get/asset", method = RequestMethod.GET)
	public List<Asset> getAllAsset() {
		return assetRepo.findAll();
	}

}
