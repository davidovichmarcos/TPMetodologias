package utn.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utn.demo.model.Repair;
import utn.demo.repositories.RepairRepository;

import java.util.List;
import java.util.Optional;

@Service
public class RepairService {

    @Autowired
    RepairRepository repairRepository;

    public void addRepair(Repair r) {
        repairRepository.save(r);
    }

    public List<Repair> getAll (){
        return repairRepository.findAll();
    }

    public Optional<Repair> getRepairById(Integer id) {
        return repairRepository.findById(id);
    }
}
