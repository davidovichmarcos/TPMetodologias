package utn.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utn.demo.config.LoggerConfig;
import utn.demo.model.Repair;
import utn.demo.repositories.RepairRepository;

import java.util.List;

@Service
public class RepairService {

    @Autowired
    RepairRepository repairRepository;

    public Repair addRepair(Repair r) {
        repairRepository.save(r);
        return r;
    }

    public List<Repair> getAll (){
        return repairRepository.findAll();
    }

    public Repair getRepairById(Integer id) {
        return repairRepository.findById(id).orElse(null);
    }

    public void deleteRepairById(Integer id) {
        Repair repairToDelete = getRepairById(id);
        if (!repairToDelete.equals(null)) {
            repairRepository.delete(repairToDelete);
        } else {
            LoggerConfig.LOGGER.error("The Repair doesn't exist");
        }
    }

}
