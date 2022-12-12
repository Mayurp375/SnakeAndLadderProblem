package classProblemByAmolMateSir.Day4PracticeProblem.SnakeAndLadderProblem;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to  Snake & Ladder Problem");

        int position = 0;

        Random random = new Random();
        int die = random.nextInt(7);
        if (die >= 0) {
            position += die;
        }
        System.out.println(position);
    }
}
