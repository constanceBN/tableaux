package tableaux;

//Importer le Scanner.
import java.util.Scanner;

/* Demander à l’utilisateur d’entrer un nombre entier. 
 * Le comparer à chaque élément du tableau. 
 * Si les nombres sont identiques, afficher "Bravo!". 
 * Sinon, afficher "Perdu!".
 */
public class Exercice9 {

	public static void main(String[] args) {
		
		// Déclarer le tableau et initialiser les élèments du tableau (12, 15, 13, 10, 8, 9, 13, 14) en une ligne.
		int[] tab = {12, 15, 13, 10, 8, 9, 13, 14};
		
		// Déclarer une variable de type Scanner qui se nomme sc et créer une instance de Scanner en une seule ligne.
		Scanner sc = new Scanner(System.in);
		
		// Afficher la demander faite à l’utilisateur d’entrer un nombre entier. 
		System.out.print("Veuillez entrer un nombre entier svp.");
    
		// Créer une variable nommée input pour y stocker l'entier entré par l'utilisateur.
		int input = sc.nextInt();
		
		// Comparer l'input à chaque élément du tableau. 
		if (input == tab[0]) 
		{
			System.out.print("Bravo!");
		}
		else if (input == tab[1]) 
		{
			System.out.print("Bravo!");
		}
		else if (input == tab[2]) 
		{
			System.out.print("Bravo!");
		}
		else if (input == tab[3]) 
		{
			System.out.print("Bravo!");
		}
		else if (input == tab[4]) 
		{
			System.out.print("Bravo!");
		}
		else if (input == tab[5]) 
		{
			System.out.print("Bravo!");
		}
		else if (input == tab[6]) 
		{
			System.out.print("Bravo!");
		}
		else if (input == tab[7]) 
		{
			System.out.print("Bravo!");
		}
		else 
		{
			System.out.print("Perdu!");
		}
		
}
}
		
/* Comparer l'input à chaque élément du tableau en une ligne grace à || (ou).
 * if ((input == tab[0] || ) || (input == tab[1]) || (input == tab[2]) || (input == tab[3]) || (input == tab[4]) || (input == tab[5]) || (input == tab[6]) || (input == tab[7]))
 * { 
 *      System.out.print("Bravo!");
 * }
 */