//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("==== 소환사의 협곡에 오신 것을 환영합니다. ====");

        Champion ashe = new Ashe("애쉬");
        Champion garen = new Garen("가렌");

        System.out.println("총 생성된 챔피언 수: " + Champion.getCreatedCount());

        System.out.println("최대 레벨: " + GameConstants.MAX_LEVEL);
        System.out.println("기본 CDR: " + GameConstants.BASE_CDR);

        /* BattleUtile battleUtils = new BattleUtile();
        Champion winner = BattleUtils.pickHigherHp(garen, ashe); */


        //static 클래스(중첩 클래스) 사용
        GameLog.LogEntry startEntry = new GameLog.LogEntry("전투 시작");
        startEntry.print();

        garen.levelUp();

        ashe.basicAttack(garen);
        garen.basicAttack(ashe);

        ashe.useQ(garen);
        garen.useW(ashe);

        ashe.useW(garen);
        garen.useQ(ashe);

        ashe.basicAttack(garen);
        garen.basicAttack(ashe);

        ashe.useW(garen);
        garen.useQ(ashe);

        GameLog.LogEntry endEntry = new GameLog.LogEntry("전투 종료");
        endEntry.print();

        GameLog.LogEntry summitEntry = new GameLog.LogEntry("전투 결과");
        summitEntry.print();

        //전투 종료 후 호출
        Champion winner = BattleUtils.pickHigherHp(garen, ashe);
        System.out.println(winner);
        System.out.println("우승자: " + winner.getName());

        System.out.println(garen);
        System.out.println(ashe);

        System.out.println("전투 횟수: " + Champion.getBattleCount());

    }
}