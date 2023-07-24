
public class TestDescuento {

	public static void main(String[] args) {

		double valorCompra = 300.0;

		if (valorCompra >= 100 && valorCompra <= 199.99) {
			valorCompra = valorCompra - (0.1 * valorCompra);
		} else {
			if (valorCompra >= 200 && valorCompra <= 299.99) {
				valorCompra = valorCompra - (0.15 * valorCompra);
			} else {
				if (valorCompra >= 300) {
					valorCompra = valorCompra - (0.2 * valorCompra);
				}
			}

		}
		System.out.println(valorCompra);
	}
}
