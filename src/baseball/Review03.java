package baseball;

public class Review03 {

    public static void main(String[] args) {
        BaseBallTeam team1 = new BaseBallTeam();
        // BaseBallTeam.name="test";
        team1.setName("東京");
        team1.setWin(80);
        team1.setLose(59);
        team1.setDraw(4);
        double rate1 = team1.getRate(team1);
        //System.out.println(rate1);
        team1.report(rate1);
        /*
         * String teamName1 = team1.getName(); System.out.println(teamName);
         */
        BaseBallTeam team2 = new BaseBallTeam();
        team2.setName("横浜");
        team2.setWin(73);
        team2.setLose(68);
        team2.setDraw(2);
        double rate2 = team2.getRate(team2);
        team2.report(rate2);

        BaseBallTeam team3 = new BaseBallTeam();
        team3.setName("阪神");
        team3.setWin(68);
        team3.setLose(71);
        team3.setDraw(4);
        double rate3 = team3.getRate(team3);
        team3.report(rate3);


        BaseBallTeam team4 = new BaseBallTeam();
        team4.setName("読売");
        team4.setWin(68);
        team4.setLose(72);
        team4.setDraw(3);
        double rate4 = team4.getRate(team4);
        team4.report(rate4);

        BaseBallTeam team5 = new BaseBallTeam();
        team5.setName("広島");
        team5.setWin(66);
        team5.setLose(74);
        team5.setDraw(3);
        double rate5 = team5.getRate(team5);
        team5.report(rate5);

        BaseBallTeam team6 = new BaseBallTeam();
        team6.setName("中日");
        team6.setWin(66);
        team6.setLose(75);
        double rate6 = team6.getRate(team6);
        team6.report(rate6);

    }



}
