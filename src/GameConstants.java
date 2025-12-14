public class GameConstants {
    //final 클래스이기 때문에 더이상 자식 클래스를 만들 수 없다 (더이상 상속 불가능)
    //귀중한 정보들이 관리되거나
    //게임 상수를 지정할 수 있다.

    //- 모든 필드는 `public static final`
    // - 인스턴스를 만들 필요가 없음
    // - 값이 바뀌지 않음(상수)

    public static final int BASE_LEVEL = 1;
    public static final int MAX_LEVEL = 18;
    public static final int BASE_RESURRECT_COUNT = 0;
    public static final int BASE_CDR = 10;
    public static final String GAME_MODE = "NORMAL";
    public static final double CRIT_CHANCE = 0.2;

    private GameConstants(){} // 인스턴스 생성 방지

    //==> ENUM: 의미가 같은 상수들끼리 묶어주는 역할, 종류가 정해진 값 그룹
    // 1. 속성(체력/공격/방어) -> enum으로 표현
    // 2. 게임 설정 상수는 상수 클래스 그대로 유지

//    public enum ChampionStat {
//        HP(100, 1000),
//        ATTACK_DAMAGE(30, 999),
//        DEFENSE(40, 999);
//
//        private final int baseValue;
//        private final int maxValue;
//
//        ChampionStat(int baseValue, int maxValue) {
//            this.baseValue = baseValue;
//            this.maxValue = maxValue;
//        }
//
//        public int getBaseValue() {
//            return baseValue;
//        }
//
//        public int getMaxValue() {
//            return maxValue;
//        }
//    }

}
