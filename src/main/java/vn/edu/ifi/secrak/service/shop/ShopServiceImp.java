package vn.edu.ifi.secrak.service.shop;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.web.bind.annotation.*;
import vn.edu.ifi.secrak.entity.Shop;
import vn.edu.ifi.secrak.repository.ShopRepository;
import vn.edu.ifi.secrak.service.shop.ShopService;

@Service
@RestController
public class ShopServiceImp implements ShopService {

	@Autowired
	private ShopRepository shopRepo; 

	public ShopServiceImp(){}

	public ShopRepository getShopRepo() {
		return shopRepo;
	}

	public void setShopRepo(ShopRepository shopRepo) {
		this.shopRepo = shopRepo;
	}

	@Override
    @RequestMapping(value = "/api/secrak/save/shop", method = RequestMethod.POST)
	public Shop saveShop(Shop shop) {
		return shopRepo.save(shop);
	}

	@Override
    @RequestMapping(value = "/api/secrak/update/shop", method = RequestMethod.PUT)
	public Shop updateShop(Shop shop) {
		return shopRepo.save(shop);
	}

	@Override
	@RequestMapping(value = "/api/secrak/delete/shop", method = RequestMethod.DELETE)
    public void deleteShop(Shop shop) {
		shopRepo.delete(shop);
	}

	@Override
	@RequestMapping(value = "/api/secrak/delete/shop/{id}", method = RequestMethod.DELETE)
	public  void deleteShopById(@PathVariable Long id){
		shopRepo.deleteById(id);
	}

	@Override
    @RequestMapping(value = "/api/secrak/get/shop/{id}", method = RequestMethod.GET)
	public Shop getShopById(@PathVariable Long id) {
		return shopRepo.findById(id).get();
	}

	@Override
    @RequestMapping(value = "/api/secrak/get/shop", method = RequestMethod.GET)
	public List<Shop> getAllShop() {
		return shopRepo.findAll();
	}

}
