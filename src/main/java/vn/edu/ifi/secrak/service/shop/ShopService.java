package vn.edu.ifi.secrak.service.shop;

import java.util.List;

import vn.edu.ifi.secrak.entity.Shop;


public interface ShopService {
	Shop saveShop(Shop shop);
	Shop updateShop(Shop shop);
	void deleteShop(Shop shop);
	void deleteShopById(Long id);
	Shop getShopById(Long id);
	List<Shop> getAllShop();
}
