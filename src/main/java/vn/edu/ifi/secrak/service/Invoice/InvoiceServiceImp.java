package vn.edu.ifi.secrak.service.Invoice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import vn.edu.ifi.secrak.entity.Asset;
import vn.edu.ifi.secrak.entity.Invoice;
import vn.edu.ifi.secrak.entity.User;
import vn.edu.ifi.secrak.repository.AssetRepository;
import vn.edu.ifi.secrak.repository.InvoiceRepository;
import vn.edu.ifi.secrak.repository.UserRepository;

import java.util.List;

@Service
@RestController
public class InvoiceServiceImp implements InvoiceService{

    @Autowired
    private InvoiceRepository invoiceRepo;

    @Autowired
    private UserRepository userRepo;

    @Autowired
    private AssetRepository assetRepo;

    @Override
    @RequestMapping(value = "/api/secrak/user/{user_id}/asset/{asset_id}/save/invoice", method = RequestMethod.POST)
    public Invoice saveInvoice(@PathVariable Long user_id, @PathVariable Long asset_id, Invoice invoice){
        User user = userRepo.findById(user_id).get();
        Asset asset = assetRepo.findById(asset_id).get();
        invoice.setUser(user);
        invoice.setAsset(asset);
        return invoiceRepo.save(invoice);
    }

    @Override
    @RequestMapping(value = "/api/secrak/get/invoice/{id}", method = RequestMethod.GET)
    public Invoice getInvoiceById(@PathVariable Long id){
        return  invoiceRepo.findById(id).get();
    }

    @Override
    @RequestMapping(value = "/api/secrak/get/invoice", method = RequestMethod.GET)
    public List<Invoice> getAllInvoice(){
        return invoiceRepo.findAll();
    }

}
