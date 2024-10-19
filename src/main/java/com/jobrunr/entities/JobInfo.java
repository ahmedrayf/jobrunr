package com.jobrunr.entities;

import com.jobrunr.enums.JobTypeEnum;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class JobInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String jobName;
    private String cronExpression;

    private String url;

    private String grpcServerAddress;
    private Integer grpcServerPort;

    @Enumerated(EnumType.STRING)
    private JobTypeEnum jobType; // REST or gRPC or internal job

    private String internalMethod;
}
