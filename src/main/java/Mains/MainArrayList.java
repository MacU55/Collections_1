package Mains;

import lists.ArrayList_1;

import java.util.*;

public class MainArrayList {


    public static void main(String[] args) {

        ArrayList_1 arrayList1 = new ArrayList_1();
        arrayList1.integerList = new ArrayList<>();

        arrayList1.integerList.add(18);
        arrayList1.integerList.add(25);
        arrayList1.integerList.add(33);
        arrayList1.integerList.add(78);
        arrayList1.integerList.add(95);
        arrayList1.integerList.add(-49);
        arrayList1.integerList.add(13);
        arrayList1.integerList.add(56);


        // удаление из списка по индексу
        arrayList1.integerList.remove(0);

        // удаление из списка по элементу, это вариант не рекомендуется

        for (Integer integer : arrayList1.integerList) {
            if (integer.equals(78)) {
                arrayList1.integerList.remove(integer);
                break;
            }
        }

        // удаление из списка по элементу, этот вариант рекомендуется
        Iterator<Integer> integerIterator = arrayList1.integerList.iterator();
        while (integerIterator.hasNext()) {
            Integer integer = integerIterator.next();
            if (integer == 13) {
                integerIterator.remove();
            }
        }

        // удаление из списка по элементу, с помощью лямбды
        arrayList1.integerList.removeIf(integer -> integer.equals(56));

        // изменение элемента по индексу
        arrayList1.integerList.set(1, 99);

        // добавление элемента в нужное место, например в индекс 2
        arrayList1.integerList.add(2, 100);

        // вывод на печать
        System.out.println("arrayList1= " + arrayList1.integerList);

        // найти индекс по элементу
        int i = arrayList1.integerList.indexOf(100);
        System.out.println("индекс по элементу 100: " + i);

        // проверить содержит ли список опредленный элемент
        System.out.println("содержит ли список элемент 25? : " + arrayList1.integerList.contains(25));

        // делаем из списка массив
        Integer[] arrayFromList = arrayList1.integerList.toArray(new Integer[0]);
        System.out.println("arrayFromList " + Arrays.toString(arrayFromList));
        System.out.println("arrayFromList length: " + arrayFromList.length);


        // переворачиваем список
        Collections.reverse(arrayList1.integerList);

        System.out.println("reversed arrayList1= " + arrayList1.integerList);


    }
}
