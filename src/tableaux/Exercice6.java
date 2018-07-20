package tableaux;

// Importer le Scanner.
import java.util.Scanner;

/* Demander à l’utilisateur d’entrer le nombre 25. 
 * Il devra remplacer le cinquième élément du tableau.
 */
public class Exercice6 {

	public static void main(String[] args) {
		
		// Déclarer le tableau et initialiser les élèments du tableau (12, 15, 13, 10, 8, 9, 13, 14) en une ligne.
		int [] tab = {12, 15, 13, 10, 8, 9, 13, 14};
		
		// Déclarer une variable de type Scanner qui se nomme sc et créer une instance de Scanner en une seule ligne.
		Scanner sc = new Scanner(System.in);
		
		// Afficher la demande faite à l'utilisateur de saisire le nombre entier 25.
		System.out.println("Saisisez le nombre entier 25.");
		
		// La variable valeurNb stocke le nombre entier 25 saisi par l'utilisateur.
		int valeurNb = sc.nextInt();
		
		// Remplacer le cinquième élément du tableau par le nombre entier 25.
		tab[4] = valeurNb;
		
		// Affichez la vérification.
		System.out.println(tab[4]);
		
}

}