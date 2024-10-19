package com.jobrunr.jobs.internalJobs;

import com.jobrunr.entities.JobInfo;
import org.springframework.stereotype.Component;

@Component("dailyReportJobHandler")
public class DailyReportJobHandler implements JobHandler{
    @Override
    public void handleJob(JobInfo jobInfo) {
        System.out.println("Generating daily report...");
    }
}
