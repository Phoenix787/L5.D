package U2.L1.ex7;

/**
 * Created by Сергеева on 16.03.2016.
 * Коллекция, которая примет элементы которые можно сравнивать
 * мы не можем накладывать фильтры где хотим, единственное место где можно
 * его наложить - при описании класса. Если там не сделали, то дальше мы уже не можем
 * наложить фильтр
 */
public class MainCollection<T extends Comparable<T>> implements Minimum<T> {
    T[] objects;

    public MainCollection(T[] objects) {
        this.objects = objects;
    }


    @Override
    public T min() {
        return null;
    }
}
