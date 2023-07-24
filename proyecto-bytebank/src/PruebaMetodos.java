
public class PruebaMetodos {

	public static void main(String[] args) {
		Cuenta miCuenta = new Cuenta(1);
		miCuenta.depositar(300);
		miCuenta.depositar(200);
		
		System.out.println(miCuenta.getSaldo());
		
		miCuenta.retirar(100);
		System.out.println(miCuenta.getSaldo());
		
		Cuenta cuentaJimena = new Cuenta(1);
		cuentaJimena.depositar(1000);
		boolean puedeTransferir = cuentaJimena.transferir(400, miCuenta);
		
		if (puedeTransferir) {
			System.out.println("Transferencia exitosa");
		} else {
			System.out.println("No es posible");
		}
				
		System.out.println(cuentaJimena.getSaldo());
		System.out.println(miCuenta.getSaldo());
		
	}
}
