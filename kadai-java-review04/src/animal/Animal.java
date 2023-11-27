package animal;

public class Animal {
    // フィールド(名前、年齢)、カプセル化
    private String name;// 名前
    private int age;    // 年齢

    // 引数なしコンストラクタ
    public Animal() {
    }

    // 引数ありコンストラクタ(名前、年齢)
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // GetterSetter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // sayメソッド
    public void say() {
        System.out.println( name + "です。" + age +"歳です。");
    }
}