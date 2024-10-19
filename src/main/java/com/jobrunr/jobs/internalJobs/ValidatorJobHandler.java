package com.jobrunr.jobs.internalJobs;

import com.jobrunr.entities.JobInfo;
import org.springframework.stereotype.Component;

@Component("validatorJobHandler")
public class ValidatorJobHandler implements JobHandler{
    @Override
    public void handleJob(JobInfo jobInfo) {
        System.out.println("Validating data ...... ");
    }
}
