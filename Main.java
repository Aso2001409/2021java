package Game3;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        //開始
        Game_system.strat();
        Scanner sc = new Scanner(System.in);
        int x = 0;
        int y = 0;
        int cnt = 0;
        String[][] array = new String[][]{
            {"×","×","×","×","×"},
            {"×","×","×","×","×"},
            {"×","×","×","×","×"},
            {"×","×","×","×","×"},
            {"×","×","×","×","×"},
        };
        Ship s1 = new Ship();
        Ship s2 = new Ship();
        Ship s3 = new Ship();

        //初期配置
        s1.area(array);
        s2.area(array);
        s3.area(array);

        while(s1.s_hp!=0||s2.s_hp!=0||s3.s_hp!=0){
            cnt +=1;
            Game_system.tarn(cnt);
            x = sc.nextInt();
            y = sc.nextInt();
            while((x<=0||x>5)||(y<=0||y>5)){
                
                //再入力
                Game_system.error();
                x = sc.nextInt();
                y = sc.nextInt();
            }

            //攻撃
            Game_system.attack(x,y,array);

            //チェック
            s1.check(x,y);
            s2.check(x,y);
            s3.check(x,y);

            //再配置
            s1.new_area(array);
            s2.new_area(array);
            s3.new_area(array);

            //船の状態確認
            Game_system.ans(s1.s_hp);
            Game_system.ans(s2.s_hp);
            Game_system.ans(s3.s_hp);
        }
        sc.close();
        //終了
        Game_system.end(cnt);
    }
}
