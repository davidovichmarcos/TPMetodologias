package utn.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import utn.demo.model.Repair;
import utn.demo.service.RepairService;

import javax.ws.rs.core.MediaType;
import java.util.List;

@RequestMapping("/repair")
@RestController
public class RepairController {

    @Autowired
    RepairService repairService;

    @PostMapping(value = "", produces = {MediaType.APPLICATION_JSON})
    public Repair addRepair(@RequestBody Repair r) {
        return repairService.addRepair(r);
    }

    @GetMapping("")
    public List<Repair> getAll(){
        return repairService.getAll();
    }

    @GetMapping(value = "/{id}", produces = {MediaType.APPLICATION_JSON})
    public Repair getRepairById(@RequestParam Integer id) {
        return repairService.getRepairById(id);
    }

    @DeleteMapping(value = "/{id}", produces = {MediaType.APPLICATION_JSON})
    public void deleteRepairById(@RequestParam Integer id) {
        repairService.deleteRepairById(id);
    }

}
