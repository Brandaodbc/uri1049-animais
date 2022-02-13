import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String animalClass;
		String animalType;
		String animalAlim;
		
		int opc = 1;

		while (opc == 1) {
			
			animalClass = sc.next();
			animalType = sc.next();
			animalAlim = sc.next();

			switch (animalClass) {
			case "vertebrado":
				if ("ave".equalsIgnoreCase(animalType)) {

					if ("carnivoro".equalsIgnoreCase(animalAlim)) {
						System.out.println("aguia");
					} else if ("onivoro".equalsIgnoreCase(animalAlim)) {
						System.out.println("pomba");
					}

				} else if ("mamifero".equalsIgnoreCase(animalType)) {

					if ("onivoro".equalsIgnoreCase(animalAlim)) {
						System.out.println("homem");
					} else if ("herbivoro".equalsIgnoreCase(animalAlim)) {
						System.out.println("vaca");
					}

				}

				break;

			case "invertebrado":

				if ("inseto".equalsIgnoreCase(animalType)) {

					if ("hematofago".equalsIgnoreCase(animalAlim)) {
						System.out.println("pulga");
					} else if ("herbivoro".equalsIgnoreCase(animalAlim)) {
						System.out.println("lagarta");
					}

				} else if ("anelideo".equalsIgnoreCase(animalType)) {

					if ("hematofago".equalsIgnoreCase(animalAlim)) {
						System.out.println("sanguessuga");
					} else if ("onivoro".equalsIgnoreCase(animalAlim)) {
						System.out.println("minhoca");
					}

				}

				break;

			default:
				System.out.println("Tipo de animal inexistente");
				break;
			}

			System.out.print("Deseja realiza nova consulta? [1-Sim/0-Nao] ");
			opc = sc.nextInt();

		}
		
		System.out.println("Fim da execucao do programa");
		
		sc.close();
	}

}
