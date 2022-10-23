package com.sber.service;

import com.google.protobuf.Timestamp;
import io.grpc.stub.StreamObserver;
import io.quarkus.grpc.GrpcService;

import java.time.Instant;

// Default gRPC API
@GrpcService
public class GooseServiceImpl extends GooseServiceGrpc.GooseServiceImplBase {
    @Override
    public void gooseHello(MessageRequest request, StreamObserver<MessageResponse> responseObserver) {
        System.out.println(request.getHello());
        var response = MessageResponse.newBuilder()
                .setHello("Hello from server!")
                .setTime(Timestamp.newBuilder().setSeconds(Instant.now().getEpochSecond()).build())
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
