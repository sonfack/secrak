package vn.edu.ifi.secrak.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="invoice")
public class Invoice {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="invoice_id")
    private Long invoiceId;

    @Column(name = "invoice_date")
    private Date invoicdDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="secrakuser_id")
    private User user;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "asset_id")
    private Asset asset;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Invoice(){

    }

    public Asset getAsset() {
        return asset;
    }

    public void setAsset(Asset asset) {
        this.asset = asset;
    }

    public Long getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(Long invoiceId) {
        this.invoiceId = invoiceId;
    }

    public Date getInvoicdDate() {
        return invoicdDate;
    }

    public void setInvoicdDate(Date invoicdDate) {
        this.invoicdDate = invoicdDate;
    }
}
