package vn.edu.ifi.secrak.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vn.edu.ifi.secrak.entity.Shop;
import vn.edu.ifi.secrak.repository.ShopRepository;

@Service
public class ShopServiceImp implements ShopService {

	@Autowired
	private ShopRepository shopRepo; 
	
	public ShopRepository getShopRepo() {
		return shopRepo;
	}

	public void setShopRepo(ShopRepository shopRepo) {
		this.shopRepo = shopRepo;
	}

	@Override
	public Shop saveShop(Shop shop) {
		return shopRepo.save(shop);
	}

	@Override
	public Shop updateShop(Shop shop) {
		return shopRepo.save(shop);
	}

	@Override
	public void deleteShop(Shop shop) {
		shopRepo.delete(shop);
	}

	@Override
	public Shop getShopById(Long id) {
		return shopRepo.findById(id).get();
	}

	@Override
	public List<Shop> getAllShop() {
		return shopRepo.findAll();
	}

}
