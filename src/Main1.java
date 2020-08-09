
public class Main1 {

	public static void main(String[] args) {
		TV tv1 =new TV();
		TV tv2 =new TV();
		tv1.encender();
		tv1.subirvolumen();
		tv1.subirvolumen();
		tv1.subirvolumen();
		tv1.subirvolumen();
		
		tv2=tv1;
		tv2.subirvolumen();
		tv2.subirvolumen();
		
		System.out.println("Volumen tv1: " + tv1.volumen);
		System.out.println("Volumen tv2: " + tv2.volumen);
		

	}

}
