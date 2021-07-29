package Game3;

import java.util.*;

public class Ship {
    Random r = new Random();
    int s_hp = 3;
    private int X;
    private int Y;
    int flag = 0;

    //初期移動
    public String[][] area(String[][] a){
        X = r.nextInt(5);
        Y = r.nextInt(5);
        if(a[this.X][this.Y].equals("×")){
            a[this.X][this.Y]="〇";
        }else{
            while(a[this.X][this.Y].equals("〇")){
                this.X = r.nextInt(5);
                this.Y = r.nextInt(5);
            }
            a[this.X][this.Y]="〇";
        }
        return a;
    }

    //チェック
    public void check(int x,int y){
        if(x-1==this.X&&y-1==this.Y){
            this.s_hp-=1;
            this.flag = 1;
        }
    }

    //再配置
    public String[][] new_area(String[][] a){
        if(this.flag==1){
            a[this.X][this.Y]="×";
            this.flag=0;
            this.X = r.nextInt(5);
            this.Y = r.nextInt(5);
            if(this.s_hp!=0){
                if(a[this.X][this.Y].equals("×")){
                    a[this.X][this.Y]="〇";
                }else{
                    while(a[this.X][this.Y].equals("〇")){
                        this.X = r.nextInt(5);
                        this.Y = r.nextInt(5);
                    }
                    a[this.X][this.Y]="〇";
                }
            }else{

                //座標を枠外にする
                this.X=6;
                this.Y=6;
            }
        }
        return a;
    }
}