package vn.edu.ifi.secrak.service.asset;

import java.util.List;

import vn.edu.ifi.secrak.entity.Asset;

public interface AssetService {

	Asset saveAsset(Asset asset);

	Asset saveAsset(Long id, Asset asset);
	
	Asset updateAsset(Asset asset);
	
	void deleteAsset(Asset asset);

	void deleteById(Long id);
	
	Asset getAssetById(Long id);
	
	List<Asset> getAllAsset();
}
