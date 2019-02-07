 


public class NormalizeAngle {

    public Integer normalizeValueUsingModulo(Integer angle){
        return angle % 360;
    }

    public Integer normalizeValueUsingFloorMod(Integer integer){
        return Math.floorMod(integer, 360);
    }

    public static void main(String[] args){

    }
}
