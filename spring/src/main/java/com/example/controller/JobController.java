package com.example.controller;

import java.util.List;
import java.util.UUID;
import javax.transaction.Transactional;
import com.example.model.JobModel;
import com.example.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.lang.Exception;

@RestController
@RequestMapping("/hr")
public class JobController {
    private final JobService jobService;

    @GetMapping("/allAppliedJobs")
    public ResponseEntity<List<JobModel>> getJobs() {
        List<JobModel> list = jobService.findAllJobDetails();
        return new ResponseEntity<>(list, HttpStatus.OK);   
    }

    @Autowired
    public JobController(JobService jobService) {
        this.jobService = jobService;
    }

    @PostMapping("/addJob")
    public ResponseEntity<JobModel> jobSave(@RequestBody JobModel jobDetails) {
        JobModel newJob = jobService.addJobDetails(jobDetails);
        return new ResponseEntity<>(newJob, HttpStatus.CREATED);
    }


    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> jobtDelete(@PathVariable("id") Long id) {
        jobService.deleteJobById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/hr/jobEdit/{id}")
    public ResponseEntity<JobModel> getJobDetailsById(@PathVariable("id") Long id) {
        JobModel jobDetails = jobService.findJobById(id);
        return new ResponseEntity<>(jobDetails, HttpStatus.OK);
    }

    @PutMapping("/hr/jobEdit/{id}")
    public ResponseEntity<JobModel> jobsEditSave(@PathVariable("id") Long id) {
        JobModel jobDetails = jobService.findJobById(id);
        JobModel updateJobDetails = jobService.updateJobDetails(jobDetails);
        return new ResponseEntity<>(updateJobDetails, HttpStatus.OK);
    }




    // @GetMapping("/hr/allAppliedJobs")
    // public ResponseEntity<List<JobModel>> getAllAppliedJobs() {
        
    // }
    
}


