
public class TestReferencia3 {

	public static void main(String[] args) {
		Cuenta cuentaDiego = new Cuenta(1);		
		cuentaDiego.getTitular().setNombre("Diego");
		
		System.out.println(cuentaDiego.getTitular().getNombre());
	}
}
