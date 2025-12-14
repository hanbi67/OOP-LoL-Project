public abstract class Champion {
    //공통된 것을 묶기//
    private final String name;
    private int level;
    private int hp;
    private int attackDamage;
    private int defense;
    private int resurrectCount;

    // 모든 챔피언이 공유하는 카운트(전체 게임에서 공통 정보)
    private static int createdCount = 0;

    // 전투가 발생할 때마다 증가하는 카운트
    private static int battleCount = 0;

    //챔피언 생성할 때 name을 제외한 나머지 값은 GameConstants 상수에서 불러옴.
    public Champion(String name) {
        this.name = name;
        this.level = GameConstants.BASE_LEVEL;
        this.hp = ChampionStat.HP.getBaseValue();
        //attackDamage 값을 난수(랜덤)로 만들어 “치명타 개념” 추가
        //객체마다 랜덤으로 다른 공격력 부여
        this.attackDamage = ChampionStat.ATTACK_DAMAGE.getBaseValue() + (int)(Math.random() * 10);
        this.defense = ChampionStat.DEFENSE.getBaseValue() ;
        this.resurrectCount = GameConstants.BASE_RESURRECT_COUNT;

        createdCount++; // 챔피언이 생성될 때마다 +1
    }

    //레벨업 규칙
    public final void levelUp() {
        if(this.level >= GameConstants.MAX_LEVEL) {
            System.out.println("이미 최고 레벨입니다!");
        }

        this.level++;
        this.hp += 50;
        this.attackDamage += 5;
        this.defense += 3;
        System.out.println(name + " 레벨업! 현재 레벨: " + level);
    }

    //공격 받았을 때
    public void takeDamage(int damage){
        int actualDamage = damage - this.defense;
        if(actualDamage < 0) {
            actualDamage = 0;
        }

        hp -= actualDamage;

        System.out.println(name + "이(가) " + actualDamage + " 피해를 받았습니다!");
        System.out.println("현재 체력: " + hp);

        //체력이 0 이하가 되면 “name 사망!” 메시지 출력
        if(hp <= 0){
            System.out.println( name + " 사망!");
            //부활 메서드
            resurrect();
        }
    }

    //챔피언이 챔피언을 공격한다.
    public void basicAttack(Champion target){
        System.out.println(getName() + " → " + target.getName() + " 평타 공격!");

        //객체마다 다르게 부여받은 공격력 값을 finalDamage 변수에 넣음
        int finalDamage = this.attackDamage;
        target.takeDamage(finalDamage);

        //전투 횟수 카운팅
        battleCount++;
    }

    //전투 로그 static 중첩 클래스 - 전투 메시지를 모아두는 기능
    public static class Log{
        private String message;

        public Log(String message) {
            this.message = message;
        }

        public void print() {
            System.out.println("[Log]" +  message);
        }
    }

    // 부활 가능 조건
    protected abstract boolean canResurrect();

    // 부활 후 추가 효과
    protected void afterResurrect() {
        // 기본 구현은 비워둠
    }

    //부활 템플릿 메서드 (고정 규칙)
    public final void resurrect(){
        //챔피언마다 다른 부활 조건
        if(!canResurrect()){
            System.out.println(getName() + "은(는) 부활 조건을 만족하지 않아 부활할 수 없습니다.");
            return;
        }

        //공통 부활 규칙 - 기본 체력의 20%
        int resurrectHp = (int)(ChampionStat.HP.getBaseValue() * 0.2);

        if (resurrectHp <= 0) {
            resurrectHp = 1; // 최소 1 보장
        }

        setHp(resurrectHp);

        setResurrectCount(); //부활 횟수 카운팅
        System.out.println(getName() + "이(가) 다시 부활합니다!");
        System.out.println(getName() + "의 체력: " + getHp());

        //부활 시 추가 효과 (hook)
        afterResurrect();
    }


    //Q스킬
    public abstract void useQ(Champion target);

    //W스킬
    public abstract void useW(Champion target);

    //E스킬
    public abstract void useE(Champion target);

    //R스킬
    public abstract void useR(Champion target);



    //게터
    public String getName(){
        return this.name;
    }

    public int getHp() {
        return hp;
    }

    public int getAttackDamage() {
        return attackDamage;
    }

    public int getDefense() {
        return defense;
    }

    public static int getCreatedCount() {
        return createdCount;
    }

    public static int getBattleCount() {
        return battleCount;
    }

    public int getResurrectCount() {
        return resurrectCount;
    }

    //세터
    //Summoner 클래스에서 사용
    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setAttackDamage(int attackDamage){
        this.attackDamage = attackDamage;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    //다른 클래스에서도 battleCount를 증가시킬 수 있도록 set메서드
    public static void setBattleCount() {
        battleCount++;
    }
    
    public void setResurrectCount() {
        resurrectCount++;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", level=" + level +
                ", hp=" + hp +
                ", attackDamage=" + attackDamage +
                ", defense=" + defense +
                '}';
    }


}
