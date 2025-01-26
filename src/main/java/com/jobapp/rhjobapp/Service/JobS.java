package com.jobapp.rhjobapp.Service;

import com.jobapp.rhjobapp.Entity.Job;
import com.jobapp.rhjobapp.Repository.Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class JobS {

    @Autowired
    private Dao dao;

    public Job addJob(Job job)
    {
       return  dao.save(job);
    }

    public ArrayList<Job> getJob()
    {
        return (ArrayList<Job>) dao.findAll();
    }

    public Job deletejob(Job job)
    {
         dao.delete(job);
        return job;
    }

    public Job getjobbyid(Integer id)
    {
        return dao.findById(id).orElseThrow();
    }

    public Job updateJob(Job job)
    {
        dao.findById(job.getId()).orElseThrow();
        return dao.save(job);
    }



}
