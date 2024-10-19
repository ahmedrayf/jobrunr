package com.jobrunr.jobs.internalJobs;

import com.jobrunr.entities.JobInfo;

public interface JobHandler {
    void handleJob(JobInfo jobInfo);
}
