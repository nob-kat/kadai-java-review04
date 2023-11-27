package animal;

public class Review04 {

    public static void main(String[] args) {

        // インスタンスを作成
        Human tanaka = new Human("田中 太郎", 25, "電車");
        Human suzuki = new Human("鈴木 次郎", 30, "野球");
        Human sato = new Human("佐藤 花子", 20, "映画");

        // sayメソッドとthinkメソッドの実行
        // tanaka.say();
        // tanaka.think();
        // suzuki.say();
        // suzuki.think();
        // sato.say();
        // sato.think();
        Human[] humans = { tanaka, suzuki, sato }; //インスタンス配列！
        //for (int i = 0; i < humans.length; i++) {
        //    humans[0].say();
        //    humans[0].think();
        //}
        // 拡張for文
        for (Human human : humans) { // 集合を複数形
            human.say();
            human.think();
        }
    }
}