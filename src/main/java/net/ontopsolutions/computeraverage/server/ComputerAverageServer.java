package net.ontopsolutions.computeraverage.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class ComputerAverageServer {

    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("Server started");
        Server server = ServerBuilder
                .forPort(50051)
                .addService(new ComputerAverageServiceImpl())
                .build();

        server.start();

        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("Received shutdown server");
            server.shutdown();
            System.out.println("Successfully stopped the server");
        }));

        server.awaitTermination();
    }
}
