
public class Main4 {
	
		public static void subirvolumen(int volumen){
			volumen= volumen + 10;
	}
		public static void subirVolumen(TV tv) {
			tv.subirvolumen();
		}

	public static void main (String[] args) {
		// variables por valor o primitivas int, float, double, char
		// variables por referencia u valor
		int volumen = 100;
		TV tv1 = new TV();
		tv1.encender();
		tv1.subirvolumen();
		tv1.subirvolumen();
		
		subirvolumen(volumen);
		subirVolumen(tv1);
		subirVolumen(tv1);
		
		System.out.println(volumen);
		System.out.println(tv1.volumen);
		
		
	}
		
		

	}


