package net.ontopsolutions.computeraverage.client;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import net.ontopsolutions.computeraverage.ComputerAverageGrpc;
import net.ontopsolutions.computeraverage.ComputerAverageRequest;
import net.ontopsolutions.computeraverage.ComputerAverageResponse;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class ComputerAverageClient {

    public static void main(String[] args) {
        ComputerAverageClient client = new ComputerAverageClient();
        client.run();
    }

    private void run() {
        ManagedChannel managedChannel = ManagedChannelBuilder
                .forAddress("localhost", 50051)
                .usePlaintext()
                .build();
        callServer(managedChannel);
        managedChannel.shutdown();
    }

    private void callServer(ManagedChannel managedChannel) {

        ComputerAverageGrpc.ComputerAverageStub async = ComputerAverageGrpc.newStub(managedChannel);
        CountDownLatch latch = new CountDownLatch(1);

        StreamObserver<ComputerAverageRequest> requestObserver =
        async.average(new StreamObserver<ComputerAverageResponse>() {

            @Override
            public void onNext(ComputerAverageResponse value) {
                System.out.println("Received a response from the server");
                System.out.println(value.getAverage());
            }

            @Override
            public void onError(Throwable t) {
            }

            @Override
            public void onCompleted() {
                System.out.println("Server has completed sending us data");
                latch.countDown();
            }
        });

        for (int i=0;i<1000;i++) {
            requestObserver.onNext(ComputerAverageRequest.newBuilder().setNumber(i).build());
        }



        

    }
}
