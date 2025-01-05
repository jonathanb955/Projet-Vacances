import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Bienvenue dans le jeu de MasterMind!");
        System.out.println("Ce jeu est composé de 2 joueurs.");
        System.out.println("Le joueur numéro1 sera celui choisira la séquence de chiffres et le joueur numéro2 devra le deviner.");
        System.out.println("Choisissez le niveau de diffilculté: ");
        System.out.println("|Niveau facile=1 | Niveau moyen=2 | Niveau difficile=3 | Niveau extrême=4 |");
        int niveauDifficulté = clavier.nextInt();
        System.out.println("Vous avez choisi le niveau "+niveauDifficulté+".");


    }
}