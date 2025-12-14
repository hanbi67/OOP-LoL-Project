public class Garen extends Champion implements MeleeChampion{

    //생성자
    public Garen(String name) {
        super(name);
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
