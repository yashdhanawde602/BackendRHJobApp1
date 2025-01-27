package com.jobapp.rhjobapp.Controller;

import com.jobapp.rhjobapp.Entity.Job;
import com.jobapp.rhjobapp.Service.JobS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("http://localhost:4200/")
public class JobC {
//hii
    @Autowired
    private JobS jobS;
    @PostMapping("/addjob")
    public Job addJob(@RequestBody Job job) {
        return jobS.addJob(job);
    }

    @GetMapping("/getjobs")
    public List<Job> getJobs() {
        return jobS.getJob();
    }

    @DeleteMapping("/deletejob")
    public Job deleteJob(@RequestBody Job job) {
        return jobS.deletejob(job);
    }

    @GetMapping("/getbyid/{jobId}")
    public Job getById(@PathVariable Integer jobId) {
        return jobS.getjobbyid(jobId);
    }

    @PutMapping("/updatejob")
    public Job updateJob(@RequestBody Job job) {
        return jobS.updateJob(job);
    }




}
