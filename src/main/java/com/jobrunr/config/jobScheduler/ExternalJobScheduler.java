package com.jobrunr.config.jobScheduler;

import com.jobrunr.entities.JobInfo;
import org.springframework.stereotype.Component;

@Component
public class ExternalJobScheduler {

    public void callRestService(JobInfo jobInfo){
        System.out.println("Executing REST job: " + jobInfo.getJobName());

    }

    public void callGrpcService(JobInfo jobInfo){
        System.out.println("Executing gRPC job: " + jobInfo.getJobName());

    }


//    // Method for gRPC calls
//    public void executeGrpcJob(String grpcServerAddress, int port) {
//        System.out.println("Executing gRPC job with server: " + grpcServerAddress + " and port: " + port);
//        ManagedChannel channel = ManagedChannelBuilder.forAddress(grpcServerAddress, port)
//                .usePlaintext()
//                .build();
//
//        try {
//            // Assuming you have a generated gRPC stub
//            MyServiceGrpc.MyServiceBlockingStub stub = MyServiceGrpc.newBlockingStub(channel);
//
//            MyRequest request = MyRequest.newBuilder().setMessage("Execute gRPC Job").build();
//            MyResponse response = stub.executeJob(request);
//            System.out.println("gRPC Response: " + response.getResponseMessage());
//        } finally {
//            channel.shutdown();
//        }
//    }
//
//    public void executeJobBasedOnType(JobConfig jobConfig) {
//        if (jobConfig.getServiceType() == ServiceType.REST) {
//            executeRestJob(jobConfig.getUrl());
//        } else if (jobConfig.getServiceType() == ServiceType.GRPC) {
//            executeGrpcJob(jobConfig.getGrpcServerAddress(), jobConfig.getGrpcServerPort());
//        }
//    }
}
