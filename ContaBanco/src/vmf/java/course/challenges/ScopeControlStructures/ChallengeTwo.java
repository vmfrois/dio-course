package vmf.java.course.challenges.ScopeControlStructures;

import java.util.Scanner;

public class ChallengeTwo {
    public static void main(String[] args) {
        //ChallengePedraPapelAtaqueAereo();
        //ChallengeReadNames();
        Mjolnir();
    }
    public static void ChallengePedraPapelAtaqueAereo(){
        Scanner sc = new Scanner(System.in);
        int game = sc.nextInt();
        String playerOne, playerTwo;
        for (int i = 0; i < game; i++) {
            playerOne = sc.next();
            playerTwo = sc.next();
            if(playerOne.equalsIgnoreCase("ataque")
                    && playerTwo.equalsIgnoreCase("pedra")){
                System.out.println("Jogador 1 venceu");
            }else if(playerOne.equalsIgnoreCase("pedra")
                    && playerTwo.equalsIgnoreCase("ataque")){
                System.out.println("Jogador 2 venceu");
            }else  if(playerOne.equalsIgnoreCase("pedra") &&
                    playerTwo.equalsIgnoreCase("papel")){
                System.out.println("Jogador 1 venceu");
            } else if(playerOne.equalsIgnoreCase("papel")
                    && playerTwo.equalsIgnoreCase("pedra")){
                System.out.println("Jogador 2 venceu");
            }else if (playerOne.equalsIgnoreCase("papel")
                    && playerTwo.equalsIgnoreCase("ataque")) {
                System.out.println("Jogador 2 venceu");
            }else if(playerOne.equalsIgnoreCase("ataque")
                    && playerTwo.equalsIgnoreCase("papel")){
                System.out.println("Jogador 1 venceu");
            }else  if(playerOne.equalsIgnoreCase("papel")
                    && playerTwo.equalsIgnoreCase("papel")){
                System.out.println("Ambos venceram");
            }else  if(playerOne.equalsIgnoreCase("pedra")
                    && playerTwo.equalsIgnoreCase("pedra")){
                System.out.println("Sem ganhador");
            }else if(playerOne.equalsIgnoreCase("ataque") && playerTwo.equalsIgnoreCase("ataque")){
                System.out.println("Aniquilacao mutua");
            }else {
                System.out.println(" ");
            }
        }
    }

    public static void ChallengeReadNames(){
        Scanner sc = new Scanner(System.in);
        String[] names = new String[11];
        for(int i=0;i < 10; i++){
            names[i] = sc.nextLine();
            if(names[i].equalsIgnoreCase(names[2])){
                System.out.println(names[2]);
            }else if(names[i].equalsIgnoreCase(names[6])){
                System.out.println(names[6]);
            }else if(names[i].equalsIgnoreCase(names[8])){
                System.out.println(names[8]);
            }
        }
    }

    public static void Mjolnir(){
        Scanner sc = new Scanner(System.in);
        int game = sc.nextInt();
        String name;
        int strength;

        for (int i = 0; i < game; i++) {
            name = sc.next();
            strength = sc.nextInt();
            if (name.equals("Thor")) {
                System.out.println("Y");
            } else System.out.println("N");
        }
    }

}
