import java.util.Scanner;
public class numerosPositivos {

	public static void main(String[] args) {
		int numero;
		Scanner S=new Scanner(System.in);
		System.out.println("Introduzca un valor");
		numero=S.nextInt();
		if (numero>=0) {
			for (int i=1;i<=numero;i++) {
				System.out.println(i);
			}
			
		} else {
			System.out.println("El número es cero o negativo");
		}
		System.out.println("Fin de programa");
	}
	
}
