package animal;

// Animalクラスを継承、Thinkableインターフェイスを実装
public class Human extends Animal implements Thinkable {

    // フィールド(趣味)、カプセル化
    private String humanHobby; // 趣味

    // 引数なしコンストラクタ
    public Human() {
    }

    public Human(String animalName, int animalAge, String humanHobby) {
        super(animalName, animalAge); // スーパークラスのコンストラクタを呼び出す
        this.humanHobby = humanHobby;
    }

    // GetterSetter
    public String getHumanHobby() {
        return humanHobby;
    }

    public void setHumanHobby(String HumanHobby) {
        this.humanHobby = humanHobby;
    }

    // thinkメソッド
    @Override
    public void think() {
        System.out.println("私は" + humanHobby + "について考えています。");
    }

    // sayメソッドのオーバーライド
    @Override
    public void say() {
        System.out.println( getAnimalName() + "です。" + getAnimalAge() +"歳です。");
    }
}
