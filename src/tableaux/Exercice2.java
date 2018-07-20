package tableaux;

// Modifier le cinquième élément du tableau pour lui attribuer la valeur 5 et l’afficher.
public class Exercice2 {
	
	public static void main(String[] args) {
		
        // Déclarer le tableau et initialiser les élèments du tableau (12, 15, 13, 10, 8, 9, 13, 14) en une ligne.
		int[] tab = {12, 15, 13, 10, 8, 9, 13, 14};
		
        // Modifier le cinquième élément du tableau pour lui attribuer la valeur 5.
		tab[4] = 5;
		
        // Afficher.
		System.out.println(tab[4]);
		
}

}