class MethodChallenge {

    public static void main(String[] args) {
        int playerPosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim", playerPosition);

        playerPosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Bob", playerPosition);

        playerPosition = calculateHighScorePosition(500);
        displayHighScorePosition("Percy", playerPosition);

        playerPosition = calculateHighScorePosition(100);
        displayHighScorePosition("Kane", playerPosition);

        playerPosition = calculateHighScorePosition(25);
        displayHighScorePosition("Arnold", playerPosition);
    }

    public static int calculateHighScorePosition(int playerScore) {
        int playerPosition = 4;

        if (playerScore >= 1000) {
            playerPosition = 1;
        } else if (playerScore >= 500) {
            playerPosition = 2;
        } else if (playerPosition >= 100) {
            playerPosition = 3;
        }

        return playerPosition;
    }

    public static void displayHighScorePosition(String name, int playerPosition) {
        System.out.println(name + " managed to get into position " + playerPosition + " on the high score list.");
    }
}
