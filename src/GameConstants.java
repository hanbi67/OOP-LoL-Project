public class GameConstants {
    //final 클래스이기 때문에 더이상 자식 클래스를 만들 수 없다 (더이상 상속 불가능)
    //귀중한 정보들이 관리되거나
    //게임 상수를 지정할 수 있다.

    //- 모든 필드는 `public static final`
    // - 인스턴스를 만들 필요가 없음
    // - 값이 바뀌지 않음(상수)

    public static final int BASE_LEVEL = 1;
    public static final int MAX_LEVEL = 18;
    public static final int BASE_HP = 100;
    public static final int MAX_HP = 1000;
    public static final int BASE_ATTACK_DAMAGE = 30;
    public static final int BASE_DEFENSE = 40;
    public static final int BASE_RESURRECT_COUNT = 0;
    public static final int BASE_CDR = 10;
    public static final String GAME_MODE = "NORMAL";
    public static final double CRIT_CHANCE = 0.2;

    private GameConstants(){} // 인스턴스 생성 방지

    //==> ENUM

}
