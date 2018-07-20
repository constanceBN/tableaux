package tableaux;

//Importer le Scanner.
import java.util.Scanner;

// Demander à l’utilisateur d’entrer un nombre entier et stocker sa valeur dans une variable nommée input.
public class Exercice5 {

	public static void main(String[] args) {
		
        // Déclarer le tableau et initialiser les élèments du tableau (12, 15, 13, 10, 8, 9, 13, 14) en une ligne.
		int[] tab = {12, 15, 13, 10, 8, 9, 13, 14};
		
/* L’utilisateur entre un nombre entier grace à la classe Scanner.
 * 
 * P.S: System.in ("in" permet d'entrer quelque chose dans l'ordinateur) et System.out ("out" permet de sortir quelque chose de l'ordinateur).
 */
		
        // Déclarer une variable de type Scanner qui se nomme sc.
        // Scanner <nom du Scanner>.
		Scanner sc; 
		
		// Créer une instance de Scanner avec le mot-clé new.
		// <nom du Scanner> = new Scanner(System.in);
		sc = new Scanner(System.in);
		
		// Afficher la demande faite à l'utilisateur de saisire un nombre entier.
		System.out.println("Enter un nombre entier.");
		
/* Pour lire un int, on doit utiliser nextInt().
 *  
 * Pour récupérer un type de variable, on appelle la méthode next<Type de variable commençant par une majuscule> (la majuscule est une convention de nommage de Java).
 * 
 * P.S: next() récupère le premier mot d'une chaine de caractère et nextLigne() récupère tous les mots de la chaine de caractère avec les espaces compris.
 */
		// La variable input stocke le nombre entier saisi par l'utilisateur.
		int input = sc.nextInt();
		
}

}