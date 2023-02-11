package baseball;

public class Review03 {

    public static void main(String[] args) {
        BaseBallTeam team1 = new BaseBallTeam("東京", 80, 59, 4);
        // BaseBallTeam.name="test";
        /*
         * team1.setName("東京"); team1.setWin(80); team1.setLose(59); team1.setDraw(4);
         */ // Setterを使う場合の書き方
        team1.report(team1);
        
        BaseBallTeam team2 = new BaseBallTeam("横浜", 73, 68, 2);
        team2.report(team2);
        BaseBallTeam team3 = new BaseBallTeam("阪神", 68, 71, 4);
        team3.report(team3);
        BaseBallTeam team4 = new BaseBallTeam("読売", 68, 72, 3);
        team4.report(team4);
        BaseBallTeam team5 = new BaseBallTeam("広島", 66, 74, 3);
        team5.report(team5);
        BaseBallTeam team6 = new BaseBallTeam("中日", 66, 75, 2);
        team6.report(team6);

    }

}
