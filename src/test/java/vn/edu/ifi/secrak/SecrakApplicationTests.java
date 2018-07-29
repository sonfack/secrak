package vn.edu.ifi.secrak;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import vn.edu.ifi.secrak.entity.Shop;
import vn.edu.ifi.secrak.repository.ShopRepository;



@RunWith(SpringRunner.class)
@SpringBootTest
public class SecrakApplicationTests {

	@Autowired
	private ShopRepository shopRepo ; 
	
	@Test
	public void testCreateShop() {
		Shop newShop = new Shop();
		newShop.setShopName("Vivirt Mark");
		newShop.setShopAddress("My Dinh 2");
		newShop.setShopEmail("vivirt@info.net");
		newShop.setShopStatus(new Byte("1"));
		shopRepo.save(newShop);
	}

}
