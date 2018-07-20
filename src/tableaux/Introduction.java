package tableaux;

/* Dans cet exercice, on va travailler avec un tableau d’entiers appelé tab contenant les valeurs suivantes: 
 * 12, 15, 13, 10, 8, 9, 13 et 14.
 */
public class Introduction {

	public static void main(String[] args) {
		
        // Déclarer le tableau.
		int[] tab;
		
        // Donner une taille au tableau.
		tab = new int[8];
		
        // Initialiser les élèments du tableau (12, 15, 13, 10, 8, 9, 13, 14).
		tab[0] = 12;
	    tab[1] = 15;
	    tab[2] = 13;
	    tab[3] = 10;
	    tab[4] = 8;
	    tab[5] = 9;
	    tab[6] = 13;
	    tab[7] = 14;
	    
        // Créer un tableau en une ligne (les positions commencent automatiquement à 0 à partir de la 1 ère valeur).
	    int[] tabBis = {12, 15, 13, 10, 8, 9, 13, 14};
}

}