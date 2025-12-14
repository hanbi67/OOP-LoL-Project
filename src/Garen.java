public class Garen extends Champion implements MeleeChampion{

    //생성자
    public Garen(String name) {
        super(name);
    }

    //부활 조건: 부활 2회로 제한
    @Override
    protected boolean canResurrect() {
        return getResurrectCount() < 2;
    }

    //부활 추가 효과: 공격력 3 증가
    @Override
    protected void afterResurrect() {
        //공격력 3 증가
        setDefense(getAttackDamage() + 3);
        System.out.println("부활 효과: 공격력 증가!");
    }

    //가렌만의 Q 스킬
    @Override
    public void useQ(Champion target) {
        System.out.println(getName() + "의 결정타(Q)!");
        target.takeDamage(getAttackDamage() + 30);
        setBattleCount();
    }

    @Override
    public void useW(Champion target) {
        System.out.println(getName() + "의 용기(W)!");
        target.takeDamage(getAttackDamage() + 40);
        setBattleCount();
    }

    @Override
    public void useE(Champion target) {
        System.out.println(getName() + "의 심판(E)!");
        target.takeDamage(getAttackDamage() * 2);
        setBattleCount();
    }

    @Override
    public void useR(Champion target) {
        System.out.println(getName() + "의 데마시아의 정의(R)!");
        target.takeDamage(getAttackDamage() + 10);
        setBattleCount();
    }

    @Override
    public void dash(Champion target){
        System.out.println(getName() + " 돌진!");
        target.takeDamage(50);
        setBattleCount();
    }

}
