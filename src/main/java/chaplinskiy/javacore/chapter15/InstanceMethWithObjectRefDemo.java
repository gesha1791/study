package chaplinskiy.javacore.chapter15;

public class InstanceMethWithObjectRefDemo {
    static <T> int counter(T[] vals, MyFunc2 <T> f, T v){
        int count = 0;

        for (int i = 0; i < vals.length; i++) {
            if(f.func(vals[i], v)){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int count;

        HighTemp[] weekDaysHigh = {
                    new HighTemp(89), new HighTemp(82),
                    new HighTemp(90), new HighTemp(89),
                    new HighTemp(89), new HighTemp(91),
                    new HighTemp(84), new HighTemp(83)
        };

        // Использовать метод counter() месте с массивами объектов
        // типа HighTemp. Обрати внимание на то, что ссылка на метод экземпляра
        // sameTemp() передается в качестве второго параметра

        // TODO: 10.08.2020 почему работает этот код???
        count = counter(weekDaysHigh, HighTemp::sameTemp, new HighTemp(89));

        System.out.println("Дней когда максимальная температура была 89: " + count);

        HighTemp[] weekDaysHigh2 = {
                new HighTemp(32), new HighTemp(12),
                new HighTemp(24), new HighTemp(19),
                new HighTemp(18), new HighTemp(12),
                new HighTemp(-1), new HighTemp(13)
        };

        count = counter(weekDaysHigh2, HighTemp::sameTemp, new HighTemp(12));

        System.out.println("Дней когда макс температура была 12: " + count);

        count = counter(weekDaysHigh, HighTemp::lessThanTemp, new HighTemp(89));

        System.out.println("Дней когда макс температура была меньше 89: " + count);

        count = counter(weekDaysHigh2, HighTemp::lessThanTemp, new HighTemp(19));

        System.out.println("Дней когда макс температура была меньше 19: " + count);



    }
}
