package com.sber.service;

import com.google.protobuf.Timestamp;
import io.quarkus.grpc.GrpcService;
import io.smallrye.mutiny.Uni;

import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

// Event-driven (async) approach
//@GrpcService
public class GooseServiceImplMutiny implements GooseService {
    @Override
    public Uni<MessageResponse> gooseHello(MessageRequest request)
    {
        var localDate = Instant.ofEpochSecond(request.getTime().getSeconds())
                .atZone( ZoneId.of( "America/Montreal" ) )
                .toLocalDate();
        var formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
        var timeStr = formatter.format(localDate);
        System.out.println(request.getHello() + " " + timeStr);
        return Uni.createFrom().item(() -> MessageResponse.newBuilder()
                .setHello("Hello from server!")
                .setTime(Timestamp.newBuilder().setSeconds(Instant.now().getEpochSecond())).build());
    }
}
