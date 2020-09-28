package net.ontopsolutions.computeraverage.server;

import io.grpc.stub.StreamObserver;
import net.ontopsolutions.computeraverage.ComputerAverageGrpc;
import net.ontopsolutions.computeraverage.ComputerAverageRequest;
import net.ontopsolutions.computeraverage.ComputerAverageResponse;

public class ComputerAverageServiceImpl extends ComputerAverageGrpc.ComputerAverageImplBase {

    @Override
    public StreamObserver<ComputerAverageRequest> average(StreamObserver<ComputerAverageResponse> responseObserver) {

        StreamObserver<ComputerAverageRequest> request = new StreamObserver<ComputerAverageRequest>() {

            int sum = 0;
            int count = 0;

            @Override
            public void onNext(ComputerAverageRequest value) {
                sum += value.getNumber();
                count += 1;
            }

            @Override
            public void onError(Throwable t) {
            }

            @Override
            public void onCompleted() {
                double average = (double) sum / count;
                ComputerAverageResponse r = ComputerAverageResponse.newBuilder()
                        .setAverage(average)
                        .build();
                responseObserver.onNext(r);
                responseObserver.onCompleted();
            }
        };

        return request;
    }
}
