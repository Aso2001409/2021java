package Game3;

public class Game_system {
    //スタート画面
    public static void strat(){
        System.out.println("***********************");
        System.out.println("      ~戦艦ゲーム~     ");
        System.out.println("***********************");
    }

    //範囲外の表示
    public static void error(){
        System.out.println("※範囲外です1~5の整数を入れてください");
    }

    //エンド画面
    public static void end(int cnt){
        System.out.printf("\n<<%dターンで全艦轟沈‼>>\n",cnt);
        if(cnt<=30){
            System.out.println("      Sランク      ");
        }else if(cnt<=50){
            System.out.println("      Aランク      ");
        }else if(cnt<=70){
            System.out.println("      Bランク      ");
        }else if(cnt<=90){
            System.out.println("      Cランク      ");
        }else{
            System.out.println("      Dランク      ");
        }
        System.out.println("***********************");
        System.out.println("         終了         ");
        System.out.println("***********************");
    }

    //ターン
    public static void tarn(int cnt){
        System.out.printf("\n-------第%dターン-------\n",cnt);
    }

    //攻撃、結果
    public static void attack(int a,int b,String[][] c){
        System.out.printf("~X座標は%s、Y座標は%sに発射‼~\n\n",a,b);
        if(c[a-1][b-1].equals("〇")){
            System.out.println("   <<戦艦に命中‼>>\n");
        }else if(a-2>=0&&c[a-2][b-1].equals("〇")){
            System.out.println("     <<波高し>>\n");
        }else if(b-2>=0&&c[a-1][b-2].equals("〇")){
            System.out.println("     <<波高し>>\n");   
        }else if(a<=4&&c[a][b-1].equals("〇")){
            System.out.println("     <<波高し>>\n");   
        }else if(b<=4&&c[a-1][b].equals("〇")){
            System.out.println("     <<波高し>>\n");         
        }else{
            System.out.println("   <<残念、はずれ>>\n");
        }
    }
    
    //船の状態確認
    public static void ans(int hp){
        if(hp==3){
            System.out.println("        無傷");
        }else if(hp==2){
            System.out.println("       /小破/");
        }else if(hp==1){
            System.out.println("      //大破//");
        }else{
            System.out.println("     ///轟沈///");
        }
    }
}
