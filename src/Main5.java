

public class Main5 {

	void sumarContadorMain() {
		CuentaCorriente.contador +=100;
	}
	
	
	
	static void sumaContadorMain1() {
		CuentaCorriente.contador +=100;
	}
	public static void main(String[] args) {
		//CuentaCorriente.contador=100;
		
		Main5 main = new Main5();
		main.sumarContadorMain();
		
		Main5.sumaContadorMain1();
		sumaContadorMain1();
		
		//CuentaCorriente.sumarContador();
		System.out.println(CuentaCorriente.contador);
		
		CuentaCorriente cta = new CuentaCorriente();
		cta.saldo = 100;
		

		

	}

}
