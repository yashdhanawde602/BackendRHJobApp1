package com.jobapp.rhjobapp.Repository;

import com.jobapp.rhjobapp.Entity.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Dao extends CrudRepository<Job,Integer> {


}
