package tp7suite;

public class Nom {

	String[] preNom = { "Leila", "Kader", "Richard", "Pablo", "Guillaume", "Fethi", "Garance", "Charles", "Sébastien",
			"Eric", "Jose", "Luis" };

	String[] nomDeFamille = { "ABERKANE", "AOUAD", "AVISSE", "BLEY", "LAFFORGUE", "MEZILLET", "RICHARD", "TAMDRARI",
			"TRAPE", "TSHIBWID", "VICENTE" };

	public void afficheNoms() {
		for (int i = 0; i < preNom.length; ++i) {
			System.out.println(preNom[i] + " " + nomDeFamille[i]);
		}
	}

	public static void main(String[] args) {

		Nom bigData = new Nom();
		bigData.afficheNoms();

	}

}
