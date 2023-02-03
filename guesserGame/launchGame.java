import java.util.*;

class Guesser {
    int guessNum;

    int guessingNumber() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Guesser! guess a number : ");
        guessNum = scan.nextInt();
        return guessNum;
    }
}

class Player {
    int guessNum;

    int guessingNumber() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Player! guess a number : ");
        guessNum = scan.nextInt();
        return guessNum;
    }
}

class Umpire {
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;

    void collectNumberFromGuesser() {
        Guesser g = new Guesser();
        numFromGuesser = g.guessingNumber();
    }

    void collectNumberFromPlayers() {
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();
        numFromPlayer1 = p1.guessingNumber();
        numFromPlayer2 = p2.guessingNumber();
        numFromPlayer3 = p3.guessingNumber();
    }

    void compare() {
        if (numFromPlayer1 == numFromGuesser) {
            System.out.println("Player 1 won ");
        } else if (numFromPlayer2 == numFromGuesser) {
            System.out.println("Player 2 won ");
        } else if (numFromPlayer3 == numFromGuesser) {
            System.out.println("Player 3 won ");
        } else {
            System.out.println("Game Lost!!!");
        }
    }
}

public class launchGame {
    public static void main(String[] args) {
        System.out.println("Game Starts ");
        Umpire u = new Umpire();
        u.collectNumberFromGuesser();
        u.collectNumberFromPlayers();
        u.compare();
    }
}