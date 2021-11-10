package Mains;

import lists.LinkedList_1;

import java.util.Arrays;
import java.util.LinkedList;

public class MainLinkedList {

    public static void main(String[] args) {

        LinkedList_1 linkedList_1 = new LinkedList_1();
        linkedList_1.linkedList = new LinkedList<>();

        linkedList_1.linkedList.add(15.79);
        linkedList_1.linkedList.add(-0.258);
        linkedList_1.linkedList.add(0.0089);

        // вставить элемент в список на второе место
        linkedList_1.linkedList.add(1, 0.354);

        // удалить элемент из списка по индексу
        linkedList_1.linkedList.remove(0);

        // добавление элемента в начало списка
        linkedList_1.linkedList.addFirst(0d);

        // добавление элемента в конец списка
        linkedList_1.linkedList.addLast(777d);

        System.out.println("список: " + linkedList_1.linkedList);

        // превращаем список в массив
        Double[] doubles = linkedList_1.linkedList.toArray(new Double[0]);

        System.out.println("превратил список в массив" + Arrays.toString(doubles));

    }
}
