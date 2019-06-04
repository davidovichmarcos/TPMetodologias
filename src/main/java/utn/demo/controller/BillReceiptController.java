package utn.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import utn.demo.model.BillReceipt;
import utn.demo.service.BillReceiptService;

import javax.ws.rs.HeaderParam;
import javax.ws.rs.core.MediaType;
import java.util.List;

@RequestMapping("/billreceipt")
@RestController
public class BillReceiptController {

    @Autowired
    BillReceiptService billReceiptService;

    @PostMapping(value = "", produces = {MediaType.APPLICATION_JSON})
    public BillReceipt addBillReceipt(@RequestBody BillReceipt b) {
        return billReceiptService.addBillReceipt(b);
    }

    @GetMapping(value = "", produces = {MediaType.APPLICATION_JSON})
    public List<BillReceipt> getAll(@RequestHeader(value = "User-Agent") String version){
        System.out.println(version);
        return billReceiptService.getAll();
    }

    @GetMapping(value = "/{id}", produces = {MediaType.APPLICATION_JSON})
    public BillReceipt getBillReceiptById(@RequestParam Integer id) {
        return billReceiptService.getBillReceiptById(id);
    }

    @DeleteMapping(value = "/{id}", produces = {MediaType.APPLICATION_JSON})
    public void deleteBillReceiptById(@RequestParam Integer id) {
        billReceiptService.deleteBillReceiptById(id);
    }

}

