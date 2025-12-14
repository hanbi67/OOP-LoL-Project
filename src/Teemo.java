public class Teemo extends Champion{

    //생성자
    public Teemo(String name) {
        super(name);
    }

    //티모만의 Q 스킬
    @Override
    public void useQ(Champion target) {
        System.out.println(getName() + "의 실명 다트(Q)!");
        target.takeDamage(getAttackDamage() + 30);
        setBattleCount();
    }

    @Override
    public void useW(Champion target) {
        System.out.println(getName() + "의 신속한 이동(W)!");
        target.takeDamage(getAttackDamage() + 40);
        setBattleCount();
    }

    @Override
    public void useE(Champion target) {
        System.out.println(getName() + "의 맹독 다트(E)!");
        target.takeDamage(getAttackDamage() * 2);
        setBattleCount();
    }

    @Override
    public void useR(Champion target) {
        System.out.println(getName() + "의 유독성 함정(R)!");
        target.takeDamage(getAttackDamage() + 10);
        setBattleCount();
    }



}
