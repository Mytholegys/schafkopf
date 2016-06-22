package game.playfield;

/**
 * Created by Thoams on 19.06.2016.
 */
public class card {
    private colour color;
    private name name;
    private boolean isTrumpf;

    /**
    Value list:     trumpf frei  wenn trumpf, dann val+10, wenn unter oder ober+20
                    7 = 0
                    8 = 1
                    9 = 2
                    U = 3
                    O = 4
                    K = 5
                    10= 6
                    A = 7

     */
    private  int value;

    public card(colour color,int value ){
        this.color=color;
        this.value=value;
        setName();
        setTrumpf(false);
    }

    public colour getColor() {
        return color;
    }

    public int getVal() {
        return value;
    }

    private void setName(){
        switch(this.getVal()){
            case 0:
                this.name= game.playfield.name.sieben;
                break;
            case 1:
                this.name= game.playfield.name.acht;
                break;
            case 2:
                this.name= game.playfield.name.neun;
                break;
            case 3:
                this.name= game.playfield.name.unter;
                break;
            case 4:
                this.name= game.playfield.name.ober;
                break;
            case 5:
                this.name= game.playfield.name.koenig;
                break;
            case 6:
                this.name= game.playfield.name.zehn;
                break;
            case 7:
                this.name= game.playfield.name.ass;
                break;
        }
    }

    public void setTrumpf(boolean newVal){
        isTrumpf=newVal;
        if(isTrumpf()){
            value=+10;
            if(name==name.unter||name==name.ober){
                value=+10;
            }
        }
    }

    public boolean isTrumpf() {
        return isTrumpf;
    }

    @Override
    public String toString() {
        return "" + color + name;
    }
}
