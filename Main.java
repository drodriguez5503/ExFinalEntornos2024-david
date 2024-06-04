// Esto debería ser el código de un programa que calcule la hipotenusa dado un tamaño de los dos lados
// catetos de un triángulo rectángulo que introduzca el usuario.
import java.util.Scanner


public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa la longitud de los catetos");
		int catetoA = sc.nextInt();
		int catetoB = sc.nextInt();		
		
		double hipotenusa = Math.sqrt(catetoA*catetoA + catetoB*CatetoB);
		System.out.println("La hipotenusa de este triángulo es: "+hipotenusa);

	}
}
