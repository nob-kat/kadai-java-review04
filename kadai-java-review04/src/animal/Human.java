package animal;

// Animalクラスを継承、Thinkableインターフェイスを実装
public class Human extends Animal implements Thinkable {

    // フィールド(趣味)、カプセル化
    private String hobby; // 趣味

    // 引数なしコンストラクタ
    public Human() {
    }

    public Human(String name, int age, String hobby) {
        super(name, age); // スーパークラスのコンストラクタを呼び出す
        this.hobby = hobby;
    }

    // GetterSetter
    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    // thinkメソッド
    @Override
    public void think() {
        System.out.println("私は" + hobby + "について考えています。");
    }
}
