import java.util.ArrayList;
import java.util.List;

public class Team<T> {
    //[선택 미션] 2. 잘못된 제네릭 설계 사례 만들고 고쳐보기
    //Team<String> stringTeam = new Team<>();
    //Team<Integer> numberTeam = new Team<>();
    // => public class Team<T> 일 경우 위와 같은 아무 타입이나 들어올 수 있다.

    //getTotalHp() 메서드에서는 Champion의 getHp 메서드 인식 X => 컴파일 에러 발생
    // => T가 Champion이라는 보장이 없기 때문이다.

    //이러한 문제를 방지하기 위해서 <T extends Champion>으로 작성해주어야 한다.
    //T extends Champion : 클래스 설계 시 타입을 제한할 때
    //? extends Champion : 여러 하위 타입 리스트를 받을 때

    private List<T> members = new ArrayList<>();

    private String name;

    public Team(String teamName) {
        this.name = teamName;
    }

    public void addMember(T champion) {
        members.add(champion);
        System.out.println(champion.getName() + "이(가) " + name + " 팀에 합류!");
    }

    public int getTotalHp() {
        return members.stream()
                .mapToInt(Champion::getHp)
                .sum();
    }

    public List<T> getMembers() {
        return members;
    }

    public T get(int index){
        return members.get(index);
    }

    public void printTeam(T list){
        System.out.println(list.getName());
    }

    public void printChampion(List<? extends Champion> list){
        for(Champion champion : list){
            System.out.println(champion.getName()); //챔피언 출력
        }
        //add 불가능
        //list.add(new Garen("가렌"));
    }

    public void printChampion2(List<? super Champion> list){
       //super 일때 add 가능
        list.add(new Garen("가렌"));
    }

    //[선택 미션] 1. 제네릭 와일드카드 적용해보기
    //List<Garen> , List<Champion> 모두 받을 수 있음.
    public static void printTeamMembers(List<? extends Champion> team){
        for(Champion champion : team){
            System.out.println(champion.getName());
        }
    }

}

