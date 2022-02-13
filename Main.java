import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String animalClass = " ";
		String animalType = " ";
		String animalAlim = " ";
		
		int opc = 1;
		int cont = 0;

		while (opc == 1) {
			
			System.out.print("Informe a classe do animal [vertebrado / invertebrado] : ");
			animalClass = sc.next();
			if ("vertebrado".equalsIgnoreCase(animalClass)) {
				System.out.print("Digite Ave ou Mamífero? ");
				animalType = sc.next();
				if ("ave".equalsIgnoreCase(animalType)) {
					System.out.print("Digite carnivoro ou onivoro? ");
					animalAlim = sc.next();
				}
				else if ("Mamifero".equalsIgnoreCase(animalType)) {
					System.out.print("Digite onivoro ou herbivoro? ");
					animalAlim = sc.next();
				}
			}
			else if ("invertebrado".equalsIgnoreCase(animalClass)) {
				System.out.print("Digite inseto ou anelideo? ");
				animalType = sc.next();
				if ("inseto".equalsIgnoreCase(animalType)) {
					System.out.print("Digite hematofago ou herbivoro? ");
					animalAlim = sc.next();
				}
				else if ("anelideo".equalsIgnoreCase(animalType)) {
					System.out.print("Digite hematofago ou onivoro? ");
					animalAlim = sc.next();
				}
				
			}
			
			System.out.println();
			
			switch (animalClass) {
			case "vertebrado":
				if ("ave".equalsIgnoreCase(animalType)) {

					if ("carnivoro".equalsIgnoreCase(animalAlim)) {
						System.out.println("Animal encontrado: Aguia");
					} else if ("onivoro".equalsIgnoreCase(animalAlim)) {
						System.out.println("Animal encontrado: Pomba");
					}

				} else if ("mamifero".equalsIgnoreCase(animalType)) {

					if ("onivoro".equalsIgnoreCase(animalAlim)) {
						System.out.println("Animal encontrado: Homem");
					} else if ("herbivoro".equalsIgnoreCase(animalAlim)) {
						System.out.println("Animal encontrado: Vaca");
					}

				}

				break;

			case "invertebrado":

				if ("inseto".equalsIgnoreCase(animalType)) {

					if ("hematofago".equalsIgnoreCase(animalAlim)) {
						System.out.println("Animal encontrado: Pulga");
					} else if ("herbivoro".equalsIgnoreCase(animalAlim)) {
						System.out.println("Animal encontrado: Lagarta");
					}

				} else if ("anelideo".equalsIgnoreCase(animalType)) {

					if ("hematofago".equalsIgnoreCase(animalAlim)) {
						System.out.println("Animal encontrado: Sanguessuga");
					} else if ("onivoro".equalsIgnoreCase(animalAlim)) {
						System.out.println("Animal encontrado: Minhoca");
					}

				}

				break;

			default:
				System.out.println("Tipo de animal inexistente");
				break;
			}
			cont += 1;
			System.out.println();
			System.out.print("Deseja realiza nova consulta? [1-Sim/0-Nao] ");
			opc = sc.nextInt();
			System.out.println("__________________________________________");

		}
		System.out.println();
		System.out.println();
		System.out.println("Foram realizadas " + cont + " pesquisas.");
		System.out.println("Fim da execucao do programa");
		
		sc.close();
	}

}
