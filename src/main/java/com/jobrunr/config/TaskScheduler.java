package com.jobrunr.config;

import com.jobrunr.entities.JobInfo;
import com.jobrunr.repos.JobInfoRepo;
import com.jobrunr.service.JobSchedulerService;
import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.jobrunr.scheduling.JobScheduler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Slf4j
public class TaskScheduler {

    @Autowired
    private JobScheduler jobScheduler;

    @Autowired
    private JobInfoRepo jobInfoRepo;

    @Autowired
    private JobSchedulerService jobSchedulerService;

    @PostConstruct
    public void scheduleJobs() {
        List<JobInfo> jobInfos = jobInfoRepo.findAll();

        for (JobInfo jobInfo : jobInfos) {
            scheduleJob(jobInfo);
        }
    }

    private void scheduleJob(JobInfo jobInfo) {
        if (jobInfo.getCronExpression() != null) {
            jobScheduler.scheduleRecurrently(jobInfo.getJobName(), jobInfo.getCronExpression(),
                    () -> jobSchedulerService.executeJobBasedOnType(jobInfo));
        }
    }

}