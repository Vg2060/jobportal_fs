package com.example.repo;

/**
 * JobRepo
 */
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.Optional;
import com.example.model.JobModel;

public interface JobRepo extends JpaRepository<JobModel, Long> {
    void deleteJobById(Long id);

    Optional<JobModel> findJobById(Long id);
}