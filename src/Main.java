import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Bienvenue dans le jeu de MasterMind!");
        System.out.println("Ce jeu est composé de 2 joueurs.");
        System.out.println("Le joueur numéro1 sera celui choisira la séquence de chiffres et le joueur numéro2 devra le deviner.");
        String sequenceChiffres= "";

        System.out.println("Joueur1: Veuillez saisir votre séquence de chiffres composés de 5 CHIFFRES ENTRE 1 ET 9: ");
        sequenceChiffres = clavier.nextLine();

        while (sequenceChiffres.length() != 5) {
            System.out.println("Erreur! Veuillez ressaisir 5 CHIFFRES ENTRE 1 ET 9:");
            sequenceChiffres = clavier.nextLine();
            }

            System.out.println("Le jeu peut démarrer!");
            int propositions=12;
            System.out.println("Vous disposez de "+propositions+" propositions");

        String sequenceDevinee= "";

    for (int i=0; i< propositions; i++) {
        System.out.println("Tentative "+(i+1)+" sur "+propositions+":");
        System.out.println ("Joueur2: Veuillez proposer une séquence de 5 chiffres: ");
        sequenceDevinee = clavier.nextLine();

        while (sequenceDevinee.length() != 5) {
            System.out.println("Erreur! Veuillez proposer une séquence à 5 CHIFFRES ENTRE 1 ET 9:");
            sequenceDevinee = clavier.nextLine();
        }
        if (sequenceDevinee.equals(sequenceChiffres)) {
            System.out.println("Félicitations Joueur2! Vous avez deviné la séquence de chiffres qui était: " + sequenceChiffres);
            break;

        }else{
        int bienPlaces=0;
        int malPlaces=0;

        boolean[] sequenceChiffresUtlises = new boolean[5];
        boolean[] sequenceDevineesUtilises = new boolean[5];

        for (int j=0; j<5; j++) {
            if (sequenceDevinee.charAt(j) == sequenceChiffres.charAt(j)) {
                bienPlaces++;
                sequenceChiffresUtlises[j] = true;
                sequenceDevineesUtilises[j] = true;

            }
        }

        for (int j=0; j<5; j++) {
            if (!sequenceDevineesUtilises[j]) {
            for (int k=0; k<5; k++) {
                if (!sequenceChiffresUtlises[k]  && sequenceDevinee.charAt(j) == sequenceChiffres.charAt(k)) {
                    malPlaces++;
                    sequenceChiffresUtlises[k] = true;
                    break;

                }
            }
            }
        }
        System.out.println("Résultat: il y a "+bienPlaces+" chiffre(s) de bien placé(s) | "+malPlaces+" chiffre(s) de mal placé(s)");


    if (i == propositions-1) {
        System.out.println("Désolé, vous avez épuisé toutes vos tentatives! La séquence de chiffres était: "+sequenceChiffres+".");
    }

    }
    }


    }


}