
public class CuentaCorriente {
	public static int contador;
	public static void sumarContador() {
		contador +=100;
	}
	
	
	public double saldo;

		public double getSaldo() {//reotrnar el saldo se utiliza double
			return saldo;
			}
		public void retiro(double dinero) {//cuando no el void 
			saldo -= dinero;
		}
		public void depositar(double dinero) {
			
			saldo += dinero;
		}
	
}
