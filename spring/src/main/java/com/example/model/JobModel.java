package com.example.model;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Entity
public class JobModel implements Serializable {
    private static final long serialVersionUID = 42L;
    @Id
    // @GeneratedValue(generator="system-uuid")
    // @org.hibernate.annotations.GenericGenerator(name="system-uuid", strategy = "uuid")

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String jobTitle;
    private String jobLocation;
    private String jobType;
    private String jobDesc;
    private String salary;
    private String logoUrl;
    private String experience;
    private Date expiryDate;

    @Column(nullable = false, updatable = false)
    private String jobCode;

    public JobModel() {}

    public JobModel(Long id, String jobTitle,String jobLocation, String jobType, String salary, String logoUrl, String experience, Date expiryDate) {
        
        this.jobType = jobType;
        this.jobLocation = jobLocation;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.logoUrl = logoUrl;
        this.experience = experience;
        this.expiryDate = expiryDate;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;        
    }

    public String getlogoUrl() {
        return logoUrl;
    }

    public void setlogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;      
    } 

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;   
    } 

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void getExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate; 
    } 
    
    public String getJobLocation() {
        return jobLocation;
    }

    public void setJobLocation(String jobLocation) {
        this.jobLocation = jobLocation;
    }

    public String getJobType() {
        return jobType;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    public String getJobDesc() {
        return jobDesc;
    }

    public void setJobDesc(String jobDesc) {
        this.jobDesc = jobDesc;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "JobDetails{" +
        "id=" + id + '\'' +
        ", jobTitle='" + jobTitle + '\'' +
        ", jobLocation='" + jobLocation + '\'' +
        ", jobType='" + jobType + '\'' +
        ", jobDesc='" + jobDesc + '\'' +
        ", salary='" + salary + '\'' +
        ", experience='" + experience + '\'' +
        ", expiryDate='" + expiryDate + '\'' +
        ", logoUrl='" + logoUrl + '\'' +
        '}';
    }

    public void setJobCode(String jobCode) {
        this.jobCode = jobCode;
    }

    public String getJobCode(String jobCode) {
        return jobCode;
    }
}
