package utn.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utn.demo.model.BillReceipt;
import utn.demo.repositories.BillReceiptRepository;

import java.util.List;
import java.util.Optional;

@Service
public class BillReceiptService {

    @Autowired
    BillReceiptRepository billReceiptRepository;

    public void addBillReceipt(BillReceipt b) {
        billReceiptRepository.save(b);
    }

    public List<BillReceipt> getAll() {
        return billReceiptRepository.findAll();
    }

    public Optional<BillReceipt> getBillReceiptById(Integer id) {
        return billReceiptRepository.findById(id);
    }
}
