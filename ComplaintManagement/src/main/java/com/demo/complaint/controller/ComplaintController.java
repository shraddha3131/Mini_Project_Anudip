package com.demo.complaint.controller;
import com.demo.complaint.model.Complaint;
import com.demo.complaint.repository.ComplaintRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/api/complaints")
public class ComplaintController {
	@Autowired
    private ComplaintRepository repo;

    @GetMapping
    public List<Complaint> getAll() {
        return repo.findAll();
    }

    @PostMapping
    public Complaint create(@RequestBody Complaint complaint) {
        complaint.setStatus("Pending");
        return repo.save(complaint);
    }

    @PutMapping("/{id}/resolve")
    public Complaint resolve(@PathVariable int id) {
        Complaint c = repo.findById(id).orElse(null);
        if (c != null) {
            c.setStatus("Resolved");
            return repo.save(c);
        }
        return null;
    }
}

