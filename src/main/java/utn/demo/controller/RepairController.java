package utn.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import utn.demo.model.Repair;
import utn.demo.repositories.RepairRepository;
import utn.demo.service.RepairService;

import java.util.List;
import java.util.Optional;

@RequestMapping("/repair")
@RestController
public class RepairController {

    @Autowired
    RepairService repairService;

    @PostMapping("")
    public void addRepair(@RequestBody Repair r) {
        repairService.addRepair(r);
    }

    @GetMapping("")
    public List<Repair> getAll(){
        return repairService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Repair> getRepairById(@RequestParam Integer id) {
        return repairService.getRepairById(id);
    }

}
