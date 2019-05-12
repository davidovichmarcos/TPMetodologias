package utn.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import utn.demo.model.BillReceipt;

@Repository
public interface BillReceiptRepository extends JpaRepository<BillReceipt,Integer> {
}
