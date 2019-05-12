package utn.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import utn.demo.model.Repair;
import utn.demo.repositories.RepairRepository;

import java.util.List;

@RequestMapping("/repair")
@RestController
public class RepairController {

    @Autowired
    RepairRepository repairRepository;

    @PostMapping("")
    public void addRepair(@RequestBody Repair r) {
        repairRepository.save(r);
    }

    @GetMapping("")
    public List<Repair> getAll(){
        return repairRepository.findAll();
    }

}
