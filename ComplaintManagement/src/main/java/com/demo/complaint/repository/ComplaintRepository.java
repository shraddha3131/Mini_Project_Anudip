package com.demo.complaint.repository;
import com.demo.complaint.model.Complaint;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComplaintRepository extends JpaRepository<Complaint, Integer> {

}
