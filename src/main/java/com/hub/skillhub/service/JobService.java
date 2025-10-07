package com.hub.skillhub.service;

import com.hub.skillhub.model.Job;
import com.hub.skillhub.repository.JobRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class JobService {
    private final JobRepository repo;
    public JobService(JobRepository repo) { this.repo = repo; }

    public List<Job> findAll() { return repo.findAll(); }
    public Job save(Job job) { return repo.save(job); }
}
