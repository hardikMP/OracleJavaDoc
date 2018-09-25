package Interface;

public class Welcome implements SayHello {

	@Override
	public void sayHelloTo(String name) {
		System.out.println("Hello " + name);
	}

}
