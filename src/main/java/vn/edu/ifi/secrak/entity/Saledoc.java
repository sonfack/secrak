package vn.edu.ifi.secrak.entity;

import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "saledoc")
public class Saledoc {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "saledoc_id")
    private Long saledocId;

    @Column(name = "saledoc_price")
    private float price ;

    @Column(name = "saledoc_warranty")
    private  int warranty = 0;

    @UpdateTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "saledoc_date")
    private Date saledocDate ;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="secrakuser_id")
    private User saler;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="buyer_id")
    private Buyer buyer;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="asset_id")
    private Asset asset;

    public Long getSaledocId() {
        return saledocId;
    }

    public void setSaledocId(Long saledocId) {
        this.saledocId = saledocId;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getWarranty() {
        return warranty;
    }

    public void setWarranty(int warrancy) {
        this.warranty = warrancy;
    }

    public Date getSaledocDate() {
        return saledocDate;
    }

    public void setSaledocDate(Date saledocDate) {
        this.saledocDate = saledocDate;
    }

    public User getSaler() {
        return saler;
    }

    public void setSaler(User saler) {
        this.saler = saler;
    }

    public Buyer getBuyer() {
        return buyer;
    }

    public void setBuyer(Buyer buyer) {
        this.buyer = buyer;
    }

    public Asset getAsset() {
        return asset;
    }

    public void setAsset(Asset asset) {
        this.asset = asset;
    }
}
