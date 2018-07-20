package tableaux;

//Importer le Scanner.
import java.util.Scanner;

/* Demander à l’utilisateur d’entrer un nombre entier.
 * Le comparer à chaque élément du tableau. 
 * Si les nombres sont identiques, afficher "Bravo!". 
 * Sinon, afficher “Perdu !”.
 * /!\ La boucle est obligatoire!
 */
public class Exercice10 {

	public static void main(String[] args) {
		// Déclarer le tableau et initialiser les élèments du tableau (12, 15, 13, 10, 8, 9, 13, 14) en une ligne.
		int[] tab = {12, 15, 13, 10, 8, 9, 13, 14};
				
		// Déclarer une variable de type Scanner qui se nomme sc et créer une instance de Scanner en une seule ligne.
		Scanner sc = new Scanner(System.in);
				
		// Afficher la demander faite à l’utilisateur d’entrer un nombre entier. 
		System.out.print("Veuillez entrer un nombre entier svp.");
		    
		// Créer une variable nommée input pour y stocker l'entier entré par l'utilisateur.
		int input = sc.nextInt();
		
		// Comparer l'input à chaque élément du tableau grâce à la boucle for. 
		for (int position = 0; position <=7; position++) 
		{
			if (input == tab[position]) 
			{
				System.out.print("Bravo!");
			}
			else 
			{
				System.out.print("Perdu!");
			}
		}
		

	}

}

/* Taille du tableau:
 * <nom du tableau>.length
 * 
 * Ex:
 * for (int position = 0; position< tab.lenght; position++) 
 * {
 *     if (input == tab[position]) 
 * {
 *         System.out.print("Bravo!");
 * }
 * else
 * {
 *         System.out.print("Perdu!");
 * }
 * }
 */