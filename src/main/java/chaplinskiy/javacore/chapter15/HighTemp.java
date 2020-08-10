package chaplinskiy.javacore.chapter15;

public class HighTemp {
    private int highTemp;

    HighTemp (int ht) {
        highTemp = ht;
    }

    boolean sameTemp(HighTemp ht2){
        return highTemp == ht2.highTemp;
    }
    boolean lessThanTemp(HighTemp ht2){
        return highTemp < ht2.highTemp;
    }

}
