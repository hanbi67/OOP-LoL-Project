public enum ChampionStat {
    //속성(체력/공격/방어) -> enum으로 표현

    HP(100, 1000),
    ATTACK_DAMAGE(30, 999),
    DEFENSE(40, 999);

    private final int baseValue;
    private final int maxValue;

    ChampionStat(int baseValue, int maxValue) {
        this.baseValue = baseValue;
        this.maxValue = maxValue;
    }

    public int getBaseValue() {
        return baseValue;
    }

    public int getMaxValue() {
        return maxValue;
    }

}
