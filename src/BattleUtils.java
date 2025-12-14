public class BattleUtils {

    // 두 챔피언 중 더 체력이 높은 챔피언을 반환
    public static Champion pickHigherHp(Champion a, Champion b) {
        if (a.getHp() >= b.getHp()) {
            return a;
        }
        return b;
    }

}
