package user;

import java.text.SimpleDateFormat;

import com.utn.grpc.GreetingOuterClass.Empty;
import com.utn.grpc.GreetingOuterClass.Greeting;
import com.utn.grpc.GreetingOuterClass.Person;
import com.utn.grpc.GreetingServiceGrpc.GreetingServiceImplBase;

import io.grpc.stub.StreamObserver;

public class GreetingService extends GreetingServiceImplBase {

	@Override
	public void hello(Person request, StreamObserver<Greeting> responseObserver) {
		System.out.println("LLEGO ACA CHE");
		String name = request.getName();
		String timeStart = request.getTimeStart();
		System.out.println(name + timeStart);
		Greeting.Builder response = Greeting.newBuilder();
		response.setMessage("Hola querido " + name).setTimeStart(new SimpleDateFormat("HH:mm:ss dd/MM/yyyy").toString());
		
		
	}

	@Override
	public void helloServerSide(Empty request, StreamObserver<Greeting> responseObserver) {
		// TODO Auto-generated method stub
		super.helloServerSide(request, responseObserver);
	}

	@Override
	public StreamObserver<Person> helloClientSide(StreamObserver<Greeting> responseObserver) {
		// TODO Auto-generated method stub
		return super.helloClientSide(responseObserver);
	}

	@Override
	public StreamObserver<Person> helloBidirectional(StreamObserver<Greeting> responseObserver) {
		// TODO Auto-generated method stub
		return super.helloBidirectional(responseObserver);
	}

		
}
