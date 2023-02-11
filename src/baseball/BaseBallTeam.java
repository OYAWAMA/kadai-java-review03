package baseball;

public class BaseBallTeam {
    // フィールド
    private String name;
    private int win;
    private int lose;
    private int draw;

    /*public BaseBallTeam() {
        // TODO 自動生成されたコンストラクター・スタブ
    }*/

    // 引数ありのコンストラクタ
    public BaseBallTeam(String name, int win, int lose, int draw) {
        this.name = name;
        this.win = win;
        this.lose = lose;
        this.draw = draw;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWin() {
        return win;
    }

    public void setWin(int win) {
        this.win = win;
    }

    public int getLose() {
        return lose;
    }

    public void setLose(int lose) {
        this.lose = lose;
    }

    public int getDraw() {
        return draw;
    }

    public void setDraw(int draw) {
        this.draw = draw;
    }

    // 勝率のメソッド
    public double getRate() {
        // winとloseから勝率を求める
        double WinPercentage = (double)win / (win+lose); //型の変換忘れに注意
        return WinPercentage;
    }

    // 成績を表示するメソッド
    public void report(BaseBallTeam opponent) {
        
        double rate = getRate();
        System.out.println(name + "の2022年の成績は" + win + "勝" + lose + "敗" + draw + "分、勝率は" + rate + "です");
    }
}