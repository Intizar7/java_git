package tr.org.linux.kamp.garbagecollection;
   import java.util.*;

public class GarbageCollection {
	public static void main(String[] args) {
		Runtime rt =Runtime.getRuntime();
		System.out.println("Toplam Bellek:"+rt.totalMemory());
		//iki tane time turu mevcut 1.compile time 2.run time
		String str=new String("Linux Yaz Kampı");
		String str1=new String("Java Programlama");
		System.out.println(str);
		str=str1;
		str=null;
		//System.gc();
		
		GcTest gcTest=new GcTest();
		gcTest.value=1;
		gcTest=null;
		//gcTest.finalize();
		System.out.println("Boş Bellek:"+rt.freeMemory());
		System.gc();	
		System.out.println("boş bellek garbage collector çalıştıktan sonra : " + rt.freeMemory());
		//System.out.println(gcTest.value);

	}

}
