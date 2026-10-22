
package com.mavellous.Marvellousportal.Controller;

import com.mavellous.Marvellousportal.Entity.BatchEntry;
import com.mavellous.Marvellousportal.Repository.BatchRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Batches")
public class BatchEntryController {

    private final BatchRepository batchRepository;

    public BatchEntryController(BatchRepository batchRepository) {
        this.batchRepository = batchRepository;
    }

    @GetMapping
    public List<BatchEntry> getAll() {
        return batchRepository.findAll();
    }

    @GetMapping("/id/{myid}")
    public Optional<BatchEntry> getBatchEntryById(@PathVariable Long myid) {
        return batchRepository.findById(myid);
    }

    @PostMapping
    public BatchEntry createEntry(@RequestBody BatchEntry myentry) {
        myentry.setId(null);
        return batchRepository.save(myentry);
    }

    @DeleteMapping("/id/{myid}")
    public String deleteEntryByID(@PathVariable Long myid) {
        if (!batchRepository.existsById(myid)) {
            return "Batch not found";
        }

        batchRepository.deleteById(myid);
        return "Data deleted successfully";
    }

    @PutMapping("/id/{myid}")
    public BatchEntry updateEntryByID(
            @PathVariable Long myid,
            @RequestBody BatchEntry entry) {

        entry.setId(myid);
        return batchRepository.save(entry);
    }
}
