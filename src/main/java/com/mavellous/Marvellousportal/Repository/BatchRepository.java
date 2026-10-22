
package com.mavellous.Marvellousportal.Repository;

import com.mavellous.Marvellousportal.Entity.BatchEntry;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BatchRepository extends JpaRepository<BatchEntry, Long> {
}
