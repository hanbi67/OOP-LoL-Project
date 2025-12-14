public class Ashe extends Champion implements RangedChampion{

    //생성자
    public Ashe(String name) {
        super(name);
    }

    //부활 조건: 부활 1회로 제한 + 쿨타임 X
    @Override
    protected boolean canResurrect() {
        return getResurrectCount() < 1;
    }

    //부활 추가 효과: 방어력 3 증가
    @Override
    protected void afterResurrect() {
        //방어력 3 증가
        setDefense(getDefense() + 3);
        System.out.println("부활 효과: 방어력 증가!");
    }

    //애쉬만의 Q 스킬
    @Override
    public void useQ(Champion target) {
        System.out.println(getName() + "의 집중(Q)!");
        target.takeDamage(getAttackDamage() + 30);
        setBattleCount();
    }

    @Override
    public void useW(Champion target) {
        System.out.println(getName() + "의 서리화살(W)!");
        target.takeDamage(getAttackDamage() + 40);
        setBattleCount();
    }

    @Override
    public void useE(Champion target) {
        System.out.println(getName() + "의 매 날리기(E)!");
        target.takeDamage(getAttackDamage() * 2);
        setBattleCount();
    }

    @Override
    public void useR(Champion target) {
        System.out.println(getName() + "의 마법화살(R)!");
        target.takeDamage(getAttackDamage() + 10);
        setBattleCount();
    }

    @Override
    public void kite(){
        System.out.println(getName() + " 카이팅!");
    }

}
