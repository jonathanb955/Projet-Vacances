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
        }



}