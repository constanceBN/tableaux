package tableaux;

/* Afficher tous les éléments du tableau. 
 * /!\ Il est interdit d’utiliser une boucle! KEEP IT SIMPLE
 */
public class Exercice3 {

	public static void main(String[] args) {
		
        // Déclarer le tableau et initialiser les élèments du tableau (12, 15, 13, 10, 8, 9, 13, 14) en une ligne.
		int[] tab = { 12, 15, 13, 10, 8, 9, 13, 14};
		
        // Afficher tous les éléments du tableau (les uns en desous des autres).
		System.out.println(tab[0]);
		System.out.println(tab[1]);
		System.out.println(tab[2]); 
		System.out.println(tab[3]);
		System.out.println(tab[4]);
		System.out.println(tab[5]);
		System.out.println(tab[6]);
		System.out.println(tab[7]);
		
        // Afficher tous les éléments du tableau (sur une seule ligne).
		System.out.println("");
		System.out.print(tab[0] + " ");
		System.out.print(tab[1] + " ");
		System.out.print(tab[2] + " "); 
		System.out.print(tab[3] + " ");
		System.out.print(tab[4] + " ");
		System.out.print(tab[5] + " ");
		System.out.print(tab[6] + " ");
		System.out.print(tab[7]);
		
}

}