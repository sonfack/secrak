package vn.edu.ifi.secrak.service.asset;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import vn.edu.ifi.secrak.entity.Asset;
import vn.edu.ifi.secrak.repository.AssetRepository;

@Service
@RestController
public class AssetServiceImp implements AssetService {

    @Autowired
    private AssetRepository assetRepo ;

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
	public Asset updateAsset(Asset asset) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deletAsset(Asset asset) {
		// TODO Auto-generated method stub

	}

	@Override
	public Asset getAssetById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Asset> getAllAsset() {
		// TODO Auto-generated method stub
		return null;
	}

}
