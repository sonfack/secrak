package vn.edu.ifi.secrak.service.buyer;


import vn.edu.ifi.secrak.entity.Buyer;
import vn.edu.ifi.secrak.entity.User;

import java.util.List;

public interface BuyerService {
    Buyer saveBuyer(User buyer);

    Buyer saveBuyerByUserId(Long id);

    Buyer getBuyerById(Long id);

    Buyer getBuyerByIdPath(Long id);

    List<Buyer> getAllBuyer();

}
