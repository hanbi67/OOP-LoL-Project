import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //[선택 미션] 1. 제네릭 와일드카드 적용해보기
//        List<Garen> garenTeam = new ArrayList<>();
//        List<Champion> championTeam = new ArrayList<>();
//
//        Team.printTeamMembers(garenTeam);
//        Team.printTeamMembers(championTeam);

        // 챔피언 Pool 구성
        ChampionPool pool = new ChampionPool();
        pool.addChampion(new Garen("가렌"));
        pool.addChampion(new Ashe("애쉬"));
        pool.addChampion(new Lux("럭스"));
        pool.addChampion(new Teemo("티모"));

        //Champion c = pool.get("가렌");  // 즉시 조회 가능

        // 팀 생성
        Team<Champion> red = new Team<>("레드");
        Team<Champion> blue = new Team<>("블루");

        // 팀 배치
        red.addMember(pool.get("가렌"));
        red.addMember(pool.get("애쉬"));

        blue.addMember(pool.get("럭스"));
        blue.addMember(pool.get("티모"));

        System.out.println("블루팀 전체 체력: " + blue.getTotalHp());
        System.out.println("레드팀 전체 체력: " + red.getTotalHp());

        Battle.oneVsOne(blue, red);

//        System.out.println("==== 소환사의 협곡에 오신 것을 환영합니다. ====");
//
//        Champion ashe = new Ashe("애쉬");
//        Champion garen = new Garen("가렌");
//
//        System.out.println("총 생성된 챔피언 수: " + Champion.getCreatedCount());
//
//        System.out.println("최대 레벨: " + GameConstants.MAX_LEVEL);
//        System.out.println("기본 CDR: " + GameConstants.BASE_CDR);
//
//        /* BattleUtile battleUtils = new BattleUtile();
//        Champion winner = BattleUtils.pickHigherHp(garen, ashe); */
//
//        //static 클래스(중첩 클래스) 사용
//        Champion.Log startLog = new Champion.Log("전투 시작");
//        startLog.print();
//
//        garen.levelUp();
//
//        ashe.basicAttack(garen);
//        garen.basicAttack(ashe);
//
//        ashe.useQ(garen);
//        garen.useW(ashe);
//
//        ashe.useW(garen);
//        garen.useQ(ashe);
//
//        ashe.basicAttack(garen);
//        garen.basicAttack(ashe);
//
//        ashe.useW(garen);
//        garen.useQ(ashe);
//
//        Champion.Log endLog = new Champion.Log("전투 종료");
//        endLog.print();
//
//        Champion.Log resultLog = new Champion.Log("전투 결과");
//        resultLog.print();
//
//        //전투 종료 후 호출
//        Champion winner = BattleUtils.pickHigherHp(garen, ashe);
//        System.out.println(winner);
//        System.out.println("우승자: " + winner.getName());
//
//        System.out.println(garen);
//        System.out.println(ashe);
//
//        System.out.println("전투 횟수: " + Champion.getBattleCount());

    }
}