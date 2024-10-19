package com.jobrunr.repos;

import com.jobrunr.entities.JobInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobInfoRepo extends JpaRepository<JobInfo ,Long> {
}
