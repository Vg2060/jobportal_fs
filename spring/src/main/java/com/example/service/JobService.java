package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.Exception;
import javax.transaction.Transactional;
import com.amazonaws.services.s3control.model.JobReportScope;
import com.example.model.JobModel;
import com.example.repo.JobRepo;
import com.example.exception.JobNotFoundException;
import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class JobService {
    private final JobRepo jobRepo;

    @Autowired
    public JobService(JobRepo jobRepo) {
        this.jobRepo = jobRepo;
    }

    public JobModel addJobDetails(JobModel jobDetails) {
        // jobDetails.setId(UUID.randomUUID().toString());
        jobDetails.setJobCode(UUID.randomUUID().toString());
        return jobRepo.save(jobDetails);
    }

    public List<JobModel> findAllJobDetails() {
        return jobRepo.findAll();
    }

    public JobModel updateJobDetails(JobModel jobDetails) {
        return jobRepo.save(jobDetails);
    }

    public JobModel findJobById(Long id)  {
        return jobRepo.findJobById(id).
                orElseThrow(() -> new JobNotFoundException("Not Found"+id));
    }

    public void deleteJobById(Long id){
        jobRepo.deleteJobById(id);
    }
}
