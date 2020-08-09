
public class Main {

	public static void main(String[] args) {
		TV tv1;
		tv1 =new TV();//instancia 
		tv1.encender();
		System.out.println(tv1.encendido);
		tv1.subirvolumen();
		tv1.subirvolumen();
		tv1.bajarvolumen();
		tv1.bajarvolumen();
		tv1.bajarvolumen();
		System.out.println("Volumen: " + tv1.volumen);
		
		tv1.avanzarCanal();
		tv1.avanzarCanal();
		tv1.avanzarCanal();
		tv1.apagar();
		tv1.avanzarCanal();
		tv1.avanzarCanal();
		System.out.println("Canal: " + tv1.canal);
		
		TV tv2;
		tv2 =new TV();
		tv2.encender();
		tv2.subirvolumen();
		tv2.subirvolumen();
		tv2.subirvolumen();
		tv2.subirvolumen();
		System.out.println("Volumen Tv2: " + tv2.volumen);

	}

}
