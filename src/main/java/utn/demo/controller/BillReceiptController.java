package utn.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import utn.demo.model.BillReceipt;
import utn.demo.service.BillReceiptService;

import java.util.List;
import java.util.Optional;

@RequestMapping("/billreceipt")
@RestController
public class BillReceiptController {

    @Autowired
    BillReceiptService billReceiptService;

    @PostMapping("")
    public void addBillReceipt(@RequestBody BillReceipt b) {
        billReceiptService.addBillReceipt(b);
    }

    @GetMapping("")
    public List<BillReceipt> getAll(){
        return billReceiptService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<BillReceipt> getBillReceiptById(@RequestParam Integer id) {
        return billReceiptService.getBillReceiptById(id);
    }

}

