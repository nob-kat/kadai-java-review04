package animal;

public class Animal {
    // フィールド(名前、年齢)、カプセル化
    private String animalName;// 名前
    private int animalAge;    // 年齢

    // 引数なしコンストラクタ
    public Animal() {
    }

    // 引数ありコンストラクタ(名前、年齢)
    public Animal(String animalName, int animalAge) {
        this.animalName = animalName;
        this.animalAge = animalAge;
    }

    // GetterSetter
    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String AnimalName) {
        this.animalName = animalName;
    }

    public int getAnimalAge() {
        return animalAge;
    }

    public void setAnimalAge(int animalAge) {
        this.animalAge = animalAge;
    }

    // sayメソッド
    public void say() {
        System.out.println( animalName + "です。" + animalAge +"歳です。");
    }
}