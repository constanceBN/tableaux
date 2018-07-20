package tableaux;

/* Afficher tous les éléments du tableau.
 * /!\ La boucle "for" est obligatoire! 
 */
public class Exercice4 {

	public static void main(String[] args) {
		
        // Déclarer le tableau et initialiser les élèments du tableau (12, 15, 13, 10, 8, 9, 13, 14) en une ligne.
		int[] tab = {12, 15, 13, 10, 8, 9, 13, 14};
		
/* Afficher tous les éléments du tableau en utiliser une boucle for.
 * 
 * for (<initilisation>; <condition>; <incrémentation>) 
 * {
 * <bloc>
 * }
 * 
 * P.S: i pour itérateur
 * i++ est l'équivalent de i = i + 1 
 */
		
		// Afficher tous les éléments.
		for (int i = 0; i <8; i++) 
		{
			System.out.println(tab[i]);
		}
		
}

}