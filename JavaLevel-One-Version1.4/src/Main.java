public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 500;
        int levelCompleted = 3;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);

        System.out.println("The final score is " + highScore);
        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        int highScorePosition = calculateHighsScorePosition(1500);
        displayHighScorePosition("Tim",highScorePosition);

        highScorePosition = calculateHighsScorePosition(900);
        displayHighScorePosition("Bob",highScorePosition);

        highScorePosition = calculateHighsScorePosition(400);
        displayHighScorePosition("Percy",highScorePosition);

        highScorePosition = calculateHighsScorePosition(50);
        displayHighScorePosition("Gilbert",highScorePosition);

    }
    public static void displayHighScorePosition(String playerName , int highScorePosition)
    {
    System.out.printf("%s managed to get into position %d on the high score table\n",playerName, highScorePosition);

    }
    public static int calculateHighsScorePosition(int playerScore){
        if (playerScore >1000){

            return 1 ;
        }else if (playerScore >500 && playerScore <1000 ){
            return 2 ;
        }else if (playerScore > 100 && playerScore <500){
            return 3 ;
        }else {
            return 4 ;
        }

    }



    //
        public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
            if (gameOver) {
                int finalScore = score + (bonus * levelCompleted);
                finalScore += 200;
                return finalScore;
            }
            return -1 ;
        }




}

