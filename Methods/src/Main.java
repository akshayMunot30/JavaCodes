public class Main {

    public static void main(String[] args) {

//        int highScore = calculateScore(true,800, 5, 100);
//        System.out.println("Your first final score was " + highScore);
//
//        highScore = calculateScore(true, 10000, 8, 200);
//        System.out.println("Your first final score was " + highScore);

        int playerPosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Akshay", playerPosition);

        playerPosition = calculateHighScorePosition(500);
        displayHighScorePosition("Sahil", playerPosition);

        playerPosition = calculateHighScorePosition(100);
        displayHighScorePosition("Ashu", playerPosition);

        playerPosition = calculateHighScorePosition(50);
        displayHighScorePosition("Kaustubh", playerPosition);
    }

//    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
//
//        if (gameOver) {
//            int finalScore = score + (levelCompleted * bonus);
//            finalScore += 2000;
//            return finalScore;
//        }
//
//        return -1;
//
//    }

    public static void displayHighScorePosition(String playerName, int playerPosition) {
        System.out.println(playerName + " managed to get into position " +
                playerPosition + " on the high score table.");
    }

    public static int calculateHighScorePosition(int playerScore) {
        /*if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500) {
            return 2;
        } else if (playerScore >= 100) {
            return 3;
        } else {
            return 4;
        }*/

        int position = 4;
        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        }

        return position;
    }
}
