package vn.edu.ifi.secrak.service.asset;

import java.util.List;

import vn.edu.ifi.secrak.entity.Asset;

public interface AssetService {

	Asset saveAsset(Asset asset);
	
	Asset updateAsset(Asset asset);
	
	void deletAsset(Asset asset);
	
	Asset getAssetById(Long id);
	
	List<Asset> getAllAsset();
}
