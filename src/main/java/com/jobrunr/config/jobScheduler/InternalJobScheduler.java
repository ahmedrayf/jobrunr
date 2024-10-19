package com.jobrunr.config.jobScheduler;

import com.jobrunr.entities.JobInfo;
import com.jobrunr.jobs.internalJobs.JobHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class InternalJobScheduler {

    private final Map<String, JobHandler> jobHandlerMap;

    @Autowired
    public InternalJobScheduler(Map<String, JobHandler> jobHandlerMap) {
        this.jobHandlerMap = jobHandlerMap;
    }

    public void executeJob(JobInfo jobInfo) {
        JobHandler handler = jobHandlerMap.get(jobInfo.getInternalMethod());
        if (handler != null) {
            handler.handleJob(jobInfo);
        } else {
            throw new IllegalArgumentException("No handler found for method: " + jobInfo.getInternalMethod());
        }
    }

}
