package com.jobrunr.service;

import com.jobrunr.entities.JobInfo;
import com.jobrunr.enums.JobTypeEnum;
import com.jobrunr.config.jobScheduler.ExternalJobScheduler;
import com.jobrunr.config.jobScheduler.InternalJobScheduler;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class JobSchedulerService {

    private final InternalJobScheduler internalScheduler;
    private final ExternalJobScheduler externalScheduler;


    public void executeJobBasedOnType(JobInfo jobInfo) {
        if (jobInfo.getJobType() == JobTypeEnum.REST) {
            externalScheduler.callRestService(jobInfo);

        } else if (jobInfo.getJobType() == JobTypeEnum.GRPC) {
            externalScheduler.callGrpcService(jobInfo);

        } else if (jobInfo.getJobType() == JobTypeEnum.INTERNAL) {
            internalScheduler.executeJob(jobInfo);
        }
    }

}
