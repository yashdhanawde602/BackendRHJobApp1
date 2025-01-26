package com.jobapp.rhjobapp.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

@Entity
@Table (name ="RH_Job")
public class Job {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;

    @JsonProperty("JobTitle")
    @Column(nullable = false)
    private String JobTitle;

    @JsonProperty("JobDescription")
    @Column(nullable = false)
    private String JobDescription;

    @JsonProperty("Company")
    @Column(nullable = false)
    private String Company;

    @JsonProperty("JobType")
    @Column(nullable = false)
    private String JobType;

    @JsonProperty("Salary")
    @Column(nullable = false)
    private Double Salary;

    public Job(Integer id, String jobTitle, String jobDescription, String company, String jobType, Double salary) {
        this.id = id;
        JobTitle = jobTitle;
        JobDescription = jobDescription;
        Company = company;
        JobType = jobType;
        Salary = salary;
    }
    public Job() {}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getJobTitle() {
        return JobTitle;
    }

    public void setJobTitle(String jobTitle) {
        JobTitle = jobTitle;
    }

    public String getJobDescription() {
        return JobDescription;
    }

    public void setJobDescription(String jobDescription) {
        JobDescription = jobDescription;
    }

    public String getCompany() {
        return Company;
    }

    public void setCompany(String company) {
        Company = company;
    }

    public String getJobType() {
        return JobType;
    }

    public void setJobType(String jobType) {
        JobType = jobType;
    }

    public Double getSalary() {
        return Salary;
    }

    public void setSalary(Double salary) {
        Salary = salary;
    }

    @Override
    public String toString() {
        return "Job{" +
                "id=" + id +
                ", JobTitle='" + JobTitle + '\'' +
                ", JobDescription='" + JobDescription + '\'' +
                ", Company='" + Company + '\'' +
                ", JobType='" + JobType + '\'' +
                ", Salary=" + Salary +
                '}';
    }
}
