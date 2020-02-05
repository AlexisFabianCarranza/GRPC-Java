package user;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.utn.grpc.GreetingOuterClass.Empty;
import com.utn.grpc.GreetingOuterClass.Greeting;
import com.utn.grpc.GreetingOuterClass.Person;
import com.utn.grpc.GreetingServiceGrpc.GreetingServiceImplBase;

import io.grpc.stub.StreamObserver;

public class GreetingService extends GreetingServiceImplBase {

	@Override
	public void hello(Person request, StreamObserver<Greeting> responseObserver) {
		String name = request.getName();
		String timeStart = request.getTimeStart();
		Greeting.Builder response = Greeting.newBuilder();
		Date date = new Date();
		DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
		response.setMessage("Hola querido " + name).setTimeStart(dateFormat.format(date));
		
		responseObserver.onNext(response.build());
		responseObserver.onCompleted();
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
