package vn.edu.ifi.secrak.service.Invoice;

import vn.edu.ifi.secrak.entity.Invoice;

import java.util.List;

public  interface  InvoiceService {

    Invoice saveInvoice(Long user_id, Long asset_id, Invoice invoice);

    Invoice getInvoiceById(Long id);

    List<Invoice> getAllInvoice();

}
