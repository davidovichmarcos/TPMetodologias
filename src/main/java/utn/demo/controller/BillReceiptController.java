package utn.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import utn.demo.model.BillReceipt;
import utn.demo.repositories.BillReceiptRepository;

import java.util.List;

@RequestMapping("/billreceipt")
@RestController
public class BillReceiptController {

    @Autowired
    BillReceiptRepository billReceiptRepository;

    @PostMapping("")
    public void addBillReceipt(@RequestBody BillReceipt b) {
        billReceiptRepository.save(b);
    }

    @GetMapping("")
    public List<BillReceipt> getAll(){
        return billReceiptRepository.findAll();
    }

}

