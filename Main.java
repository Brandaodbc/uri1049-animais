import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String animalClass;
		String animalType;
		String animalAlim;

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
				
			} 
			else if ("mamifero".equalsIgnoreCase(animalType)) {
				
				if ("onivoro".equalsIgnoreCase(animalAlim)) {
					System.out.println("homem");
				}
				else if ("herbivoro".equalsIgnoreCase(animalAlim)) {
					System.out.println("vaca");
				}
				
			}
			
			break;
			
		case "invertebrado":

			if ("inseto".equalsIgnoreCase(animalType)) {
				
				if ("hematofago".equalsIgnoreCase(animalAlim)) {
					System.out.println("pulga");
				}
				else if ("herbivoro".equalsIgnoreCase(animalAlim)) {
					System.out.println("lagarta");
				}
				
			}
			else if ("anelideo".equalsIgnoreCase(animalType)) {
				
				if ("hematofago".equalsIgnoreCase(animalAlim)) {
					System.out.println("sanguessuga");
				}
				else if ("onivoro".equalsIgnoreCase(animalAlim)) {
					System.out.println("minhoca");
				}
				
			}
			
			break;

		default:
			System.out.println("Tipo de animal inexistente");
			break;
		}

		sc.close();
	}

}
