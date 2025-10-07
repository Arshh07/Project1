package com.hub.skillhub.repository;

import com.hub.skillhub.model.Job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepository extends JpaRepository<Job, Long> {}
