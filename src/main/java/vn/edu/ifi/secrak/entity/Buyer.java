package vn.edu.ifi.secrak.entity;

import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

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
    private Date buyDate ;

    // @ManyToOne(fetch = FetchType.LAZY)
    // @JoinColumn(name = "secrakuser_id")
    // private User user ;

    public Long getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(Long buyerId) {
        this.buyerId = buyerId;
    }

    public Date getBuyDate() {
        return buyDate;
    }

    public void setBuyDate(Date buyDate) {
        this.buyDate = buyDate;
    }

   /* public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }*/
}
