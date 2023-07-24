
public class TestReferencia2 {

	public static void main(String[] args) {
		Cliente diego = new Cliente();
		diego.setNombre("Diego");
		diego.setDocumento("45444332");
		diego.setTelefono("999922222");
		
		Cuenta cuentaDiego = new Cuenta(1);
		cuentaDiego.getTitular().setNombre("Diego");
		
		System.out.println(cuentaDiego.getTitular().getNombre());
	}
}
