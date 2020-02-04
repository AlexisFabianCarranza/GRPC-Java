package com.utn.grpc;

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

public final class GreetingServiceGrpc {

  private GreetingServiceGrpc() {}

  public static final String SERVICE_NAME = "GreetingService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.utn.grpc.GreetingOuterClass.Person,
      com.utn.grpc.GreetingOuterClass.Greeting> getHelloMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "hello",
      requestType = com.utn.grpc.GreetingOuterClass.Person.class,
      responseType = com.utn.grpc.GreetingOuterClass.Greeting.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.utn.grpc.GreetingOuterClass.Person,
      com.utn.grpc.GreetingOuterClass.Greeting> getHelloMethod() {
    io.grpc.MethodDescriptor<com.utn.grpc.GreetingOuterClass.Person, com.utn.grpc.GreetingOuterClass.Greeting> getHelloMethod;
    if ((getHelloMethod = GreetingServiceGrpc.getHelloMethod) == null) {
      synchronized (GreetingServiceGrpc.class) {
        if ((getHelloMethod = GreetingServiceGrpc.getHelloMethod) == null) {
          GreetingServiceGrpc.getHelloMethod = getHelloMethod = 
              io.grpc.MethodDescriptor.<com.utn.grpc.GreetingOuterClass.Person, com.utn.grpc.GreetingOuterClass.Greeting>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "GreetingService", "hello"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.utn.grpc.GreetingOuterClass.Person.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.utn.grpc.GreetingOuterClass.Greeting.getDefaultInstance()))
                  .setSchemaDescriptor(new GreetingServiceMethodDescriptorSupplier("hello"))
                  .build();
          }
        }
     }
     return getHelloMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.utn.grpc.GreetingOuterClass.Empty,
      com.utn.grpc.GreetingOuterClass.Greeting> getHelloServerSideMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "helloServerSide",
      requestType = com.utn.grpc.GreetingOuterClass.Empty.class,
      responseType = com.utn.grpc.GreetingOuterClass.Greeting.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.utn.grpc.GreetingOuterClass.Empty,
      com.utn.grpc.GreetingOuterClass.Greeting> getHelloServerSideMethod() {
    io.grpc.MethodDescriptor<com.utn.grpc.GreetingOuterClass.Empty, com.utn.grpc.GreetingOuterClass.Greeting> getHelloServerSideMethod;
    if ((getHelloServerSideMethod = GreetingServiceGrpc.getHelloServerSideMethod) == null) {
      synchronized (GreetingServiceGrpc.class) {
        if ((getHelloServerSideMethod = GreetingServiceGrpc.getHelloServerSideMethod) == null) {
          GreetingServiceGrpc.getHelloServerSideMethod = getHelloServerSideMethod = 
              io.grpc.MethodDescriptor.<com.utn.grpc.GreetingOuterClass.Empty, com.utn.grpc.GreetingOuterClass.Greeting>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "GreetingService", "helloServerSide"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.utn.grpc.GreetingOuterClass.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.utn.grpc.GreetingOuterClass.Greeting.getDefaultInstance()))
                  .setSchemaDescriptor(new GreetingServiceMethodDescriptorSupplier("helloServerSide"))
                  .build();
          }
        }
     }
     return getHelloServerSideMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.utn.grpc.GreetingOuterClass.Person,
      com.utn.grpc.GreetingOuterClass.Greeting> getHelloClientSideMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "helloClientSide",
      requestType = com.utn.grpc.GreetingOuterClass.Person.class,
      responseType = com.utn.grpc.GreetingOuterClass.Greeting.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.utn.grpc.GreetingOuterClass.Person,
      com.utn.grpc.GreetingOuterClass.Greeting> getHelloClientSideMethod() {
    io.grpc.MethodDescriptor<com.utn.grpc.GreetingOuterClass.Person, com.utn.grpc.GreetingOuterClass.Greeting> getHelloClientSideMethod;
    if ((getHelloClientSideMethod = GreetingServiceGrpc.getHelloClientSideMethod) == null) {
      synchronized (GreetingServiceGrpc.class) {
        if ((getHelloClientSideMethod = GreetingServiceGrpc.getHelloClientSideMethod) == null) {
          GreetingServiceGrpc.getHelloClientSideMethod = getHelloClientSideMethod = 
              io.grpc.MethodDescriptor.<com.utn.grpc.GreetingOuterClass.Person, com.utn.grpc.GreetingOuterClass.Greeting>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "GreetingService", "helloClientSide"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.utn.grpc.GreetingOuterClass.Person.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.utn.grpc.GreetingOuterClass.Greeting.getDefaultInstance()))
                  .setSchemaDescriptor(new GreetingServiceMethodDescriptorSupplier("helloClientSide"))
                  .build();
          }
        }
     }
     return getHelloClientSideMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.utn.grpc.GreetingOuterClass.Person,
      com.utn.grpc.GreetingOuterClass.Greeting> getHelloBidirectionalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "helloBidirectional",
      requestType = com.utn.grpc.GreetingOuterClass.Person.class,
      responseType = com.utn.grpc.GreetingOuterClass.Greeting.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.utn.grpc.GreetingOuterClass.Person,
      com.utn.grpc.GreetingOuterClass.Greeting> getHelloBidirectionalMethod() {
    io.grpc.MethodDescriptor<com.utn.grpc.GreetingOuterClass.Person, com.utn.grpc.GreetingOuterClass.Greeting> getHelloBidirectionalMethod;
    if ((getHelloBidirectionalMethod = GreetingServiceGrpc.getHelloBidirectionalMethod) == null) {
      synchronized (GreetingServiceGrpc.class) {
        if ((getHelloBidirectionalMethod = GreetingServiceGrpc.getHelloBidirectionalMethod) == null) {
          GreetingServiceGrpc.getHelloBidirectionalMethod = getHelloBidirectionalMethod = 
              io.grpc.MethodDescriptor.<com.utn.grpc.GreetingOuterClass.Person, com.utn.grpc.GreetingOuterClass.Greeting>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "GreetingService", "helloBidirectional"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.utn.grpc.GreetingOuterClass.Person.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.utn.grpc.GreetingOuterClass.Greeting.getDefaultInstance()))
                  .setSchemaDescriptor(new GreetingServiceMethodDescriptorSupplier("helloBidirectional"))
                  .build();
          }
        }
     }
     return getHelloBidirectionalMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GreetingServiceStub newStub(io.grpc.Channel channel) {
    return new GreetingServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GreetingServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new GreetingServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GreetingServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new GreetingServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class GreetingServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void hello(com.utn.grpc.GreetingOuterClass.Person request,
        io.grpc.stub.StreamObserver<com.utn.grpc.GreetingOuterClass.Greeting> responseObserver) {
      asyncUnimplementedUnaryCall(getHelloMethod(), responseObserver);
    }

    /**
     */
    public void helloServerSide(com.utn.grpc.GreetingOuterClass.Empty request,
        io.grpc.stub.StreamObserver<com.utn.grpc.GreetingOuterClass.Greeting> responseObserver) {
      asyncUnimplementedUnaryCall(getHelloServerSideMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.utn.grpc.GreetingOuterClass.Person> helloClientSide(
        io.grpc.stub.StreamObserver<com.utn.grpc.GreetingOuterClass.Greeting> responseObserver) {
      return asyncUnimplementedStreamingCall(getHelloClientSideMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.utn.grpc.GreetingOuterClass.Person> helloBidirectional(
        io.grpc.stub.StreamObserver<com.utn.grpc.GreetingOuterClass.Greeting> responseObserver) {
      return asyncUnimplementedStreamingCall(getHelloBidirectionalMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getHelloMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.utn.grpc.GreetingOuterClass.Person,
                com.utn.grpc.GreetingOuterClass.Greeting>(
                  this, METHODID_HELLO)))
          .addMethod(
            getHelloServerSideMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.utn.grpc.GreetingOuterClass.Empty,
                com.utn.grpc.GreetingOuterClass.Greeting>(
                  this, METHODID_HELLO_SERVER_SIDE)))
          .addMethod(
            getHelloClientSideMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                com.utn.grpc.GreetingOuterClass.Person,
                com.utn.grpc.GreetingOuterClass.Greeting>(
                  this, METHODID_HELLO_CLIENT_SIDE)))
          .addMethod(
            getHelloBidirectionalMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                com.utn.grpc.GreetingOuterClass.Person,
                com.utn.grpc.GreetingOuterClass.Greeting>(
                  this, METHODID_HELLO_BIDIRECTIONAL)))
          .build();
    }
  }

  /**
   */
  public static final class GreetingServiceStub extends io.grpc.stub.AbstractStub<GreetingServiceStub> {
    private GreetingServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GreetingServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreetingServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GreetingServiceStub(channel, callOptions);
    }

    /**
     */
    public void hello(com.utn.grpc.GreetingOuterClass.Person request,
        io.grpc.stub.StreamObserver<com.utn.grpc.GreetingOuterClass.Greeting> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getHelloMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void helloServerSide(com.utn.grpc.GreetingOuterClass.Empty request,
        io.grpc.stub.StreamObserver<com.utn.grpc.GreetingOuterClass.Greeting> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getHelloServerSideMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.utn.grpc.GreetingOuterClass.Person> helloClientSide(
        io.grpc.stub.StreamObserver<com.utn.grpc.GreetingOuterClass.Greeting> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getHelloClientSideMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.utn.grpc.GreetingOuterClass.Person> helloBidirectional(
        io.grpc.stub.StreamObserver<com.utn.grpc.GreetingOuterClass.Greeting> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getHelloBidirectionalMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class GreetingServiceBlockingStub extends io.grpc.stub.AbstractStub<GreetingServiceBlockingStub> {
    private GreetingServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GreetingServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreetingServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GreetingServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.utn.grpc.GreetingOuterClass.Greeting hello(com.utn.grpc.GreetingOuterClass.Person request) {
      return blockingUnaryCall(
          getChannel(), getHelloMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.utn.grpc.GreetingOuterClass.Greeting> helloServerSide(
        com.utn.grpc.GreetingOuterClass.Empty request) {
      return blockingServerStreamingCall(
          getChannel(), getHelloServerSideMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class GreetingServiceFutureStub extends io.grpc.stub.AbstractStub<GreetingServiceFutureStub> {
    private GreetingServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GreetingServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreetingServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GreetingServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.utn.grpc.GreetingOuterClass.Greeting> hello(
        com.utn.grpc.GreetingOuterClass.Person request) {
      return futureUnaryCall(
          getChannel().newCall(getHelloMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_HELLO = 0;
  private static final int METHODID_HELLO_SERVER_SIDE = 1;
  private static final int METHODID_HELLO_CLIENT_SIDE = 2;
  private static final int METHODID_HELLO_BIDIRECTIONAL = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GreetingServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GreetingServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_HELLO:
          serviceImpl.hello((com.utn.grpc.GreetingOuterClass.Person) request,
              (io.grpc.stub.StreamObserver<com.utn.grpc.GreetingOuterClass.Greeting>) responseObserver);
          break;
        case METHODID_HELLO_SERVER_SIDE:
          serviceImpl.helloServerSide((com.utn.grpc.GreetingOuterClass.Empty) request,
              (io.grpc.stub.StreamObserver<com.utn.grpc.GreetingOuterClass.Greeting>) responseObserver);
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
        case METHODID_HELLO_CLIENT_SIDE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.helloClientSide(
              (io.grpc.stub.StreamObserver<com.utn.grpc.GreetingOuterClass.Greeting>) responseObserver);
        case METHODID_HELLO_BIDIRECTIONAL:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.helloBidirectional(
              (io.grpc.stub.StreamObserver<com.utn.grpc.GreetingOuterClass.Greeting>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class GreetingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GreetingServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.utn.grpc.GreetingOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("GreetingService");
    }
  }

  private static final class GreetingServiceFileDescriptorSupplier
      extends GreetingServiceBaseDescriptorSupplier {
    GreetingServiceFileDescriptorSupplier() {}
  }

  private static final class GreetingServiceMethodDescriptorSupplier
      extends GreetingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    GreetingServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (GreetingServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GreetingServiceFileDescriptorSupplier())
              .addMethod(getHelloMethod())
              .addMethod(getHelloServerSideMethod())
              .addMethod(getHelloClientSideMethod())
              .addMethod(getHelloBidirectionalMethod())
              .build();
        }
      }
    }
    return result;
  }
}
