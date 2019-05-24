package utn.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utn.demo.config.LoggerConfig;
import utn.demo.model.BillReceipt;
import utn.demo.repositories.BillReceiptRepository;

import java.util.List;

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

    public BillReceipt getBillReceiptById(Integer id) {
        return billReceiptRepository.findById(id).orElse(null);
    }

    public void deleteBillReceiptById(Integer id) {
        BillReceipt receiptToDelete = getBillReceiptById(id);
        if (!receiptToDelete.equals(null)) {
            billReceiptRepository.delete(receiptToDelete);
        } else {
            LoggerConfig.LOGGER.error("The BillReceipt doesn't exist");
        }
    }

}
