package generation_tableau_aleatoire;

public class Aleatoire {

	/**
	 * tableau de nombre "int"
	 */
	int[] nombre = new int[5];

	/**
	 * Méthodes qui stocke les nombres aléatoirement
	 */
	public void stockeNombres() {
		for (int i = 0; i < nombre.length; ++i) {
			nombre[i] = (int) Math.random();
			nombre[i] = alea(0, 10);
		}
	}

	public static int alea(int i, int j) {
		return (int) (Math.random() * (j + i));
	}

	/**
	 * Affiche le nombre
	 */
	public void afficheNombres() {
		for (int i = 0; i < nombre.length; ++i) {
			System.out.println(nombre[i] + "\n");
		}
	}

}
