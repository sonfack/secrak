package vn.edu.ifi.secrak.entity;

import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

/**
 * Class of the Buyer entity that map the buyer table in the database
 */
@Entity
@Table(name = "buyer")
public class Buyer {
    @Id
    @Column(name = "buyer_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long buyerId ;

    @UpdateTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "buyer_date")
    private Date buyerDate ;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "secrakuser_id")
    private User user ;

    /**
     * This function
     * @return buyer id
     */
    public Long getBuyerId() {
        return buyerId;
    }

    /**
     * This function sets buyer id
     * @param buyerId
     */
    public void setBuyerId(Long buyerId) {
        this.buyerId = buyerId;
    }

    public Date getBuyDate() {
        return buyerDate;
    }

    public void setBuyDate(Date buyDate) {
        this.buyerDate = buyDate;
    }

   public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
