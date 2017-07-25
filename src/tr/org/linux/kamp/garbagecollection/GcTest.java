package tr.org.linux.kamp.garbagecollection;

public class GcTest {
	
	int value;
	protected void finalize() throws Throwable{
		super.finalize();
		System.out.println("Garbage Collection çalıştı");
	}

}
