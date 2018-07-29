package vn.edu.ifi.secrak.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="shop")
public class Shop {
	@Id
	@Column(name="shop_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long shopId;
	
	@Column(name="shop_name")
	private String shopName ;
	
	@Column(name="shop_email")
	private String shopEmail ;
	
	@Column(name="shop_address")
	private String shopAddress;
	
	@Column(name="shop_status")
	private byte shopStatus;
	
	public String getShopEmail() {
		return shopEmail;
	}
	public void setShopEmail(String shopEmail) {
		this.shopEmail = shopEmail;
	}
	public Long getShopId() {
		return shopId;
	}
	public void setShopId(Long shopId) {
		this.shopId = shopId;
	}
	public byte getShopStatus() {
		return shopStatus;
	}
	public void setShopStatus(byte shopStatus) {
		this.shopStatus = shopStatus;
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public String getShopAddress() {
		return shopAddress;
	}
	public void setShopAddress(String shopAddress) {
		this.shopAddress = shopAddress;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Shop [shopId=" + shopId + ", shopName=" + shopName + ", shopAddress=" + shopAddress + ", shopStatus="
				+ shopStatus + "]";
	}
	

	

}
