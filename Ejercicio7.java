import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce cantidad en euros");
		double euros = sc.nextDouble();
		System.out.println("Introduce moneda de cambio (dolares/yenes/libras)");
		String moneda = sc.next();
		
		cambio(euros, moneda);

	}
	public static void cambio(double e, String m) {
		double dinero = 0;
		if (m.equals("dolares")) {
			dinero = e*1.28611;
			System.out.println("El cambio en dolares es: " +dinero);
		}else if (m.equals("yenes")) {
			dinero = e*129.852;
			System.out.println("El cambio en yenes es: " +dinero);
		}else if (m.equals("libras")){
			dinero= e*0.86;
			System.out.println("El cambio en libras es: " + dinero);
		}else {
			System.out.println("No conozco esa moneda");
		}
	}

}
