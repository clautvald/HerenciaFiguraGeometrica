
public class Cuadrado extends FiguraGeometrica {

	public Cuadrado(int medida) {

		super(medida, 4);
	}

	public double ObtenerArea() {
		return medida_lado * medida_lado;
	}

	public void ImprimirFigura() {
		for (int i = 1; i < medida_lado; i++) {
			System.out.print("*");
			System.out.print(" ");
		}
		System.out.println("*");
		for (int i = 3; i <= medida_lado; i++) {
			System.out.print("*");
			for (int j = 2; j < medida_lado; j++) {
				System.out.print("  ");
			}
			System.out.println(" *");
		}
		for (int i = 1; i < medida_lado; i++) {
			System.out.print("*");
			System.out.print(" ");
		}
		System.out.println("*");
}
}

