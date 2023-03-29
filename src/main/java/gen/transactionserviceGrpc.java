package gen;

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
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: Transaction.proto")
public final class transactionserviceGrpc {

  private transactionserviceGrpc() {}

  public static final String SERVICE_NAME = "transactionservice";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<gen.Transaction.convertcurrencyrequest,
      gen.Transaction.convertcurrencyresponse> getConvertMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "convert",
      requestType = gen.Transaction.convertcurrencyrequest.class,
      responseType = gen.Transaction.convertcurrencyresponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<gen.Transaction.convertcurrencyrequest,
      gen.Transaction.convertcurrencyresponse> getConvertMethod() {
    io.grpc.MethodDescriptor<gen.Transaction.convertcurrencyrequest, gen.Transaction.convertcurrencyresponse> getConvertMethod;
    if ((getConvertMethod = transactionserviceGrpc.getConvertMethod) == null) {
      synchronized (transactionserviceGrpc.class) {
        if ((getConvertMethod = transactionserviceGrpc.getConvertMethod) == null) {
          transactionserviceGrpc.getConvertMethod = getConvertMethod = 
              io.grpc.MethodDescriptor.<gen.Transaction.convertcurrencyrequest, gen.Transaction.convertcurrencyresponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "transactionservice", "convert"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gen.Transaction.convertcurrencyrequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gen.Transaction.convertcurrencyresponse.getDefaultInstance()))
                  .setSchemaDescriptor(new transactionserviceMethodDescriptorSupplier("convert"))
                  .build();
          }
        }
     }
     return getConvertMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static transactionserviceStub newStub(io.grpc.Channel channel) {
    return new transactionserviceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static transactionserviceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new transactionserviceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static transactionserviceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new transactionserviceFutureStub(channel);
  }

  /**
   */
  public static abstract class transactionserviceImplBase implements io.grpc.BindableService {

    /**
     */
    public void convert(gen.Transaction.convertcurrencyrequest request,
        io.grpc.stub.StreamObserver<gen.Transaction.convertcurrencyresponse> responseObserver) {
      asyncUnimplementedUnaryCall(getConvertMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getConvertMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                gen.Transaction.convertcurrencyrequest,
                gen.Transaction.convertcurrencyresponse>(
                  this, METHODID_CONVERT)))
          .build();
    }
  }

  /**
   */
  public static final class transactionserviceStub extends io.grpc.stub.AbstractStub<transactionserviceStub> {
    private transactionserviceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private transactionserviceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected transactionserviceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new transactionserviceStub(channel, callOptions);
    }

    /**
     */
    public void convert(gen.Transaction.convertcurrencyrequest request,
        io.grpc.stub.StreamObserver<gen.Transaction.convertcurrencyresponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getConvertMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class transactionserviceBlockingStub extends io.grpc.stub.AbstractStub<transactionserviceBlockingStub> {
    private transactionserviceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private transactionserviceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected transactionserviceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new transactionserviceBlockingStub(channel, callOptions);
    }

    /**
     */
    public gen.Transaction.convertcurrencyresponse convert(gen.Transaction.convertcurrencyrequest request) {
      return blockingUnaryCall(
          getChannel(), getConvertMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class transactionserviceFutureStub extends io.grpc.stub.AbstractStub<transactionserviceFutureStub> {
    private transactionserviceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private transactionserviceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected transactionserviceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new transactionserviceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<gen.Transaction.convertcurrencyresponse> convert(
        gen.Transaction.convertcurrencyrequest request) {
      return futureUnaryCall(
          getChannel().newCall(getConvertMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CONVERT = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final transactionserviceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(transactionserviceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CONVERT:
          serviceImpl.convert((gen.Transaction.convertcurrencyrequest) request,
              (io.grpc.stub.StreamObserver<gen.Transaction.convertcurrencyresponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class transactionserviceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    transactionserviceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return gen.Transaction.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("transactionservice");
    }
  }

  private static final class transactionserviceFileDescriptorSupplier
      extends transactionserviceBaseDescriptorSupplier {
    transactionserviceFileDescriptorSupplier() {}
  }

  private static final class transactionserviceMethodDescriptorSupplier
      extends transactionserviceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    transactionserviceMethodDescriptorSupplier(String methodName) {
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
      synchronized (transactionserviceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new transactionserviceFileDescriptorSupplier())
              .addMethod(getConvertMethod())
              .build();
        }
      }
    }
    return result;
  }
}
