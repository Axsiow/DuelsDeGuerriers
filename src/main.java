import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class main {

	public static void main(String[] args) {

		// Init des fighters
		Guerrier g1 = new Guerrier("Jay Ksaaffer", 35, 3);
		Guerrier g2 = new Guerrier("Morph Hal", 30, 4);
		Nain n1 = new Nain("Mardézelf", 25, 2, 4);
		Nain n2 = new Nain("Hildegarde Havou", 12, 4, 4);
		Elfe e1 = new Elfe("Amaury Oley", 30, 2, 6);
		Elfe e2 = new Elfe("Marie Houana",35, 2, 5);

		g1.afficherInfos();
		g2.afficherInfos();
		n1.afficherInfos();
		n2.afficherInfos();
		e1.afficherInfos();
		e2.afficherInfos();

		// create listes combatants
		ArrayList<Guerrier> fighterBot = new ArrayList<Guerrier>();
		ArrayList<Guerrier> fighterPlayer = new ArrayList<Guerrier>();

		// Filling listes
		ArrayList<Guerrier> arrayGuerrier = new ArrayList<Guerrier>();
			arrayGuerrier.add(g1);
			arrayGuerrier.add(g2);
			arrayGuerrier.add(n1);
			arrayGuerrier.add(n2);
			arrayGuerrier.add(e1);
			arrayGuerrier.add(e2);

		int guerriersMax = arrayGuerrier.size();

		Scanner in = new Scanner(System.in);

		// boucle créations teams
		// Boucle bot choice fightters
		for (int i=0; i<guerriersMax/2; i++) {
			Random random = new Random();
			int choiceBot = random.nextInt(arrayGuerrier.size());
			System.out.println(choiceBot);
			fighterBot.add(arrayGuerrier.get(choiceBot));
			System.out.println(arrayGuerrier.get(choiceBot).nom+" a rejoint l'équipe adverse");
			arrayGuerrier.remove(choiceBot);

			// Display remaining fighters
			System.out.println("Guerriers restants:");
			for (int wesh=0; wesh<arrayGuerrier.size(); wesh++) {
				System.out.println(wesh+1);
				arrayGuerrier.get(wesh).afficherInfos();
			}

			// Bouclet human choice fighters
			System.out.println("Veuillez choisir une guerrier pour votre équipe !");

			if (arrayGuerrier.size() == 1) {
				System.out.println(arrayGuerrier.get(0).nom+" a rejoint votre équipe");
				fighterPlayer.add(arrayGuerrier.get(0));
				arrayGuerrier.remove(0);
			} else {
				int choicePlayer = in.nextInt();
				System.out.println(arrayGuerrier.get(choicePlayer-1).nom+" a rejoint votre équipe");
				fighterPlayer.add(arrayGuerrier.get(choicePlayer-1));
				arrayGuerrier.remove(choicePlayer-1);
			}
		}

		// L'ordinateur présente son gus et le joueur choisis aussi son gus
		System.out.println(fighterBot.get(0)+" est présenter par l'équipe adverse et va vous marave la gueule !");
		System.out.println("Voici votre liste :");
		for (int cretin=0; cretin<fighterPlayer.size(); cretin++) {
			System.out.println(cretin+1);
			fighterPlayer.get(cretin).afficherInfos();
		}
		System.out.println("Quels Gueriers voulez vous envoyer ?!");
		int choicePlayer = in.nextInt();
		System.out.println(fighterPlayer.get(choicePlayer-1).nom+" va se faire marave la gueule !");
	}
}
