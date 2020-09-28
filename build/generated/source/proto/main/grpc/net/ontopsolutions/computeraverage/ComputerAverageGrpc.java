package net.ontopsolutions.computeraverage;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.31.0)",
    comments = "Source: computeraverage/computeraverage.proto")
public final class ComputerAverageGrpc {

  private ComputerAverageGrpc() {}

  public static final String SERVICE_NAME = "net.ontopsolutions.computeraverage.ComputerAverage";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<net.ontopsolutions.computeraverage.ComputerAverageRequest,
      net.ontopsolutions.computeraverage.ComputerAverageResponse> getAverageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "average",
      requestType = net.ontopsolutions.computeraverage.ComputerAverageRequest.class,
      responseType = net.ontopsolutions.computeraverage.ComputerAverageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<net.ontopsolutions.computeraverage.ComputerAverageRequest,
      net.ontopsolutions.computeraverage.ComputerAverageResponse> getAverageMethod() {
    io.grpc.MethodDescriptor<net.ontopsolutions.computeraverage.ComputerAverageRequest, net.ontopsolutions.computeraverage.ComputerAverageResponse> getAverageMethod;
    if ((getAverageMethod = ComputerAverageGrpc.getAverageMethod) == null) {
      synchronized (ComputerAverageGrpc.class) {
        if ((getAverageMethod = ComputerAverageGrpc.getAverageMethod) == null) {
          ComputerAverageGrpc.getAverageMethod = getAverageMethod =
              io.grpc.MethodDescriptor.<net.ontopsolutions.computeraverage.ComputerAverageRequest, net.ontopsolutions.computeraverage.ComputerAverageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "average"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.ontopsolutions.computeraverage.ComputerAverageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.ontopsolutions.computeraverage.ComputerAverageResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ComputerAverageMethodDescriptorSupplier("average"))
              .build();
        }
      }
    }
    return getAverageMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ComputerAverageStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ComputerAverageStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ComputerAverageStub>() {
        @java.lang.Override
        public ComputerAverageStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ComputerAverageStub(channel, callOptions);
        }
      };
    return ComputerAverageStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ComputerAverageBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ComputerAverageBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ComputerAverageBlockingStub>() {
        @java.lang.Override
        public ComputerAverageBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ComputerAverageBlockingStub(channel, callOptions);
        }
      };
    return ComputerAverageBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ComputerAverageFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ComputerAverageFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ComputerAverageFutureStub>() {
        @java.lang.Override
        public ComputerAverageFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ComputerAverageFutureStub(channel, callOptions);
        }
      };
    return ComputerAverageFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class ComputerAverageImplBase implements io.grpc.BindableService {

    /**
     */
    public io.grpc.stub.StreamObserver<net.ontopsolutions.computeraverage.ComputerAverageRequest> average(
        io.grpc.stub.StreamObserver<net.ontopsolutions.computeraverage.ComputerAverageResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getAverageMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAverageMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                net.ontopsolutions.computeraverage.ComputerAverageRequest,
                net.ontopsolutions.computeraverage.ComputerAverageResponse>(
                  this, METHODID_AVERAGE)))
          .build();
    }
  }

  /**
   */
  public static final class ComputerAverageStub extends io.grpc.stub.AbstractAsyncStub<ComputerAverageStub> {
    private ComputerAverageStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ComputerAverageStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ComputerAverageStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<net.ontopsolutions.computeraverage.ComputerAverageRequest> average(
        io.grpc.stub.StreamObserver<net.ontopsolutions.computeraverage.ComputerAverageResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getAverageMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class ComputerAverageBlockingStub extends io.grpc.stub.AbstractBlockingStub<ComputerAverageBlockingStub> {
    private ComputerAverageBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ComputerAverageBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ComputerAverageBlockingStub(channel, callOptions);
    }
  }

  /**
   */
  public static final class ComputerAverageFutureStub extends io.grpc.stub.AbstractFutureStub<ComputerAverageFutureStub> {
    private ComputerAverageFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ComputerAverageFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ComputerAverageFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_AVERAGE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ComputerAverageImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ComputerAverageImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_AVERAGE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.average(
              (io.grpc.stub.StreamObserver<net.ontopsolutions.computeraverage.ComputerAverageResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ComputerAverageBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ComputerAverageBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return net.ontopsolutions.computeraverage.Computeraverage.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ComputerAverage");
    }
  }

  private static final class ComputerAverageFileDescriptorSupplier
      extends ComputerAverageBaseDescriptorSupplier {
    ComputerAverageFileDescriptorSupplier() {}
  }

  private static final class ComputerAverageMethodDescriptorSupplier
      extends ComputerAverageBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ComputerAverageMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ComputerAverageGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ComputerAverageFileDescriptorSupplier())
              .addMethod(getAverageMethod())
              .build();
        }
      }
    }
    return result;
  }
}
