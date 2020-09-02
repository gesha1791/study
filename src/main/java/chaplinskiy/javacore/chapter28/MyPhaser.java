package chaplinskiy.javacore.chapter28;

import java.util.concurrent.Phaser;

public class MyPhaser extends Phaser {
    int numPhases;

    MyPhaser(int parties, int phaseCount){
        super(parties);
        numPhases = phaseCount - 1;
    }

    // переопределить метод onAdvance(), чтобы выполнить только
    // определенное количество фаз


    @Override
    protected boolean onAdvance(int phase, int registeredParties) {
        // Следующий оператор println() требуется только для
        // целей иллюстрации. Как правило, метод onAdvance()
        // не отображает выводимые данные
        System.out.println("Фаза " + phase + " завершена.\n");

        // возвратить логическое true,
        // если все фазы завершены
        if(phase == numPhases || registeredParties == 0) return true;

        return false;
    }

}
