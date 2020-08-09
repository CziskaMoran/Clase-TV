import java.util.Scanner;
public class Main2 {

	public static void main(String[] args) {
		CuentaCorriente cta1 = new CuentaCorriente();
		CuentaCorriente cta2 = new CuentaCorriente();
		Scanner in = new Scanner(System.in);
		System.out.println("Ingresar la cantidad de deposito para la cuenta corriente cta1");
		double dinero = in.nextDouble();
		cta1.depositar(dinero);
		
		System.out.println("Ingresar la cantidad de deposito para la cuenta corriente cta2");
		dinero = in.nextDouble();
		cta2.depositar(dinero);
		
		
		cta1.depositar(100);
		cta1.depositar(200);
		System.out.println("Saldo Cta1" + cta1.getSaldo());
		System.out.println("Saldo Cta1" + cta2.getSaldo());
		//cta1.depositar(100);
		//cta1.depositar(200);
	}

}
