package vn.edu.ifi.secrak.service.buyer;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vn.edu.ifi.secrak.entity.Buyer;
import vn.edu.ifi.secrak.entity.User;
import vn.edu.ifi.secrak.repository.BuyerRepository;
import vn.edu.ifi.secrak.repository.UserRepository;

import java.util.List;

@Service
@RestController
public class BuyerServiceImp implements BuyerService{

    @Autowired
    BuyerRepository buyerRepo;

    @Autowired
    UserRepository userRepo;



    public BuyerServiceImp(BuyerRepository buyerRepository){
        this.buyerRepo = buyerRepository;
    }
    @Override
    @RequestMapping(value = "/api/secrak/save/buyer")
    public Buyer saveBuyer(User user) {
        User saveUser = userRepo.save(user);
        Buyer buyer = new Buyer();

        //buyer.setUser(saveUser);
        return this.buyerRepo.save(buyer);
    }

    @Override
    @RequestMapping(value = "/api/secrak/user/{id}/save/buyer")
    public Buyer saveBuyerByUserId(@PathVariable Long id) {
        User user = userRepo.findById(id).get();
        Buyer buyer = new Buyer();
        //buyer.setUser(user);
        return buyerRepo.save(buyer);
    }

    @Override
    @RequestMapping(value = "/api/secrak/get/buyer/{id}")
    public Buyer getBuyerByIdPath(@PathVariable Long id) {
        return this.buyerRepo.findById(id).get();
    }

    @Override
    @RequestMapping(value = "/api/secrak/get/buyer")
    public Buyer getBuyerById(Long id) {
        return this.buyerRepo.findById(id).get();
    }

    @Override
    public List<Buyer> getAllBuyer() {
        return buyerRepo.findAll();
    }
}
