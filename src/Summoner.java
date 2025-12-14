public class Summoner {
    //final 사용: 불변

    private final String name;  // 소환사명은 한 번 정하면 바뀌지 않음
    private final Ashe ashe;
    private int level;

    public Summoner(String name, Ashe ashe) {
        this.name = name;
        this.ashe = ashe;
        this.level = 1;
    }

    public String getName() {
        return name;
    }

    //세터는 불가능. 왜냐면 final이 있기 때문에 외부에서 변화를 줄 수 없음.
    //객체를 사용할 순 있으나 새롭게 변화할 순 없음.

    public void heal(final Champion target){
        // target = new Garen("다른 가렌"); // 재할당 불가, 컴파일 에러
        target.setHp(target.getHp() + 100);
    }

    public void example(){
        final int baseDamage = 50;
        // baseDamage = 60; // 컴파일 에러
    }


}
