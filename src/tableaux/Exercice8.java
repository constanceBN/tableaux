package tableaux;

//Importer le Scanner.
import java.util.Scanner;

/* Demander à l’utilisateur d’entrer un nombre entier. 
 * Le comparer au troisième élément du tableau. 
 * Si les nombres sont identiques, afficher "Bravo!". 
 * Sinon, afficher "Perdu!". 
 */
public class Exercice8 {

	public static void main(String[] args) {
		
	// Déclarer le tableau et initialiser les élèments du tableau (12, 15, 13, 10, 8, 9, 13, 14) en une ligne.
	int[] tab = {12, 15, 13, 10, 8, 9, 13, 14};
	
	// Déclarer une variable de type Scanner qui se nomme sc et créer une instance de Scanner en une seule ligne.
	Scanner sc = new Scanner(System.in);
	
	// Afficher la demander faite à l’utilisateur d’entrer un nombre entier. 
	System.out.print("Veuillez entrer un nombre entier svp.");
	
	// Créer une variable nommée input pour y stocker l'entier entré par l'utilisateur.
	int input = sc.nextInt();
	
	// Comparer l'input au troisième élément du tableau. 
	if (input == tab[2]) 
	{
		
	// Afficher "Bravo!" si les nombres sont identiques.
		System.out.print("Bravo!");
	}
	
	// Sinon, afficher "Perdu!". 
	else 
	{
		System.out.print("Perdu!");
	}
	
}
}