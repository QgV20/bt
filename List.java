import java.util.*;

class ListSortable<E extends KLTN<?, ?>> {
    private List<E> list = new ArrayList<>();


    public void add(E item) {
        list.add(item);
    }

    public void sort() {
        list.sort(Comparator.comparing(E::getTopicName));
    }

    public void print() {
        sort();
        for (E item : list) {
            item.print();
        }
    }
}